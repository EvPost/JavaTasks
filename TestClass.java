package test_packege;

public class TestClass {
    public double d;
    int t;
    protected String line;
    public void setD(double d){
        this.d = d;
    }

    protected void setT(int t){
        this.t = t;
    }
}
class second{
    public static void main(String[] args){
        TestClass test = new TestClass();
        test.line = "smth";
        test.setD(0);
    }
}
