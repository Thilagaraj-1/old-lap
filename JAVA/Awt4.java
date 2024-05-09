import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyWindow extends Frame implements ActionListener {
    Label labUsername, labPassword;
    Button resetButton, loginButton;
    TextField txtUsername, txtPassword;

    MyWindow() {
        setLayout(new FlowLayout());
        setBackground(new Color(0, 0, 0));
        setVisible(true);
        setSize(200, 400);
        add(labUsername = new Label("Username : "));
        add(txtUsername = new TextField(20));
        add(labPassword = new Label("Password : "));
        add(txtPassword = new TextField(20));
        add(loginButton = new Button("Login"));
        add(resetButton = new Button("Reset"));

        labUsername.setForeground(new Color(255, 255, 255));
        labPassword.setForeground(new Color(255, 255, 255));

        resetButton.setBackground(new Color(255, 0, 0));
        loginButton.setBackground(new Color(0, 255, 0));
        resetButton.addActionListener(this);
        loginButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // System.out.println(ae.getActionCommand());
        if (ae.getActionCommand().equals("Login")) {
            System.out.println("Login Clicked");
        } else if (ae.getActionCommand().equals("Reset")) {
            System.out.println("Reset Clicked");
            resetFields();

        }
    }

    public void resetFields() {
        txtUsername.setText("");
        txtPassword.setText("");
    }
}

class Awt4 {
    public static void main(String[] arg) {
        new MyWindow();
    }
}