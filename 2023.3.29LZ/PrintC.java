class PrintC{
    public static void main(String args[]){
        for (int i = 0; i < 4; i++){
            System.out.print("*");
            for(int j = i; j > 0; j--){
                System.out.print("**");
            }
            System.out.println();
        }
    }
}