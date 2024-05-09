import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

class MyWindow extends Frame {
    Button resetButton, loginButton;
    TextField txtUsername, txtPassword;

    MyWindow() {
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(200, 400);
        add(new Label("Username: "));
        add(txtUsername = new TextField(20));
        add(new Label("Password : "));
        add(txtPassword = new TextField(20));
        add(loginButton = new Button("Login"));
        add(resetButton = new Button("Reset"));
        resetButton.addActionListener(new MyButtonListener());
        loginButton.addActionListener(new MyButtonListener());
    }

    public void resetFields() {
        txtUsername.setText("");
        txtPassword.setText("");
    }
}

class MyButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Login")) {
            System.out.println("Login Clicked");
        } else if (ae.getActionCommand().equals("Reset")) {
            System.out.println("Reset Clicked");
            new MyWindow().resetFields();
            ;
        }
    }
}

class Awt3 {
    public static void main(String[] arg) {
        new MyWindow();
    }
}