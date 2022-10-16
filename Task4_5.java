import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = scanner.nextInt();
        int c = 0;
        for(int i =1; i<1000; i++){
            if(i>99){
                System.out.print(" "+i);
            }
            else if(i>9){
                System.out.print("  "+i);
            }
            else{
                System.out.print("   "+i);
            }
            c = c+1;
            if(c==n){
                System.out.print("\n");
                c=0;
            }

        }
    }
}
