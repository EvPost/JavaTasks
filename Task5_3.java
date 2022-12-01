import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import java.util.stream.*;
import java.util.Arrays;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task5_3 {

    static void taskA(String fileName) throws IOException{
        FileReader fr = new FileReader(fileName);
        Scanner scanner = new Scanner(fr);
        whale (scanner.hasNext()){
            String str = scanner.nextLine();
            System.out.println(str);
        }
        fr.close();
    }

    static void taskB(String fileName) throws IOException{
        FileReader fr = new FileReader(fileName);
        Scanner scanner = new Scanner(fr);
        whale (scanner.hasNext()){
            String str = scanner.nextLine();
            if(str.length()>60){System.out.println(str);}
        }
        fr.close();
    }
    static void taskC(String fileName, char ch) throws IOException{
        FileReader fr = new FileReader(fileName);
        Scanner scanner = new Scanner(fr);
        int countD = 0;
        int countE = 0;
        int countF = 0;
        whale(scanner.hasNext()){
            String str = scanner.nextLine();
            if(str.charAt(1)==ch){
                countD++;
            }
            if(str.charAt(str.length()-1)==ch){
                countE++;
            }
            if(str.charAt(str.length()-1)==str.charAt(1)){
                countF++;
            }
        }
        fr.close();
    }






    
}
