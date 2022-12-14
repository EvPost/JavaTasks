import java.util.Scanner;


/* 
Postulga Evgen kompmat1
Project №4 "Поліном"

Створіть клас Поліном(Polynome), який реалізує інтерфейс числа та ще має операції: 
Значення поліному, похідна, інтеграл(визначений та невизначений). 
На вхід конструкторів подавати масив або список чисел, або нічого (нульовий полном) або інший поліном.
Створить клас Раціональне Ч-ло(Rational), що реалізє інтерфейс Числа та додати можливість створювати поліноми від Rational. 
Реалізувати всі стандартні математичні операції для Rational. 
Створити функції для розв’язання лінійних та квадратних рівнянь в Rational.

*/

public class pr_post {

    public static class Rational{ // клас Раціональне Ч-ло
        private int n;  // знаменник
        private int m; // чисельник

        Scanner scan = new Scanner(System.in);

        public Rational(int m, int n){
            if(n ==0) System.exit(1);
            this.m = m;
            this.n = n;
        }

        public int getM(){ // повертає чисельник
            return m;
        }

        public int getN(){ // повертає знаменник
            return n;
        }
        
        public double getValue(){ // повертає значення числа
            return (double) m/n;
        }

        public void add(Rational other){ // додавання
            if(this.n == other.n){
                this.m+=other.m;
            }
            else{
                int m1 = this.m;
                int n1 = this.n;

                this.m = m1*other.n + other.m*n1;
                this.n = n1*other.n;
            }

            update();
        }

        public void subtract(Rational other){ // відніманння
            if(this.n == other.n){
                this.m-=other.m;
            }
            else{
                int m1 = this.m;
                int n1 = this.n;

                this.m = m1*other.n - other.m*n1;
                this.n = n1*other.n;
            }
            update();
        }

        public void multiply(Rational other){ // множення 
            this.m *= other.m; 
            this.n *= other.n;

            update();
        }

        public void divide(Rational other){ // ділення
            this.m *= other.n;
            this.n *= other.m;

            update();
        }

        public void powR(int a){   // піднесення до степення
            this.m = (int) Math.pow(this.m, a);
            this.n = (int) Math.pow(this.n, a);

            update();
        }

        public int gcd(){ // НСД
            int a = m, b =n;

            while (a!=b){
                if(a>b){
                    a-=b;
                }
                else{
                    b-=a;
                }
            }
            return b;
        }

        public void update(){ // скорочення
            if(m%n == 0){
                this.m = m/n;
                this.n = 1;
            }
            else if (gcd()>1){
                int var_gcd = gcd();
                this.m /= var_gcd;
                this.n /= var_gcd;
            }
        }

        @Override
        public String toString(){
            return m + "/" + n;
        }
    }

    public static class Polynomial{ // клас поліном
        private Rational[] coefficients;
        private int size;

        Polynomial(){}
        
        Polynomial(int size){
            coefficients = new Rational[size];
            this.size = size;
            for (int i = 0; i<size; i++){
                this.coefficients[i] = new Rational(0, 1);
            }
        }

        Polynomial(Integer... argArray){
            size = argArray.length/2;
            coefficients = new Rational[size];
            for(int i=0;i<argArray.length;i+=2){
                int m1, n1;
                m1=argArray[i];
                n1=argArray[i+1];
                coefficients[size-i/2-1] = new Rational(m1, n1);
            }
        }

        public Rational calc(Rational x){ // значення поліному
            Rational result = coefficients[0];
            for(int i = 1; i<size; i++){
                //System.out.println(result);
                Rational a = coefficients[i];
                a.multiply(x);
                result.add(a);
                x.multiply(x);
            }
            return result;
        }

        public void derivative(){ // похідна
            for (int i=1; i<size; i++){
                Rational a =  new Rational(i, 1);
                coefficients[i].multiply(a);
                coefficients[i-1] = coefficients[i];
            }
            size=size-1;
        }

        public void integral(){ // інтеграл невизначений
            for (int i=size-1; i>=0; i--){
                Rational a =  new Rational(i+1, 1);
                coefficients[i].divide(a);
                coefficients[i+1] = coefficients[i];
            }
            Rational a =  new Rational(0, 1);
            coefficients[0]=a;
            size=size+1;
        }

        
        public Rational definiteIntegral(Rational a, Rational b){ // інтеграл визначений 
            Rational result = new Rational(0, 1);
            for (int i=size-1; i>=0; i--){
                result = result.add(coefficients[i].multiply(a.powR(i)).divide(Rational((i+1), 1)));
                result = result.subtract(coefficients[i].multiply(b.powR(i)).divide(Rational((i+1), 1)));
            }
            return result;
        }


        @Override
        public String toString(){
            String out = "";
            for(int i = size-1; i>=0; i--){
                if(coefficients[i].m == 0) continue;
                out += coefficients[i] + "x^" + i + " + ";
            }

            out = out.substring(0, out.length() - 3);
            return out;
        }
    }

    public static Double[] sqrEqn(Polynomial p){ // розв’язання квадратних рівнянь
        Double[] x = new Double[2];
        if(p.size==3){
            Double d = p.coefficients[1].getValue()*p.coefficients[1].getValue() - 4*p.coefficients[0].getValue()*p.coefficients[2].getValue();
            if(d<0){
                System.out.println("The equation has no solutions");
            }
            else{
                x[0] = -p.coefficients[1].getValue() - Math.sqrt(d)/(2*p.coefficients[2].getValue());
                x[1] = -p.coefficients[1].getValue() + Math.sqrt(d)/(2*p.coefficients[2].getValue());
                System.out.println("Solutions of the equation: x1 = "+x[0]+" , x2 = "+x[1]);
            }
        }
        else{
            System.out.println("The equation is not square"); 
        }
        return x;
    }

    public static Rational linEqn(Polynomial p){ //розв’язання лінійних рівнянь
        if(p.size==2){
            p.coefficients[0].divide(p.coefficients[1]);
            Rational a =  new Rational(-1,1);
            a.multiply(p.coefficients[0]);
            System.out.println("Solution of the equation: x = " + a);
            return a;
        }
        else{
            System.out.println("The equation is not linear"); 
            return null;
        }
    }

    public static void testCalculating(){
        System.out.println("-------------TEST CALKULATING-------------");
        //Polynomial poly1 = new Polynomial(1, 3, -1, 8, 2, 5, 2, 3, 3, 4);
        //Polynomial poly2 = new Polynomial(-1, 4, 3, 5, 4, 5, 2, 3, -1, 2);
        Polynomial poly1 = new  Polynomial(1, 2, 2, 1, 2, 5);
        Polynomial poly2 = new  Polynomial(2, 3, 2, 1, 3, 4);
        System.out.println(poly1);
        Rational a =  new Rational(1,3);
        System.out.println("x = 1/3: "+ poly1.calc(a));
        System.out.println(poly2);
        Rational b =  new Rational(2,3);
        System.out.println("x = 2/3: "+ poly2.calc(b));
        System.out.println("\n-----------------------------------------");

    }

    public static void testDerivative(){
        System.out.println("-------------TEST DERIVATIVE-------------");
        Polynomial poly1 = new Polynomial(2, 1, 2, 3, 2, 5, 2, 3, 3, 4);
        Polynomial poly2 = new Polynomial(2, 3, 1, 2, 4, 5, 2, 3, -1, 2);
        System.out.println(poly1);
        poly1.derivative();
        System.out.println(poly1);
        System.out.println(poly2);
        poly2.derivative();
        System.out.println(poly2);
        System.out.println("\n-----------------------------------------");

    }

    public static void testIntegraling(){
        System.out.println("-------------TEST INTEGRALING-------------");
        Polynomial poly1 = new Polynomial(2, 5, 2, 3, 3, 4);
        Polynomial poly2 = new Polynomial(2, 3, 1, 2, 4, 5, 2, 3, -1, 2);
        System.out.println(poly1);
        poly1.integral();
        System.out.println(poly1);
        System.out.println(poly2);
        poly2.integral();
        System.out.println(poly2);
        System.out.println("\n-----------------------------------------");

    }

    public static void testSqrEqn(){
        System.out.println("-------------TEST QUEDRATIC EQUATION-------------");
        Polynomial poly1 = new  Polynomial(1, 2, 2, 1, 2, 5);
        Polynomial poly2 = new  Polynomial(2, 3, 2, 1, 3, 4);
        System.out.println(poly1);
        sqrEqn(poly1);
        System.out.println(poly2);
        sqrEqn(poly2);
        System.out.println("\n-----------------------------------------");
    }

    public static void testLinEqn(){
        System.out.println("-------------TEST LINEAR EQUATION-------------");
        Polynomial poly1 = new Polynomial(9,5,2,3);
        Polynomial poly2 = new  Polynomial(7, 3, 5, 4);
        System.out.println(poly1);
        linEqn(poly1);
        System.out.println(poly2);
        linEqn(poly2);
        System.out.println("\n-----------------------------------------");
    }
    public static void main(String[] args) {
        testCalculating();
        testDerivative();
        testSqrEqn();
        testLinEqn();
    }

}