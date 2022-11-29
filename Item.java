package Shop;

public class Item {
    float price;
    String name;
    String type;

    Item(){}

    Item(Float price, String name, String type){
        this.price = price;
        this.name = name;
        this.type = type;
    }

    public float getPrice(){
        return price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    @Override
    public String toString(){
        return "Item "+ name + ", price " + price;
    }
    
}
