import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int mask = 1 << m;
        int res = (n | mask) != n ? n | mask : n & ~mask;
        System.out.println(res + "\n");
    }

    
}
