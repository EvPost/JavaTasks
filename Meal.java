package Shop;

public class Meal extends Item{

    float calor;

    Meal(){
        super();
        this.type = "kg";
        this.calor = 0;
    }

    Meal(float price, String name){
        super(price, name, "kg");
    }

    public float getCalor(){
        return calor;
    }

    public void setCalor(float calor){
        this.calor = calor;
    }
    
}
