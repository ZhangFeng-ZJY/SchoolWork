import java.util.Scanner;
class ABC{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的成绩!");
        int number = sc.nextInt();
        if(number >= 0 && number <= 100){

            if (number >= 60){
                if (number >= 90){
                    System.out.println("A");
                }else{
                    System.out.println("B");
                }
            }else{
                System.out.println("C");
            }
        }else{
            System.out.println("您输入的成绩有误!");
        }
    }
}