import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        m = m << 1;
        while(m!=0){
            m = m >> 1;
            System.out.printf("Number %d in binary %s\n", m, Integer.toBinaryString(m));

        }
    }
    
}
