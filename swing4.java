import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class swing4{
    public static void main(String args[])
    {
        JFrame f = new JFrame("Hello");
        f.setVisible(true);
        f.setSize(400,400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setLayout(new FlowLayout());
        JLabel l1 = new JLabel("Enter The First Number :");
        f.add(l1);
        JTextField t1 = new JTextField(20);
        t1.setToolTipText("Enter The First Number :");
        f.add(t1);
        JLabel l2 = new JLabel("Enter The Second Number :");
        f.add(l2);
        JTextField t2 = new JTextField(20);
        t2.setToolTipText("Enter The Second Number :");
        f.add(t2);
        JLabel l3 = new JLabel("Solution Is :");
        f.add(l3);
        JTextField t3 = new JTextField(20);
        t3.setToolTipText("Solutin ");
        t3.setEditable(false);
        f.add(t3);
        JButton b1 = new JButton("Add");
        f.add(b1);
        JButton b2 = new JButton("SubTract ");
        f.add(b2);
        JButton b3 = new JButton("Close");
        f.add(b3);
        b1.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e)
          {
            String s1 = t1.getText();
            String s2 = t2.getText();
            int sum = Integer.valueOf(s1)+Integer.valueOf(s2);
            t3.setText(String.valueOf(sum));
            JOptionPane.showMessageDialog(null,"Hello");

          }
         });

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s1 = t1.getText();
                String s2 = t2.getText();
                int sum = Integer.valueOf(s1)-Integer.valueOf(s2);
                t3.setText(String.valueOf(sum));
            }
        });

        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
            }
        });

    }
}