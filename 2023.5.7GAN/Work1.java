

class Employee{
    private String name;
    private double salar;
    private int id;

    Employee(String name, double salar, int id){
        this.id = id;
        this.name = name;
        this.salar = salar;
    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.salar);
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setSalar(double salar){
        this.salar = salar;
    }
}

class Manager extends Employee{
    private String Sys;
    public Manager(String name, double salar, int id){
        super(name, salar, id);

    }

    public void setSys(String Sys){
        this.Sys = Sys;
    }

    public String getSys(){
        return Sys;
    }

}
class Work1{
    public static void main(String[] args) {
        Employee e = new Employee("张三", 50000.0, 1);
        e.print();

        e.setId(0);
        e.setName("李四");
        e.setSalar(25000.0);
        e.print();

        Employee e2 = new Employee("王笑", 20000.0, 1);
        Manager m1 = new Manager("王笑", 20000.0, 1);
        m1.setName("李东");
        m1.setSys("经理");
        m1.setId(10);
        m1.setSalar(50000.0);
        m1.print();
    }
}