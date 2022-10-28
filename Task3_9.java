public class Task3_9 {

    void method1() {
        System.out.println("I do nothing"); 
    }

    void method2() { 
        method1();
        this.method1();
    }
    public static void main(String[] args){
        Task3_9 obj = new Task3_9();

        obj.method2();
    }
    
}
