import java.util.Scanner;

public class Task3_19 {
    public static boolean arefViraz(String str){
        int tmp = 0;
        for(int i = 0;i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '('){tmp++;}
            if(ch == ')'){tmp--;}
            if(tmp<0){return false;}
        }
        if(tmp!=0){return false;}
        return true;
    }
    public static void main(String[] args) {
        String str1 = "2*((a + b)^2-9)";
        String str2 = "max((c)^2)-exp(10))";
        System.out.println(arefViraz(str1)); 
        System.out.println(arefViraz(str2)); 

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(arefViraz(s1)); 
    }
}
