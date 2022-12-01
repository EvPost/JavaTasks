import java.util.Scanner;

public class Task2_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int maxC = 0, tmp = 0;

        for(int i = 0;i<s1.length(); i++){
            char ch = s1.charAt(i);
            if(ch>='0' && ch <= '9'){
                tmp++;
                if(tmp>maxC){
                    maxC = tmp;
                }
            }
            else{
                tmp = 0;
            }   
        }
        System.out.println(maxC); 
    }
}
