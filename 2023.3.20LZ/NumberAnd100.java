
public class NumberAnd100{

    public static void main(String[] arrgs){
        int flag = 0;
        for(int i = 1; i <= 100; i++){
            if (i % 3 == 0){
                System.out.print(i + "\t");
                flag++;
                if(flag % 5 == 0){
                    System.out.println();
                }
            }
        }
    }
}