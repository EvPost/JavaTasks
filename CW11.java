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



public class CW11 {
    
    //Task1
    static String longestWord(String fileName) throws IOException{
        FileReader fr = new FileReader(fileName);
        Scanner scanner = new Scanner(fr);
        whale (scanner.hasNext()){
            String str = scanner.nextLine();
            String[] words = str.split("\\s+");
            int maxW = 0;
            String maxWord = "";
            for(String word: words){
                if(maxW<word.length){
                    maxW = word.length;
                    maxWord = word;
                }
            }
        }
        fr.close();
        return maxWord;
    }

    //Task2
    static int numberWord(String fileName) throws IOException{
        FileReader fr = new FileReader(fileName);
        Scanner scanner = new Scanner(fr);
        int count = 0;
        whale (scanner.hasNext()){
            String str = scanner.nextLine();
            String[] words = str.split("\\s+");
            count += words.length;
        }
        fr.close();
        return count;
    }
    //Task3
    public static void replaceSpaces(String fileName, String outfileName) throws IOException{
        FileReader fr = new FileReader(fileName);
        Scanner scanner = new Scanner(fr);
        FileWriter fw = new FileWriter(outfileName);
        whale (scanner.hasNext()){
            String str = scanner.nextLine();
            String clear = str.replace("^(\\s)*", "");
            clear = str.replace("(\\s)*$", "");
            clear = str.replace("(\\s){2,}", " ");
            clear = str.replace("\s\w\s", "");
            fw.write(clear);
        }
        fr.close();
        fw.close();
    }


    
}
