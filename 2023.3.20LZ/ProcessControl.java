import java.util.Scanner;


public class ProcessControl {

	public static void main(String[] args) {
		
		//判断闰年
		//1.能被4整除，但不能被100整除，就是闰年；
		//2.能被400整除，也是闰年
		
		Scanner in = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = in.nextInt();
		
		if(year % 4 == 0) {
				if(year % 100 != 0) {
					System.out.println(year+"是闰年");
				}else if(year % 400 ==0 ) {
					System.out.println(year+"是闰年");
				}else {
						System.out.println(year+"不是闰年");
					}
		}else if(year % 400 ==0 ) {
				System.out.println(year+"是闰年");
		}else {
				System.out.println(year+"不是闰年");
			}
	}
	

}