package Task7_1;


public class Ebcyclopedia extends Book{

    protected String genre;
    protected float price;
    Ebcyclopedia(String name, String genre, float price){
        this.name = name;
        this.genre = genre;
        this.price = price;
    }


    @Override
    public void printb(){
        System.out.println("Ebcyclopedia "+this.name+" is printing");
    }

    @Override
    public void advertise(){
        System.out.println("Ebcyclopedia "+this.name+" is advertised");
    }

    @Override
    public void popular(){
        System.out.println("Ebcyclopedia "+this.name+" is very popular");
    }

    @Override   
    public void toString(){
        return "Directory "+this.name+" has" + this.genre +" genre";
    }
}
