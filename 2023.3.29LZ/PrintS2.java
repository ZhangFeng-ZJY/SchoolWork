class PrintS2{

    public static void main(String args[]){
        int flag = 0;
        for (int i = 101; i <= 200; i++){
            if(isPrime(i)){
                System.out.print(i + "\t");
                flag++;
            }
            if (flag % 5 == 0)
            System.out.println();
        }
        System.out.println();
        System.out.println(flag + "个");

    }


         static boolean isPrime(int n) {
       // 枚举到√n,注意溢出
       for(int i = 2; i <= n / i; i++)
           // 如果i可以整除n,说明n不是素数，直接return false
           if(n % i == 0)
               return false;
       // 说明n是素数
       return true;
}
}
