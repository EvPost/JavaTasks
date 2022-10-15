import java.util.Random;

public class Task3_2 {
    static Random rnd = new Random();
    public static void main(String[] args){
        int limit = rnd.nextInt(10);
        int count = 0;

        System.out.println(limit);
        for(int i=0; i<25; i++){
            int x = rnd.nextInt(25);
            if(x<limit){
                count++;
            }
            if(x==limit){
                System.out.print("Namber " + x + " equal\n");
            }
        }
        System.out.print("C="+count);
    }   
    
}
