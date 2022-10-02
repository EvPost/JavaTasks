public class Task4_4 {
    public static double plosha(double a, double b, double c){
        double p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
    public static void main (String [] args){
        double s = plosha(3, 4, 5);
        System.out.println("S="+s);
    }

}
