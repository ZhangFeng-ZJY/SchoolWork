class Work8{
    public static void main(String[] args) {
        Person P1 = new Person(1, 68, 71, 90);
        Person P2 = new Person(2, 70, 81, 92);
        Person P3 = new Person(3, 98, 88, 78);
        Person P4 = new Person(4, 67, 68, 97);
        Person P5 = new Person(0, 86, 77, 81);

        Person Zun[] = {P1, P2, P3, P4, P5};

        double S1 = 0.0;
        double S2 = 0.0;
        double S3 = 0.0;
        for(int i = 1; i < 5; i++){
            S1 = S1 + Zun[i].Score1;
            S2 = S2 + Zun[i].Score2;
            S3 = S3 + Zun[i].Score3;
        }
        double Es1 = S1 / 5;
        double Es2 = S2 / 5;
        double Es3 = S3 / 5;

        System.out.println(Es1);
        System.out.println(Es2);
        System.out.println(Es3);
    }

}

class Person{
    int Id;
    double Score1;
    double Score2;
    double Score3;
    Person(int Id, double Score1, double Score2, double Score3){
        this.Id = Id;
        this.Score1 = Score1;
        this.Score2 = Score2;
        this.Score3 = Score3;
    }
}