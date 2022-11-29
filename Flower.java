package flowers;

public class Flower extends Item {

    boolean odour;
    float length;
    int color;

    void setOdour(boolean x){
        this.odour = x;
    }

    boolean getOdour(){
        return odour;
    }

    void setLength(Float x){
        this.length = x;
    }

    float getLength(){
        return length;
    }

    protected void setColor(int c){
        this.color = color;
    }

    public int getolor(){
        return color;
    }

    Flower(){
        super();
        odour = false;
        length = 0;
    }

    
}
