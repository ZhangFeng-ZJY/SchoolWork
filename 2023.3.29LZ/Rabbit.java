import java.util.Scanner;

class Rabbit{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想得知的的月份:");
        int n = sc.nextInt();
        System.out.println(sum(n));

    }

    static int Fe(int n){
        if (n == 1 || n == 2)
            return 1;
        else 
            return Fe(n - 2) + Fe(n - 1);
    }

    static int sum(int Tmonth){
        int sum = 0;
        for (int i = 1; i <= Tmonth; i++){
            sum = sum + Fe(i);
        }
        return sum;
    }
}