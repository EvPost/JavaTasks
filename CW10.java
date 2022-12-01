import java.util.Locale;
import java.util.Scanner;

public class CW10{
    public static void main(String[] args) {
        String s1;
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        s1 = s1.replaceAll("^+| +$|( )", "$1");

        // Task1_1
        String[] words = s1.split(" ");
        System.out.println("Words count: "+words.length);

        // Task1_2
        for(int i = words.length - 1;i>=0; i--){
            System.out.print(words[i]+" ");
        }
        System.out.println();

        // Task1_3
        for(int i = 0;i<words.length; i++){
            if(words[i].equals("small")){
                words[i] = "very large";
            }
            System.out.print(words[i]+" ");
        }
        System.out.println();

        // Task1_4
        s1 = s1.replaceAll(" a ", " ");
        s1 = s1.replaceAll(" an ", " ");
        words = s1.split(" ");
        for(String word: words){
            System.out.print(word+" ");
        }
        System.out.println();


        // Task1_5
        
        s1 = s1.replaceAll("small", "verry small");
        s1 = s1.replaceAll("large", "verry large"); 
        words = s1.split(" ");
        for(String word: words){
            System.out.print(word+" ");
        }
        System.out.println();

        // Task1_6
        StringBuffer sb = new StringBuffer(s1);
        sb.append(", that we use to ilustrate the methods of class StringBuffer");
        System.out.println(sb.toString());

        // Task1_7
        int cnt_words = words.length, cnt_symbols = s1.length();
        int cnt_znaks = 0, cnt_sentence = 0;
        for(int i = 0; i<s1.length();i++){
            if(s1.charAt(i)==',' || s1.charAt(i)==':' || s1.charAt(i)==';'){
                cnt_znaks++;
            }
            if(s1.charAt(i)=='.' || s1.charAt(i)=='!' || s1.charAt(i)=='?'){
                cnt_znaks++;
                cnt_sentence++;
            }
        }
        System.out.println("Symbol "+cnt_symbols);
        System.out.println("Words "+cnt_words);
        System.out.println("Znaks "+cnt_znaks);
        System.out.println("Sentences "+cnt_sentence);

        // Task1_8
        String enter_word = sc.nextLine();
        for(String word: words){
            if(enter_word.toLowerCase(Locale.ROOT).equals(word.toLowerCase(Locale.ROOT))){
                System.out.println("Yes");
                return;
            }
        }

    }
}