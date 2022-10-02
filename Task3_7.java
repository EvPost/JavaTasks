import java.util.Scanner;

public class Task3_7 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Print m1, m2,r:");
        double m1 = in.nextDouble();
        double m2 = in.nextDouble();
        double r = in.nextDouble();
        double y = 6.673*Math.pow(10, -11);
        double F = y*m1*m2/r/r;
        System.out.printf("F= %e", F);
    }
}
