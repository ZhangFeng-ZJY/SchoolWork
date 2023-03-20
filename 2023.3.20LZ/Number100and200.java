public class Number100and200{
    
    public static void main(String[] args){
        int flag = 0;
        for(int i = 100; i <= 200; i++){
            if(i % 3 == 0){
                System.out.print(i + "\t");
                flag++;
                if(flag % 5 == 0){
                    System.out.println();
                }
            }
        }
    }
}