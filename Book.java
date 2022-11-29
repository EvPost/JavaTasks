package Task7_1;

public class Book implements Edition {

    String authors;
    String name;
    int pages;

    @Override
    public void printb(){
        System.out.println("Book is printing");
    }

    @Override
    public void advertise(){
        System.out.println("Book is advertised");
    }

    public void popular(){
        System.out.println("Book now is very popular");
    }

    
}
