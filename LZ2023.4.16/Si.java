class Employee{
    private String name;
    private double salary;
    private int id;

    Employee(String name, double salary, int id){
        this.id = id;
        this.name = name;
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

class Si{

    public static void main(String[] args){
        Employee e = new Employee("张三", 50000.00, 1);
        System.out.println(e.getName());
        System.out.println(e.getId());
        System.out.println(e.getSalary());
    }
}

