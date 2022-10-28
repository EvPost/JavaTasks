import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class SqrMatrix {

    static Random rnd = new Random();
    static Scanner scan = new Scanner(System.in);
    private int n;

    private double matr[][];

    public void setN(int n){
        this.n = n;
        matr = new double[n][n];
    }

    SqrMatrix(int n){
        setN(n);
    }

    int randMatrix(){
        for(int i=0;i<this.n;i++){
            for(int j=0; j<this.n;j++){
                matr[i][j] = (rnd.nextDouble()- 0.5)*2*this.n;
            }
        }
        return 0;
    }

    int inputMatrix(){
        for(int i=0;i<this.n;i++){
            for(int j=0; j<this.n;j++){
                matr[i][j] = scan.nextDouble();
                if(matr[i][j]<-n || matr[i][j]>n){
                    return -1;
                }

            }
        }
        return 0;
    }

    static int[] sortedIndex(double[] mas){
        int n = mas.length;
        int[] index = new int[n];
        for(int i=0;i<n;i++){
            index[i] = i;
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(mas[i]>mas[j]){
                    double tmp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = tmp;
                    int ind = index[i];
                    index[i] = index[j];
                    index[j] = ind;
                }
            }
        }
        return index;

    }

    void change(int[] index){
        for(int i=0;i<this.n;i++){
            for(int j=0;j<this.n;j++){
                double tmp = matr[j][i];
                matr[j][i] = matr[j][index[i]];
                matr[j][index[i]] = tmp;
            }
        }
    }

    void transportMatrix(){
        for(int i=0;i<this.n;i++){
            for(int j=0;j<i;j++){
                double tmp = matr[j][i];
                matr[j][i] = matr[i][j];
                matr[i][j] = tmp;
            }
        }
    }

    double euclideanNorm(){
        double s = 0;
        for(int i=0;i<this.n;i++){
            for(int j=0; j<this.n;j++){
                s = s +  matr[i][j]* matr[i][j];
            }
        }

        return Math.sqrt(s);
    }

    void MatrixRot90(){
        for(int i=0;i<this.n;i++){
            for(int j=0;j<i;j++){
                double tmp = matr[j][i];
                matr[j][i] = matr[i][j];
                matr[i][j] = tmp;
            }
        }

        for(int i=0;i<this.n;i++){
            for(int j=0;j<this.n/2;j++){
                double tmp = matr[i][j];
                matr[i][j] = matr[i][this.n-j-1];
                matr[i][this.n-j-1] = tmp;
            }
        }
    }


    void printMatrix(){
        for(int i=0;i<this.n;i++){
            for(int j=0;j<this.n;j++){
                System.out.print(" " + matr[i][j]);
            }
            System.out.println(" ");
        }
    }

    

    public static void main(String[] args){
        int n;
        n = scan.nextInt();
        SqrMatrix sm = new SqrMatrix(n);
        sm.randMatrix();
        sm.printMatrix();
        System.out.println(" ");
        sm.MatrixRot90();
        sm.printMatrix();
        System.out.println(sm.euclideanNorm());
        sm.transportMatrix();
        sm.printMatrix();
        int k = scan.nextInt();
        int ind[] = SqrMatrix.sortedIndex(sm.matr[k]);
        sm.change(ind);
        sm.printMatrix();
    }
}
