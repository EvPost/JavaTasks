
public class Task3_11 {
    public static boolean kvadrat(double x11, double y11, double x12, double y12,double x21, double y21, double x22, double y22){
        if(x12<x21 | y12<y21 | x11>x22 | y11>y22){
            System.out.println("квадрати не пересікаються");
            return false;
        }
        else{
            if(x11<=x21 & x12>=x22){
                System.out.println("Координати лівого нижнього :" +x21+" "+y21);
                System.out.println("Координати правого верхнього :" +x22+" "+y22);
            }
            if(x11<=x21 & x12<=x22){
                System.out.println("Координати лівого нижнього :" +x21+" "+y21);
                System.out.println("Координати правого верхнього :" +x12+" "+y12);
            }
            if(x11>=x21 & x12<=x22){
                System.out.println("Координати лівого нижнього :" +x11+" "+y11);
                System.out.println("Координати правого верхнього :" +x12+" "+y12);
            }
            if(x11>=x21 & x12>=x22){
                System.out.println("Координати лівого нижнього :" +x11+" "+y11);
                System.out.println("Координати правого верхнього :" +x22+" "+y22);
            }

            return true;
        }

    }
    public static void main(String[] args){
        boolean a =  kvadrat(1.0, 1.0, 4.0, 4.0, 3.0, 3.0, 5.0, 5.0);
        boolean b = kvadrat(1.0, 1.0, 4.0, 4.0, 5.0, 5.0, 7.0, 7.0);

    }
    
}
