public interface Ainterface {
    double calculate();
}
  abstract class Triangle implements Ainterface{
    double height;
    double base;

    Triangle(double height, double base) {
        this.height=height;
        this.base=base;
    }
     double calculate(double height, double base){
           return 0.5*height*base;

    }
}

abstract class  Rectangle implements Ainterface{
    double length;
    double breadth;
    Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
     double calculate(double length,double breadth){
        return length*breadth;

    }
}
class Main{
    public static void main(String[] args) {
        Triangle triangle=new Triangle(9, 7.7) {
        System.out.println(triangle.calculate());
    }
}


