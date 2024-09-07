import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class swing5 extends JFrame implements ActionListener 
{
    JLabel lbl1, lbl2;
    JTextField txt1, txt2;
    JRadioButton rb1, rb2;
    JButton btn1, btn2;
    ButtonGroup bg1;

    public swing5() 
    {
        super("Employee");
        setLayout(new FlowLayout());
        lbl1 = new JLabel("Employee");
        lbl2 = new JLabel("Salary");
        txt1 = new JTextField(15);
        txt2 = new JTextField(15);
        rb1 = new JRadioButton("salary");
        rb2 = new JRadioButton("Mkt");
        btn1 = new JButton("Netsal");
        btn2 = new JButton("reset");
        bg1 = new ButtonGroup();
        bg1.add(rb1);
        bg1.add(rb2);

        btn1.addActionListener(this);
        btn2.addActionListener(this);

        add(lbl1);
        add(txt1);
        add(lbl2);
        add(txt2);
        add(rb1);
        add(rb2);
        add(btn1);
        add(btn2);
    }

    public void actionPerformed(ActionEvent ae) 
    {   
        float net=0.0f;
        if(ae.getSource()==btn1)
        {
            if(rb1.isSelected())
            net=Float.valueOf(txt2.getText())+ .5F*Float.valueOf(txt2.getText());

            if(rb2.isSelected())
            net=Float.valueOf(txt2.getText())+ .74F*Float.valueOf(txt2.getText());
           
            JOptionPane.showMessageDialog(null,"salry is: "+net,"Employee Salry: ",JOptionPane.INFORMATION_MESSAGE);
    
        }

    }

    public static void main(String[] args) 
    {
        swing5 sw = new swing5();
        sw.setSize(400, 500);
        sw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sw.setVisible(true);
    }

}
