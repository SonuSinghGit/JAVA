import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class frame1 extends JFrame 
{
    JLabel lbl1,lbl2,lbl3;
    JTextField txt1;
    JPasswordField pf1;
    JTextArea txa1;
    JButton btn1,btn2;
    frame1()
    {
        super("Account Information");
        lbl1 = new JLabel("Username");
        txt1 = new JTextField(10);
        lbl2=new JLabel("Password");
        pf1=new JPasswordField(10);
        lbl3=new JLabel("Coomment");
        btn1= new JButton("OK");
        btn2= new JButton("Cancel");

        add(lbl1);
        add(txt1);
        add(lbl2);
        add(pf1);
        add(lbl3);
        add(txa1);
        add(btn1);
        add(btn2);
    }

    public static void main(String[] args) 
    {
        frame1 f1= new frame1();
        f1.setLayout(new FlowLayout());
        f1.setSize(500, 500);
        f1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
        f1.setVisible(true);
        
    }
    
          
}
