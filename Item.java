package flowers;

public abstract class Item {

    private String name;
    private float price;
    int time;

    protected void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    protected void setPrice(float price){
        this.price = price;
    }

    public float getPrice(){
        return price;
    }

    protected void setTime(int time){
        this.time = time;
    }

    public int getTime(){
        return time;
    }

    Item(){name="";}

    @Override
    public String toString(){
        return name;
    }
        
}
