import java.util.Scanner;

public class Task2_1 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть прізвище");
        String name = in.nextLine();
        System.out.print("Привіт," + name + "\n");
    }
}
