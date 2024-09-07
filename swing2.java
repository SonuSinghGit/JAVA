import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener
{
 JButton btn1,btn2;
 JTextField txt1,txt2,txt3;
 JLabel lbl1,lbl2,lbl3;
      MyFrame()
     {
      setLayout(new FlowLayout());
      lbl1=new JLabel("number1");
      lbl2=new JLabel("number2");
      lbl3=new JLabel("sum");
      txt1=new JTextField(10);
      txt2=new JTextField(10);
      txt3=new JTextField(10);
      btn1=new JButton("calculate");
      btn2=new JButton("reset");


      btn1.addActionListener(this);
      btn2.addActionListener(this);
      txt3.setEditable(false);
    
   
        add(lbl1);
        add(txt1);      
        add(lbl2);
        add(txt2);
        add(lbl3);
        add(txt3);
        add(btn1);
        add(btn2);
      }
       public void actionPerformed(ActionEvent ae)
       {
        if(ae.getSource()==btn1)
          {
           try
             {
               Float sum=Float.valueOf(txt1.getText())+Float.valueOf(txt2.getText());
               txt3.setText(" "+sum);
             }
             catch(NumberFormatException e)
             {
              txt1.setText(" ");
              txt2.setText(" ");
              txt3.setText(" ");
              txt1.setText(" ");
              txt1.requestFocus();
            JOptionPane.showMessageDialog(null,"invalid number","click",JOptionPane.INFORMATION_MESSAGE);
         }
     }
  }
 }   
        
    
  public class swing2
   {
    public static void main(String[] aa)
      {
       MyFrame f1=new MyFrame();
       f1.setTitle("sum of two number");
       f1.setSize(200,200);
       f1.setBounds(300,250,400,400);
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f1.setVisible(true);
      }

  } 