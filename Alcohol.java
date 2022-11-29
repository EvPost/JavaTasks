package Shop;

public class Alcohol extends Item {
    int ob;

    Alcohol(){
        this.type = "liquid";
    }

    Alcohol(float price, String name){
        super(price, name, "liquid");
    }

    public int getOb(){
        return ob;
    }

    public void setOb(int ob){
        this.ob = ob;
    }
    
}
