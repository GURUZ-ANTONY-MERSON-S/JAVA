import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AWT{
    AWT(){

      
      
        
        Frame FR=new Frame("GURUZ ANTONY MERSON");

        Label label1=new Label("NAME:");
        label1.setBounds(20, 120, 100, 30);
        TextField name=new TextField("");
        name.setBounds(100, 120, 100, 30);

        Label label2=new Label("AGE:");
        label2.setBounds(20, 170, 100, 30);
        TextField age=new TextField("");
        age.setBounds(100, 170, 100, 30);

      
        Label label3=new Label("EMAIL:");
        label3.setBounds(20, 220, 100, 30);
        TextField email =new TextField("");
        email.setBounds(100, 220, 100, 30);

        Label label4=new Label("PASSWORD:");
        label4.setBounds(20, 280, 100, 30);
        TextField password =new TextField("");
        password.setBounds(100, 280, 100, 30);


        Button bt=new Button("SUBMIT");
        bt.setBackground(Color.green);
        bt.setBounds(100, 330, 50, 20);
        ActionListener b=new ActionListener() {
           
            public void actionPerformed(ActionEvent e) {

        };

        bt.addActionListener(b);
     
    FR.setSize(400,400);
    FR.add(email);
    FR.add(password);
    FR.add(name);
    FR.add(age);



    FR.add(label1);
    FR.add(label2);
    FR.add(label3);
    FR.add(label4);
     
    FR.setBackground(Color.gray);
    FR.setLayout(null);
    FR.setVisible(true);
    
    FR.add(bt);
   
    }
    public static void main(String[] args) {
       new AWT();
       
    }

    class ButtonListen implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            
            System.out.println(name.getText());
            System.out.println(age.getText());
            System.out.println(email.getText());
            System.out.println(password.getText());
            
        }
        
        

    }


}
