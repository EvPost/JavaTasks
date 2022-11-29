import java.io.IOException;
import java.util.Scanner;

import Task5_1.Sentence;
import Task5_1.Word;

public class Main {

    public static int maxWordsAmount=32;
    public static int maxLinesAmount = 64;
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Sentence[] sentencesTmp = new Sentence[maxLinesAmount];
        String line = scanner.nextLine();
        int li = 0;

        while (!line.trim().isEmpty() && li<maxLinesAmount){
            String[] wordsStrArr = line.split(" ");
            Word[] wordsArr = new Word(wordsStrArr[i]);

            for(int i=0; i<wordsStrArr.length;i++){
                wordsArr[i] = new Word(wordsStrArr[i]);
            }

            Sentence newSentence = new Sentence(wordsArr);
            sentencesTmp[li] = newSentence;
            li++;
            line = scanner.nextLine();
        }

        Sentence[] sentencesFinal = new Sentence[li];
        for(int i=0; i<li; i++){
            sentencesFinal[i] = sentencesTmp[i];
        }
        Text text = new Text("TextHeader", sentencesFinal);
        System.out.println("\n"+text);
    }
}
