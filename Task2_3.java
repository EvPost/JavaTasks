public class Task2_3 {
    public static String binchar(char x){
        //int y = (int)(x);
        return Integer.toBinaryString(x);
    }
    public static void main(String[] args){
        char x ='q';
        System.out.println("Char " + x + " in binary " + binchar(x)+"\n" );

    }
}
