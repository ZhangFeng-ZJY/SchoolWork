// 3 or 4

class Rect{
    double length;
    double wide;

    Rect(double _length, double _wide){
        length = _length;
        wide = _wide;
        
    }

    public double Scount(){
        return length * wide; 
    }

    public double Ccount(){
        return 2 * (length + wide);
    }


}


class Test{
    public static void main(String[] args){
        Rect R = new Rect(4, 6);
        System.out.println(R.Scount());
        System.out.println(R.Ccount());
    }
}