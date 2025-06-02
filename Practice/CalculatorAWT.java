import java.awt.*;
import java.awt.event.*;

public class CalculatorAWT extends Frame implements ActionListener {
    TextField tf1, tf2, result;
    Button add, sub, mul, div;

    CalculatorAWT() {
        // Create UI components
        tf1 = new TextField();
        tf1.setBounds(50, 50, 150, 20);

        tf2 = new TextField();
        tf2.setBounds(50, 80, 150, 20);

        result = new TextField();
        result.setBounds(50, 110, 150, 20);
        result.setEditable(false);

        add = new Button("+");
        add.setBounds(50, 150, 30, 30);
        sub = new Button("-");
        sub.setBounds(90, 150, 30, 30);
        mul = new Button("*");
        mul.setBounds(130, 150, 30, 30);
        div = new Button("/");
        div.setBounds(170, 150, 30, 30);

        // Add action listeners
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        // Add components to the frame
        add(tf1);
        add(tf2);
        add(result);
        add(add);
        add(sub);
        add(mul);
        add(div);

        // Frame properties
        setSize(250, 250);
        setLayout(null);
        setVisible(true);

        // Window close event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(tf1.getText());
            double b = Double.parseDouble(tf2.getText());
            double c = 0;

            if (e.getSource() == add)
                c = a + b;
            else if (e.getSource() == sub)
                c = a - b;
            else if (e.getSource() == mul)
                c = a * b;
            else if (e.getSource() == div)
                c = b != 0 ? a / b : 0;

            result.setText(String.valueOf(c));
        } catch (Exception ex) {
            result.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new CalculatorAWT();
    }
}
