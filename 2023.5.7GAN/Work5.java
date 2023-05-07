import java.util.*;

public class Work5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        new Main().test(s);
    }

    void test(String s) {
        int j=0,k=0,l=0,m=0;
        char[] charArray = s.toCharArray();
        for(int i = 0;i < s.length();i++) {
            if(charArray[i] >= 65 && charArray[i] <= 90 || charArray[i] >= 97 && charArray[i] <= 122){
                j++;
            }else if(charArray[i] >= 48 && charArray[i] <= 57){
                k++;
            }else if(charArray[i] == 32){
                l++;
            }else {
                m++;
            }
        }
        System.out.printf("%d %d %d %d",j,k,l,m);
    }
}