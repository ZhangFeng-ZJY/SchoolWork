interface Shape{
    public double area();
}

class Square implements Shape{
    private double L;
    private double S;

    Square(double L, double S){
        this.L = L;
        this.S = S;
    }

    public double area(){
        return L * S;
    }
}

class Circle implements Shape{
    private double r;
    Circle(double r){
        this.r = r;
    }
    public double area(){
        return 3.14 * r * r;
    }
}

class Work1{
    public static void main(String[] args) {
        Square s1 =new Square(2.0, 2.0);
        System.out.println(s1.area());
        Circle c1 = new Circle(3.0);
        System.out.println(c1.area());
    }
}