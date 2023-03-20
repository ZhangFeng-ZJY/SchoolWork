import java.util.Scanner;

public class Day{

    public static boolean IfYear(int year){
		
		if(year % 4 == 0) {
				if(year % 100 != 0) {
					return true;
				}else if(year % 400 ==0 ) {
					return true;
				}else {
						return false;
					}
		}else if(year % 400 ==0 ) {
				return true;
		}else {
				return false;
			}
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
	    System.out.println("请输入年份：");
	    int _year = in.nextInt();
        System.out.println("请输入月份:");
        int month = in.nextInt();

            switch(month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                System.out.println("31天");
                break;
                case 2:
                if (IfYear(_year)){
                    System.out.println("29天");
                }else{
                    System.out.println("28天");
                }
                break;
                case 4:
                case 6:
                case 9:
                case 11:
                System.out.println("30天");
                break;
            }
    }
}