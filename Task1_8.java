public class Task1_8 {
    public static void main(String[] args){
        long value = 1234567891234567L;
        System.out.printf("%d %x %b", value, value, value);
        System.out.println("Binary=" + Long.toBinaryString(value));
    }
}
