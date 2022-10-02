public class Task3_24 {
    public static double kut(double a, double b, double c){
        System.out.println("кути в радіанах");
        double k_a = Math.acos((b*b+c*c-a*a)/(2*b*c));
        double k_b = Math.acos((a*a+c*c-b*b)/(2*a*c));
        double k_c = Math.acos((b*b+a*a-c*c)/(2*b*a));
        //System.out.print(b*b+c*c-a*a);
        System.out.print(k_a+"\n"+k_b+"\n"+k_c+"\n");
        System.out.println("кути в градусах");
        System.out.print(k_a*180/Math.PI+"\n"+k_b*180/Math.PI+"\n"+k_c*180/Math.PI+"\n");
        return k_a+k_b+k_c;
    }

    public static void main (String [] args){
        double k = kut(3,4,5);
    }
}
