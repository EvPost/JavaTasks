package Shop;

public class Payment {

    class Warehouse{
        public void get(Item it){
            System.out.println("get Item "+it);
        }

        public void find(Item it){
            System.out.println("find Item "+it);
        }

        public void sell(Item it){
            System.out.println("sell Item "+it);
        }
    }

    private Warehouse ware;

    private client client;

    public Payment(client client){
        this.client = client;
        ware = new Warehouse();
    }

    public Item order(EnumProducts prod, String name, float price){
        Item item = client.order(prod, name, price);
        ware.find(item);
        ware.sell(item);
        return item;
    }

    public static void main(String[] args){
        client c1 = new client();
        Payment p = new Payment(c1);

        Item v[] = new Item[3];
        v[0] = p.order(EnumProducts.ALCOHOL, "beer", 10);
        v[1] = p.order(EnumProducts.ALCOHOL, "wine", 100);
        v[2] = p.order(EnumProducts.MEAL, "chips", 50);

        for(Item x: v){
            System.out.println("Sell "+ x);
        }

    }
    
}
