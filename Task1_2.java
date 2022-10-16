import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input line: ");
        //String line0 = in.nextLine();
        String line = in.nextLine();
        String[] parsed = line.split(" ");

        int Max = Integer.parseInt(parsed[0]);
        int Min = Integer.parseInt(parsed[0]);
        for(String p: parsed){
            System.out.println("p= "+ p);
            int val = Integer.valueOf(p);
            if(val>Max){
                Max = val;
            }
            if(val<Min){
                Min = val;
            }
        }
        System.out.println("Max " + Max);
        System.out.println("Min " + Min);

    }
}
