
public class Work6 {

    public static int sumFac(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int ret = 1;
            for (int j = 1; j <= i; j++) {
                ret *= j; // ret = ret * j;
            }
            sum += ret; // sum = sum + ret;
        }
        return sum;
    }

    public static void main(String[] args) { // m4
        int n = 5;
        int ret = sumFac(n);  //方法二
        System.out.println(ret);
    }
}
