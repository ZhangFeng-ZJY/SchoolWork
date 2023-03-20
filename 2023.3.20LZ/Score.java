
import java.util.Scanner;

public class Score{


    public static void main(String[] args){
        System.out.println("请输入成绩:");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        String result; 
        
        if (score >= 90 && score <= 100){
            result = "优";
        }
        else if (score < 90 && score >= 75){
            result = "良";
        }
        else if (score < 75 && score >= 60){
            result = "及格";
        }
        else if (score < 60 && score >= 0){
            result = "不及格";
        }
        else{
            result = "不合法的分数";
        }
        System.out.println(result);
        
    }
}