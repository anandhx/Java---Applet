import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginDemo extends JFrame implements ActionListener {
    JPanel panel;
    JLabel userLabel, passwordLabel, message;
    JTextField usernameText;
    JPasswordField passwordText;
    JButton submit;

    public LoginDemo() {
        userLabel = new JLabel("Username: ");
        usernameText = new JTextField();
        passwordLabel = new JLabel("Password: ");
        passwordText = new JPasswordField();
        submit = new JButton("Submit");
        message = new JLabel();

        panel = new JPanel();
        panel.setLayout(null);

        userLabel.setBounds(50, 50, 80, 30);
        usernameText.setBounds(130, 50, 150, 30);
        passwordLabel.setBounds(50, 100, 80, 30);
        passwordText.setBounds(130, 100, 150, 30);
        submit.setBounds(130, 150, 80, 30);
        message.setBounds(50, 200, 250, 30);

        submit.addActionListener(this);

        panel.add(userLabel);
        panel.add(usernameText);
        panel.add(passwordLabel);
        panel.add(passwordText);
        panel.add(submit);
        panel.add(message);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Please login user");
        setSize(300, 300);
        setVisible(true);
        setLocationRelativeTo(null);
        add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        String username = usernameText.getText();
        String password = new String(passwordText.getPassword());

        if (username.equals("admin") && password.equals("admin")) {
            message.setText("Hello, " + username);
        } else {
            message.setText("Invalid username or password");
        }
    }

    public static void main(String[] args) {
        new LoginDemo();
    }
}
