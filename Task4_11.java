import java.util.Scanner;

public class Task4_11 {
    public static class Interval{
        private double a;
        private double b;
        private boolean bool_a;
        private boolean bool_b;

        Scanner scan = new Scanner(System.in);

        Interval(){}

        public Interval(double a, double b, boolean bool_a, boolean bool_b){
            if(a > b) System.exit(1);
            this.a = a;
            this.b = b;
            this.bool_a = bool_a;
            this.bool_b = bool_b;
        }
        public double getA(){
            return a;
        }

        public double getB(){
            return b;
        }

        public int getBool_a(){
            return bool_a;
        }

        public int getBool_b(){
            return bool_b;
        }

        public void crossing(Interval other){
            if(this.a>other.b | other.a>this.b) System.exit(1);

            if(this.a < other.a){
                this.a = other.a;
                this.bool_a = other.bool_a;
            }

            if(this.b > other.b){
                this.b = other.b;
                this.bool_b = other.bool_b;
            }
        }

        public void union(Interval other){
            if(this.a>other.b | other.a>this.b) System.exit(1);

            if(this.a > other.a){
                this.a = other.a;
                this.bool_a = other.bool_a;
            }

            if(this.b < other.b){
                this.b = other.b;
                this.bool_b = other.bool_b;
            }
        }
    }

    public static Interval sumInterval(Interval[] intervals){
        Interval summaryInterval = intervals[0];
        for(Interval interval: intervals){
            summaryInterval.union(interval);
        }
        return summaryInterval;
    }

    public static double max_len(Interval[] intervals){
        double max_b = -99999.0;
        double min_a = 99999.0;

        for(Interval interval: intervals){
            if(max_b < interval.getB()){max_b = interval.getB();}
            if(min_a >interval.getA()){min_a = interval.getA();}
        }
        return(Math.abs(min_a)+Math.abs(max_b));
    }

    public static Interval[] autoMode(){
        Interval[] intervals = new Interval[6];
        intervals[0] = new Interval(1.0, 4.0, true, true);
        intervals[1] = new Interval(2.0, 3.0,true , true);
        intervals[2] = new Interval(2.0, 5.0, false, false);
        intervals[3] = new Interval(4.0, 6.0, true, true);
        intervals[4] = new Interval(-1.0,3.0, true, true);
        intervals[5] = new Interval(1.0,2.0,false, false);

        return intervals;
    }

    public static void mainTest(){
        Interval[] intervals = autoMode();
        double s = max_len(intervals);
        System.out.println(s);
        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {
        mainTest();
    }
    
}
