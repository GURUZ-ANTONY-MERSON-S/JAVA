class Fou{
     String Dept="Internet Of Things";
}

class Class1 extends Fou{
    String name1;
    int age1;
    void print1(){
        System.out.println(name1);
        System.out.println(age1);
        System.out.println(Dept);
        System.out.println("\n");
    }
}

class Class2 extends Fou{
    String name2;
    int age2;
    void print2(){
        System.out.println(name2);
        System.out.println(age2);
        System.out.println(Dept);
    }
}




public class Four {
        public static void main(String[] args) {
            Class1 class1=new Class1();
            Class2 class2=new Class2();
            class1.name1="Guruz";
            class1.age1=23;
            class2.name2="Antony";
            class2.age2=34;
            class1.print1();
            class2.print2();
        }
   }