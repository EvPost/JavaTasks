import java.util.Scanner;
public class Task1_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String mas[] = new String[n];
        for(int i=0; i<n;i++){
            mas[i] = in.next();
        }
        for(String x : mas){
            System.out.println(x);
        }
    }
    
}
