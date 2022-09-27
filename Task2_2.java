import java.util.Scanner;

public class Task2_2 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("a=");
        int a = in.nextInt();
        System.out.println("b=");
        int b = in.nextInt();
        int na = (Integer. toString(a)).length();
        int nb = (Integer. toString(b)).length();
        System.out.print(na+"\n");
        System.out.print(nb+"\n");
        double c = 2.0 / (1.0 / a + 1.0 / b);
        System.out.print("середня гармонічна " + c + "\n");


    }
}
