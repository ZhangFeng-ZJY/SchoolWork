/*
	输入两个正整数m和n，求其最小公倍数和最大公约数。
*/
public class Work4 {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("请输入正整数m和n：");
        int m = input.nextInt();
        int n = input.nextInt();
        int i = 0;
        if(m >= 1 && n >= 1){               //判断m和n是否正整数
            int num = m >= n ? n : m;		//判断输入正整数m和n的大小，并将较小值赋给num
            for(i=num; i>=1; i--){			//由大至小，先找出较小值的最大因数，然后判断其是否为较大值的因数，若不是循环继续，直至1为最大公因数；若是则输出i，退出循环
                if(m % i == 0 && n % i == 0){
                    System.out.print("m和n的最大公约数是" + i + "，");
                    break;
                }
            }
            System.out.println("最小公倍数是" + n * m / i + "。");    //最小公倍数为两正整数乘积除以最大公因数
        }else{
            System.out.println("输入数字有误！！！");
        }
    }
}