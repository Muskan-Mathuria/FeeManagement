
package feemanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class DepositFee extends JFrame implements ActionListener {

    JTextField id, amount;
    JButton deposit;

    DepositFee() {
        setTitle("Deposit Fee");

        getContentPane().setBackground(new Color(34, 47, 62));

        JLabel heading = new JLabel("Deposit Fee");
        heading.setBounds(130,10,200,30);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Arial", Font.BOLD, 18));
        add(heading);

        JLabel l1 = new JLabel("Student ID:");
        l1.setBounds(50,70,100,30);
        l1.setForeground(Color.WHITE);
        add(l1);

        id = new JTextField();
        id.setBounds(150,70,180,30);
        add(id);

        JLabel l2 = new JLabel("Amount:");
        l2.setBounds(50,120,100,30);
        l2.setForeground(Color.WHITE);
        add(l2);

        amount = new JTextField();
        amount.setBounds(150,120,180,30);
        add(amount);

        deposit = new JButton("Deposit");
        deposit.setBounds(130,180,120,35);
        deposit.setBackground(Color.ORANGE);
        deposit.addActionListener(this);
        add(deposit);

        setLayout(null);
        setSize(400,280);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            DBConnection db = new DBConnection();
            String q = "INSERT INTO fee VALUES("+id.getText()+","+amount.getText()+",CURDATE())";
            db.con.createStatement().executeUpdate(q);

            JOptionPane.showMessageDialog(null, "Fee Deposited 💰");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
