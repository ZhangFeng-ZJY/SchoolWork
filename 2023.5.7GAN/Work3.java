import java.util.Scanner;
public class Work3{
    public static void main(String[] args) {
        System.out.println("请输入一个正整数:");
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        for(int k=2;k<=n/2;k++){
            if(n%k==0){
                System.out.print(k+"*");
                n= n/k;   //用递归把n重新定值
                k=2;  //这步很重要，让for循环重新执行
            }
        }
        System.out.print(n);    //把最后一个质因数输出
    }
}
