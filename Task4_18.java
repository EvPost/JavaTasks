import java.util.Scanner;

public class Task4_18 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int s = 0;
        int a = 1;
        int i = 0;
        while(a!=0){
            System.out.printf("a[%d]= ",i);
            a = scanner.nextInt();
            i=i+1;
            s=s+a;
            
        }
        System.out.print("Sum= "+s);
        
    }
    
}
