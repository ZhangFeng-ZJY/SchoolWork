class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void show(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

class Undergraduate extends Student{
    private String degree;
    Undergraduate(String name, int age, String degree){
        super(name, age);
        this.degree = degree;
    }

    public void show(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(this.degree);
    }
}

class Work10{
    public static void main(String[] args) {
        Undergraduate u1 = new Undergraduate("张三", 19, "本科");
        Student s1 = new Student("李四", 16);
        s1.show();
        u1.show();
    }
}