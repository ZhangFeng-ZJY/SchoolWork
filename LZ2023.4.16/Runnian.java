import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a =input.nextInt();
		if(a>=1990 && a<=2050) {
			if((a%4==0 && a%100!=0 ) || (a%400==0)) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
    }
 
}
