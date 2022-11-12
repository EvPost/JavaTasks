import java.util.Scanner;

public class Task3_1 {

    public static class Fraction{
        int n, m;

        public Fraction(int m, int n){
            if(n ==0) System.exit(1);
            this.m = m;
            this.n = n;
        }

        public double getValue(){
            return (double) m/n;
        }

        public void add(Fraction other){
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

        public void subtract(Fraction other){
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

        public void multiply(Fraction other){
            this.m *= other.m;
            this.n *= other.n;

            update();
        }

        public void divide(Fraction other){
            this.m *= other.n;
            this.n *= other.m;

            update();
        }

        public int gcd(){
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

        public void update(){
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

    public static void main(String[] args) {
        Fraction[] fractions = new Fraction[5];
        fractions[0] = new Fraction(2, 3);
        fractions[1] = new Fraction(3, 5);
        fractions[2] = new Fraction(7, 8);
        fractions[3] = new Fraction(11, 10);
        fractions[4] = new Fraction(2, 3);

        System.out.println(fractions[0]);
        for(int i=1; i<5; i++){
            fractions[i].add(fractions[i-1]);
            System.out.println(fractions[i]);
        }
    }

    
}
