public class Task2_7 {
    public static void main (String [] args){
        if(args.lenght<=0){
            System.out.println("No commandline arguments");
            return;
        }
        double dobutok = 0;
        for(String a: args){
            double x = Double.parseDouble(a);
            dobutok = dobutok * x;
        }

        System.out.print("dobutok=" + dobutok + "\n");
    }
}
