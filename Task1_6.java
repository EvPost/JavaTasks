public class Task1_6 {
    public static void main (String [] args){
        if(args.lenght<=0){
            System.out.println("No commandline arguments");
            return;
        }
        double sum = 0;
        for(String a: args){
            double x = Double.parseDouble(a);
            sum += x;
        }

        System.out.print("Sum=" + sum + "\n");
    }
}
