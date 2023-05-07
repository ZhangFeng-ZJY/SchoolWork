class IntSort{
    public void sort(int a, int b){
        if(a > b){
            System.out.print(a + ">" + b);
        }else {
            System.out.println(b + ">" + a);
        }
    }
    public void sort(int i, int j, int k){
        int  max = i>j ? (i>k ? i : k) : (j>k ? j:k);
        int min = i<j ?(i<k? i:k): (j<k? j:k);
        int middle = 0 ;

        if(max != i && min != i){//如果第1个变量i中的值不是最大值也不是最小值，则它一定是中间值
            middle = i;
        }
        if(max != j && min != j){
            middle = j;
        }
        if(max != k && min != k){
            middle = k;
        }


        System.out.println(max+">"+middle+">"+min);

    }
}

class Work5{
    public static void main(String[] args) {
        IntSort i1 = new IntSort();
        i1.sort(12, 34, 90);
        i1.sort(12, 56);
    }
}