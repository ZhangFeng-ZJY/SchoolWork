class Sum{

    public static void main(String agrs[]){
        int sum = 0;
        for (int i = 0; i <= 20; i++){
            sum = sum + JieChen(i);
        }
    }

    static int JieChen(int number){
        int end = number;
        for (int i = 1; i < number; i++){
            end = end * i;
        }
        return end;
    }
}