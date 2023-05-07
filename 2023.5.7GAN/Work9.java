class Student{
    private String name;
    private double score;

    Student(String name, double score){
        this.score = score;
        this.name = name;
    }
    void setName(String name){
        this.name = name;
    }
    void setScore(double score){
        this.score = score;
    }

    public String getName(){
        return name;
    }
    public double getScore(){
        return score;
    }
}

class Work9{
    public static void main(String[] args) {
        Student s1 = new Student("张三", 98);
        Student s2 = new Student();
        s2.setName("李四");
        s2.setScore(89);
    }
}