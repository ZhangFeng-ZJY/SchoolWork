// 5

class People{
    double sg;
    String xm;
    String xb;

    People(double sg, String xm, String xb){
        this.sg = sg;
        this.xm = xm;
        this.xb = xb;
    }

    void rwjj(){
        System.out.print(sg);
        System.out.print(xm);
        System.out.print(xb);
    }
}

class Test{
    public static void main(String[] args){
        People xpeople = new People(170, "刘阳", "男");
    }
}