import java.lang.Math;

public class Triangle{

    public static void main(String[] args){
        double a = 2.0;
        double b = 2.0;
        double c = 3.0;
        double p;
        double s;
        if ((a + b) > c && (a + c) > b && (b + c) > a){
            p = (a + b + c) / 2.0;

            s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println(s);
        }
    }
}