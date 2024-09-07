import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class asssig2_13 extends JFrame  {
    private JTextField txt1;
    private double num1, num2, result;
    private String operator;

    public asssig2_13() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        txt1= new JTextField();
        txt1.setEditable(false);
        add(txt1, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String button : buttons) {
            JButton btn = new JButton(button);
           // btn.addActionListener(this);
            buttonPanel.add(btn);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    // @Override
    // public void actionPerformed(ActionEvent e) {
    //     String command = e.getActionCommand();

    //     switch (command) {
    //         case "=":
    //             num2 = Double.parseDouble(display.getText());
    //             calculate();
    //             display.setText(String.valueOf(result));
    //             break;
    //         case "+":
    //         case "-":
    //         case "*":
    //         case "/":
    //             operator = command;
    //             num1 = Double.parseDouble(display.getText());
    //             display.setText("");
    //             break;
    //         default:
    //             display.setText(display.getText() + command);
    //     }
    // }

    // private void calculate() {
    //     switch (operator) {
    //         case "+":
    //             result = num1 + num2;
    //             break;
    //         case "-":
    //             result = num1 - num2;
    //             break;
    //         case "*":
    //             result = num1 * num2;
    //             break;
    //         case "/":
    //             if (num2 != 0) {
    //                 result = num1 / num2;
    //             } else {
    //                 JOptionPane.showMessageDialog(this, "Cannot divide by zero", "Error", JOptionPane.ERROR_MESSAGE);
    //             }
    //             break;
    //     }
    // }

    public static void main(String[] args) {
      asssig2_13 f= new asssig2_13();  
      f.setVisible(true);
    }
}
