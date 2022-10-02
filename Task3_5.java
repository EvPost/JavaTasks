public class Task3_5 {
    public static void main (String [] args){
        int n = 5;
        int x[] = {1,2,3,4,5};
        double y[] = {1.2,2.3,3.4,4.5,5.6};
        System.out.print("x |  ");
        for(int i=0; i<n; i++){
            System.out.print(x[i] + " | ");
        }
        System.out.print("\n- | ");
        for(int i=0; i<n; i++){
            System.out.print("---|");
        }
        System.out.print("\ny | ");
        for(int i=0; i<n; i++){
            System.out.print(y[i] + "|");
        }
    }
    
}
