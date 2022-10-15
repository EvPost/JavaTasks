class Dog{
    String name;
    String say;

    Dog(){}
    Dog(String name, String say){
        this.name = name;
        this.say = say;
    }

    void how(){
        System.out.println(say);
    }
    public boolean equals(Dog d){
        return name.equals(d.name);
    }
}
public class Task1_6 {
    public static void main(String[] args){

        Dog scruffy = new Dog("Scruffy", "Wurf");
        Dog ralf = new Dog("Ralf", "Ruff");

        scruffy.how();
        ralf.how();

        Dog dog;
        dog = scruffy;
        dog.how();
        dog = ralf;
        dog.how();

        if(dog==ralf){
            System.out.println("same dogs");
        }
        else{
            System.out.println("different dogs");
        }
        if(ralf.equals(dog)){
            System.out.println("same dogs");
        }
        else{
            System.out.println("different dogs");
        }

    }

    
}
