import java.util.Scanner;

public class F{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入摄氏度:");
        double temper = sc.nextDouble();

        double F;

        F = temper * 9.0 / 5.0 + 32.0;

        System.out.println(F);
    }
}