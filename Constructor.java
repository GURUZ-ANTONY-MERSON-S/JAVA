
class Const {
    public int register;
    public int age;
    public String name;

    public Const(int register, int age, String name) {
        this.age=age;
        this.name=name;
        this.register=register;
    }
    void print(){
        System.out.print(age+"\n");
        System.out.print(register+"\n");
        System.out.print(name+"\n");
    }
}


public class One {

    public static void main(String[] args) {
      
         Const obj=new Const(3, 4, "Guruz");
         obj.print();
    }
}
