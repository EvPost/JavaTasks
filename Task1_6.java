public class Task1_6 {
    public static void main(String[] args){
        int[] mas = {777,12,34,567,789,120349,77,2003,9001};
        int len = String.valueOf(mas[0]).length();
        for(int i: mas){
            String s=String.valueOf(i);
            if(len>s.length()){
                len=s.length();
            }
        } 
        for(int i: mas){
            String s=String.valueOf(i);
            if(len==s.length()){
                System.out.println(i);
            }
        }
    }
}
