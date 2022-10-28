public class Initials {
    
    static String str;

    String s1 = "blala";
    String s2;

    Initials(){
        System.out.print(s1);
        s2 = "dfghjtuyuhrfkd";
    }

    Initials(String r){
        System.out.print(r);
        s2 = "dfghjtuyuhrfkd";
    }

    public static void main(String[] args){
        System.out.println("String=" + str);
        Initials r1 = new Initials();
        Initials r2 = new Initials("qwerty");
    }
}
