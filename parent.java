 class Two{
//single level inheritance
// parent class
double radius;
}
class Child extends Two{
    //chile class
    double print(){
        return 4* 3.14 *radius*radius;
    }
}

public class parent {
public static void main(String[] args) {
    Child child=new Child();
    child.radius= 54;
    System.err.println("The area of the sphere is:"+child.print());
}
}
