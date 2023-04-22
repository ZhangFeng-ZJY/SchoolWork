// 11

class Employee{
    private String name;
    private double salary;
    private int id;

    Employee(String name, double salary, int id){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getSalary(){
        return salary;
    }
}

class Manager extends Employee{
    private String idis;
    public Manager(String name, double salary, int id){
    super(name, salary, id);
}
     
    public void setIdis(String idis){
        this.idis = idis;
    }

    public String getIdis(){
        return idis;
    }
}
class SiPlus{

    public static void main(String[] args){
        Employee e = new Employee("张三", 50000.00, 1);
        System.out.println(e.getName());
        System.out.println(e.getId());
        System.out.println(e.getSalary());
        e.setId(2);
        e.setName("王笑");
        e.setSalary(20000.0);
        System.out.println(e.getName());
        System.out.println(e.getId());
        System.out.println(e.getSalary());
    }
}