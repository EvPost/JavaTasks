import java.util.Scanner;

public class Task2_13 {

    public static int printMatrix(int matr[][], int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" " + matr[i][j]);
            }
            System.out.println(" ");
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        int matr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                matr[i][j] = scan.nextInt();
            }
        }
        int q = printMatrix(matr,n);
        System.out.println("\n");
        System.out.println(matr[1][n-1]+"\n");

        int matr1[][] = new int[n][n]; 

        for(int i=0;i<n;i++){
            int a = 0;
            for(int j=0; j<n;j++){
                if(matr[i][j]!=0){
                    matr1[i][a] =  matr[i][j];
                    a=a+1;
                }
            }
            for(int j=a; j<n;j++){
                matr1[i][j]=0;
            }
        }
        q = printMatrix(matr1,n);
    }    
}
