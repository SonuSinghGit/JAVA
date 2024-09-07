import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class assig2_11 extends JFrame {

    JLabel lbl1, lbl2;
    JTextField txt1, txt2;
    JButton btn;

    public assig2_11() {
        super("CSE DEPT LOGIN PAGE");
        setLayout(new FlowLayout());
        lbl1 = new JLabel("ROLLNO");
        lbl2 = new JLabel("PASSWORD");
        txt1 = new JTextField(15);
        txt2 = new JTextField(15);
        btn = new JButton("SUBMIT");
        // btn.addActionListener(this);
        add(lbl1);
        add(txt1);
        add(lbl2);
        add(txt2);
        add(btn);

    }

    // public void actionPerfomed(ActionEvent ae)
    // {

    // }
    public static void main(String[] args) {
        assig2_11 frame = new assig2_11();
        frame.setSize(500, 400);
        frame.setBounds(300, 250, 400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
