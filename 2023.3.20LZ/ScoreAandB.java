import java.util.Scanner;

public class ScoreAandB {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("学生的成绩是：");
        int grade = scanner.nextInt();
        int grade1;
        grade1 = grade/10;   //求成绩的十位数
        if (grade<=100&&grade>=0)    //限定成绩的范围
        switch (grade1){
            case 0:      
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("E");   //成绩为0-59分
                break;
            case 6:
                System.out.println("D");   //60-69
                break;
            case 7:
                System.out.println("C");   //成绩为70-79分
                break;
            case 8:
                System.out.println("B");   //成绩为80-89分
                break;
            case 9:
            case 10:
                System.out.println("A");   //成绩为90-100分
                break;
        }
        else System.out.println("输入信息错误！");
    }
}

