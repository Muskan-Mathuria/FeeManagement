package feemanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AddStudent extends JFrame implements ActionListener {

    JTextField name, course, email;
    JButton save;

    AddStudent() {
        setTitle("Add Student");

        getContentPane().setBackground(new Color(45, 52, 54));

        JLabel heading = new JLabel("Add New Student");
        heading.setBounds(100,10,250,30);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Arial", Font.BOLD, 18));
        add(heading);

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(50,60,100,30);
        l1.setForeground(Color.WHITE);
        add(l1);

        name = new JTextField();
        name.setBounds(150,60,180,30);
        add(name);

        JLabel l2 = new JLabel("Course:");
        l2.setBounds(50,110,100,30);
        l2.setForeground(Color.WHITE);
        add(l2);

        course = new JTextField();
        course.setBounds(150,110,180,30);
        add(course);

        JLabel l3 = new JLabel("Email:");
        l3.setBounds(50,160,100,30);
        l3.setForeground(Color.WHITE);
        add(l3);

        email = new JTextField();
        email.setBounds(150,160,180,30);
        add(email);

        save = new JButton("Save");
        save.setBounds(130,220,120,35);
        save.setBackground(Color.GREEN);
        save.addActionListener(this);
        add(save);

        setLayout(null);
        setSize(400,320);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            DBConnection db = new DBConnection();
            String q = "INSERT INTO student(name,course,email) VALUES('"+
                    name.getText()+"','"+course.getText()+"','"+email.getText()+"')";
            db.con.createStatement().executeUpdate(q);

            JOptionPane.showMessageDialog(null, "Student Added ✅");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
