import java.util.Scanner;

public class Task3_7 {
    public static class Triangle{
        double x1, y1, x2, y2, x3, y3;

        public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.x3 = x3;
            this.y3 = y3;
        }

        public double square(){
            double a = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
            double b = Math.sqrt(Math.pow((x3-x2),2) + Math.pow((y3-y2),2));
            double c = Math.sqrt(Math.pow((x1-x3),2) + Math.pow((y1-y3),2));

            double p = (a+b+c)/2;
            double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            return s;
        }

        public double perimeter(){
            double a = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
            double b = Math.sqrt(Math.pow((x3-x2),2) + Math.pow((y3-y2),2));
            double c = Math.sqrt(Math.pow((x1-x3),2) + Math.pow((y1-y3),2));

            double p = a+b+c;
            return p;
        }

        public int typeOfTriangle(){
            double a = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
            double b = Math.sqrt(Math.pow((x3-x2),2) + Math.pow((y3-y2),2));
            double c = Math.sqrt(Math.pow((x1-x3),2) + Math.pow((y1-y3),2));

            if(a==b && b==c){return 1;}
            else if(a==b | a==c | b==c){return 2;}
            else if(c*c == a*a +b*b){return 3;}
            else{return 4;}
        }
    }

    public static void main(String[] args) {
        Triangle[] triangles = new Triangle[5];
        triangles[0] = new Triangle(0.0, 0.0, 1.0, 1.0, 1.0, 0.0);
        triangles[1] = new Triangle(2.0, 2.0, 0.0, 2.0, 0.0, 4.0);
        triangles[2] = new Triangle(2.0, 1.0, 3.0, -1.0, 3.0, 2.0);
        triangles[3] = new Triangle(0.0, 0.0, 2.0, 2.0, 6.0, 0.0);
        triangles[4] = new Triangle(1.0, 3.0, 4.0, 5.0, 6.0, -6.0);

        double s_min = 666.0;
        double s_max = 0.0;

        int equlTr = 0;
        int isoceTr = 0;
        int rightTr = 0;
        int scalentTr = 0;

        for(int i=1; i<5; i++){
            double s = triangles[i].square();
            if(s_max<s){s_max = s;}
            if(s_min>s){s_min = s;}

            int t = triangles[i].typeOfTriangle();
            if (t==1){equlTr+=1;}
            if (t==2){isoceTr+=1;}
            if (t==3){rightTr+=1;}
            if (t==4){scalentTr+=1;}
        }

        System.out.println("Максимальна площа: " + s_max + "\nМінімальна площа: " + s_min);
        System.out.println("Kількість рівностороніх: " + equlTr + "\nKількість рівнобедрених: " + isoceTr + "\nKількість прямокутних: " + rightTr + "\nKількість довільних: " + scalentTr);
    }
    
}
