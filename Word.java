package Task5_1;

public class Word {
    String word;

    Word() {word = "";}
    Word(String word){this.word = word;}

    int getLength(){return word.length();}

    @Override
    public String toString(){return word;}

    @Override
    public int hashCode(){
        int res = 0;
        final int p = 17;
        int tmp = 1;
        for (int i=0; i<getLength();i++){
            res += tmp*word.charAt(i);
            tmp *= p;
        }
        return res;
    }

    @Override
    public boolean equals(Word other){
        return this.hashCode()==other.hashCode();
    }


}
