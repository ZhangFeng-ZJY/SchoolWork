class Area{
    public double getArea(double r){
        return r * r * 3.14;
    }
}

class Circle extends Area{
    public double geArea(double r){
        return 3.14 * r * r / 2;
    }
}

class Sphere extends Circle{
    public  double getArea(double r){
        return 4 * 3.14 * r * r;
    }
}

class  Work4{
    public static void main(String[] args) {
        Area a1 = new Area();
        System.out.println(a1.getArea(4.0));
        Sphere s1 = new Sphere();
        System.out.println(s1.getArea(4.0));
        Circle c1 = new Circle();
        System.out.println(c1.geArea(4.0));
    }
}