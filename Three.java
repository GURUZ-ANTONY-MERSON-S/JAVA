class Parent{

    String name;
    int Rollno;
}

class Child extends Parent{
    int age;
    

}
class Subchild extends Child{
    double mark;
   


    void print(){
        System.out.println(age);
        System.out.println(Rollno);
        System.out.println(name);
        System.out.println(mark);

    }
}




public class Three {

   
    public static void main(String[] args) {
        Subchild subchild=new Subchild();
        subchild.Rollno=9090;
        subchild.mark=90;
        subchild.name="Guruz";
        subchild.age=28;
        subchild.print();
      
        
    }
    
}
