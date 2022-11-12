package Task5_1;

public class Text {
    Sentence[] text;
    String header;

    Text(){text = new Sentence[Main.maxLinesAmount];}
    Text(Sentence[] sentences){text = sentences.clone();}
    Text(String header, Sentence[] sentences){
        this.header = header;
        this.text = sentences.clone();
    }

    Sentence[] getSentencesArray(){
        return text;
    }

    void setHeader(String h){
        header = h;
    }
    
    @Override
    public String toString(){
        String txt = "";

        if (header != null){
            System.out.println("\t\t\t\t*** " + header + " ***");
        }
        for(Sentence sentence: text){
            txt += sentence + ".\n";
        }
        return txt;
    }

    @Override
    public int hashCode(){
        int res = 0;
        final int p = 31;
        int tmp = header.hashCode();
        for (Sentence s: this.text){
            res += tmp*s.hashCode();
            tmp *= p;
        }
        return res;
    }

    @Override
    public boolean equals(Text s){
        if(!header.equals(s.header)) return false;

        if(s.text.length != this.text.length){
            return false;
        }
        for(int i=0; i<s.text.length; i++){
            if(!this.text[i].equals(s.text[i])){
                return false;
            }
        }
        return true;
    }
}
