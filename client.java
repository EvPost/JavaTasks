package Shop;

public class client {

    public Item order(EnumProducts prod, String name, float price){
        Item product = null;
        switch (prod){
            case ALCOHOL:
            product = new Alcohol(price, name);
            break;
            case MEAL:
            product = new Meal(price, name);
            default:
            System.out.println("No such item!!");
            break;
        }
        return product;
    }
    
}
