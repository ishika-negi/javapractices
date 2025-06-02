import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SecureRSAWithGUI extends JFrame {
    private JTextField inputField;
    private JTextArea outputArea;
    private JButton encryptButton, decryptButton;

    // RSA variables
    private int p = 3, q = 11;
    private int n = p * q;
    private int phi = (p - 1) * (q - 1);
    private int e = 3;
    private int d;

    public SecureRSAWithGUI() {
        super("Simple RSA Encryption/Decryption");

        // Calculate e and d
        while (gcd(e, phi) != 1) e++;
        d = modInverse(e, phi);

        // Setup GUI components
        inputField = new JTextField(20);
        outputArea = new JTextArea(8, 30);
        outputArea.setEditable(false);

        encryptButton = new JButton("Encrypt");
        decryptButton = new JButton("Decrypt");
        decryptButton.setEnabled(false); // Enable decrypt only after encryption

        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter number to encrypt:"));
        panel.add(inputField);
        panel.add(encryptButton);
        panel.add(decryptButton);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        // Button listeners
        encryptButton.addActionListener(e -> {
            try {
                int msg = Integer.parseInt(inputField.getText());
                int encrypted = modPower(msg, this.e, n);
                outputArea.append("Original Message: " + msg + "\n");
                outputArea.append("Encrypted Message: " + encrypted + "\n");
                inputField.setText(String.valueOf(encrypted));
                encryptButton.setEnabled(false);
                decryptButton.setEnabled(true);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid integer.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        decryptButton.addActionListener(e -> {
            try {
                int encrypted = Integer.parseInt(inputField.getText());
                int decrypted = modPower(encrypted, d, n);
                outputArea.append("Decrypted Message: " + decrypted + "\n\n");
                inputField.setText("");
                encryptButton.setEnabled(true);
                decryptButton.setEnabled(false);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid integer.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        outputArea.append("Public Key: (" + e + ", " + n + ")\n");
        outputArea.append("Private Key: (" + d + ", " + n + ")\n\n");
    }

    // Utility methods (same as before)
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int modInverse(int e, int phi) {
        for (int d = 1; d < phi; d++) {
            if ((e * d) % phi == 1) return d;
        }
        return -1;
    }

    public static int modPower(int base, int exp, int mod) {
        int result = 1;
        base = base % mod;
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % mod;
            exp >>= 1;
            base = (base * base) % mod;
        }
        return result;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SecureRSAWithGUI::new);
    }
}
