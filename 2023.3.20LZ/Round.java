
public class Round{

    public static void main(String[] args){
        double r = 1.5;
        double h = 3;
        double pi = 3.14;

        double C = 2 * pi * r;
        double S = pi * r * r;
        double V = 4.0 / 3.0 * pi * r * r * r;
        double Sall = 4.0 * pi * r * r;
        double Vyuanzhu = S * h;

        System.out.println("周长为:" + C);
        System.out.println("圆面积:" + S);
        System.out.println("圆球表面积:" + Sall);
        System.out.println("圆球体积:" + V);
        System.out.println("圆柱体积:" + Vyuanzhu);
    }
}