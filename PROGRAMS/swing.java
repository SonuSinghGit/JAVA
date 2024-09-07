import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class swing {
    public static void main(String args[])
    {
        JFrame f1 = new JFrame("Employee");
        f1.setLayout(new FlowLayout());
        f1.setLocationRelativeTo(null);
        f1.setSize(300,300);
        JLabel l1 = new JLabel("Salary");
        JLabel l2 = new JLabel("Net Salary");
        JRadioButton b1 = new JRadioButton("Sales");
        JRadioButton b2 = new JRadioButton("MArketing");
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(b1);
        bg1.add(b2);
        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);
        JButton bt1 = new JButton("Ok");
        f1.add(l1);
        f1.add(t1);
        f1.add(b1);
        f1.add(b2);
        f1.add(l2);
        f1.add(t2);
        f1.add(bt1);
        f1.setVisible(true);
        try{
            bt1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    if(b1.isSelected())
                    {
                        float sal = Float.valueOf(t1.getText());
                        float netsal = sal+sal*0.3f;
                        t2.setText(""+netsal);
                    }
                    if(b2.isSelected())
                    {
                        float sal = Float.valueOf(t1.getText());
                        float netsal = sal+sal*0.5f;
                        t2.setText(""+netsal);
                    }
                }
            });
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
      }

   }
}