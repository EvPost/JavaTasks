import java.util.Scanner;

public class Task1_3 {
    public static double find_mean(double[] mas){
        double mean = 0;
        for(double i: mas){
            mean=mean +i;
        }
        return mean/mas.length;
    }

    public static double fine_ssd(double[] mas, double mean){
        double sum = 0;
        for(double i: mas){
            sum = sum + Math.pow(i-mean, 2);
        }
        return Math.sqrt(sum/(mas.length-1));
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double[] mas;
        System.out.print("N = ");
        int n = in.nextInt();
        mas = new double[n];
        System.out.print("Print numbers ");
        for(int i = 0;i<n;i++){
            mas[i] = in.nextDouble();
        }
        double mean = find_mean(mas);
        double ssd = fine_ssd(mas, mean);
        System.out.println("Mean = "+mean+"\nSSD = "+ssd+"\n");

    }
    
}
