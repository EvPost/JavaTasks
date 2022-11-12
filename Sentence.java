package Task5_1;

public class Sentence {

    Word[] sentence;

    Sentence(){sentence = new Word[Main.maxWordsAmount];}
    Sentence(Word[] words){sentence = words.clone();}
    
    void capitalizeFirst(){
        if (sentence[0] == null) return;
        sentence[0].word = sentence[0].word.substring(0, 1).toUpperCase();
    }

    @Override
    public String toString(){
        if (sentence[0] == null) return "<empty>";
        capitalizeFirst();

        String s = sentence[0].toString();
        for(int i=1; i<sentence.length;i++){
            s += " " + sentence[i];
        }
        return s;
    }

    @Override
    public int hashCode(){
        int res = 0xABBA;
        for(int i=0; i<sentence.length;i++){
            res^=sentence[i].hashCode();
        }
        return res;
    }

    @Override
    public boolean equals(Sentence s){
        if(s.sentence.length != this.sentence.length){
            return false;
        }
        for(int i=0; i<s.sentence.length; i++){
            if(!this.sentence[i].equals(s.sentence[i])){
                return false;
            }
        }
        return true;
    }
}
