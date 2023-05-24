import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AppFirst extends JFrame {
    private JLabel loginLabel, passwordLabel;
    private JTextField loginField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public AppFirst() {
        super("AViAMiRROR");

        loginLabel = new JLabel("Логин:");
        passwordLabel = new JLabel("Пароль:");

        loginField = new JTextField(20);
        passwordField = new JPasswordField(20);

        loginButton = new JButton("Войти");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == loginButton) {
                    Tickets buyTickets = new Tickets();
                }
                String login = loginField.getText();
                String password = new String(passwordField.getPassword());
                System.out.println("Логин: " + login + ", Пароль: " + password);
            }
        });

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(loginLabel);
        panel.add(loginField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel(""));
        panel.add(loginButton);

        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AppFirst();
    }
}