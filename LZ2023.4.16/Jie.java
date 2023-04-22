// 8

class Jie{

public static void main(String[] args) {
   int sum = 0;
   for(int i = 0;i <= 10; i++){
    sum = sum + circulation(i);
   }
   System.out.println(sum);
}


 public static int circulation(int n) {
  int result = 1;
  for(int i=1;i<=n;i++) {
   result*=i;
  }
  return result;  
 }


}