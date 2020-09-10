package second;

class Shape {
    private double s; //площадь фигуры
    private double p; //периметр фигуры

    Shape (){}

    Shape(double s, double p){
        this.s = s;
        this.p = p;
    }

    void setS(double s){
        this.s = s;
    }

    void setP(double p){
        this.p = p;
    }

    public String toString(){
        return "The perimeter is " + p + "\nThe area is "+s;
    }
}


public class Tester{
    private Shape f;
    Tester(){}

    Tester(Shape f){
        this.f = f;
    }

    void setF(Shape f){
        this.f = f;
    }

    void test(){
        System.out.println(f);
    }
}
