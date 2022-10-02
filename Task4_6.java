public class Task4_6 {
    public static double sigmoid(double x){
        return 1/(1+Math.pow(Math.E, -x));
    }
    public static double sigmoid_derivative(double x){
        return Math.pow(Math.E, x)/Math.pow(1+Math.pow(Math.E, x),2);
    }
    public static void main (String [] args){
        System.out.print(sigmoid(2)+"\n"+sigmoid_derivative(2)+"\n");
    }
}
