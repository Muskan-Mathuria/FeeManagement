package feemanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JTextField user;
    JPasswordField pass;
    JButton login;

    Login() {
        setTitle("Fee Management Login");

        getContentPane().setBackground(new Color(40, 44, 52));

        JLabel l1 = new JLabel("Username");
        l1.setForeground(Color.WHITE);
        l1.setBounds(50,50,100,30);
        add(l1);

        user = new JTextField();
        user.setBounds(150,50,150,30);
        add(user);

        JLabel l2 = new JLabel("Password");
        l2.setForeground(Color.WHITE);
        l2.setBounds(50,100,100,30);
        add(l2);

        pass = new JPasswordField();
        pass.setBounds(150,100,150,30);
        add(pass);

        login = new JButton("Login");
        login.setBackground(Color.CYAN);
        login.setBounds(120,150,100,30);
        login.addActionListener(this);
        add(login);

        setLayout(null);
        setSize(350,300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            DBConnection db = new DBConnection();
            String u = user.getText();
            String p = pass.getText();

            String query = "SELECT * FROM login WHERE username='"+u+"' AND password='"+p+"'";
            ResultSet rs = db.con.createStatement().executeQuery(query);

            if(rs.next()) {
                new Dashboard();
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Login");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
