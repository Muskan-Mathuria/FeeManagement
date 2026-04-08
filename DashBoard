package feemanagement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {

    JButton add, deposit, view;

    Dashboard() {
        setTitle("Dashboard");

        getContentPane().setBackground(new Color(58, 66, 86));

        add = new JButton("Add Student");
        add.setBounds(100,100,200,40);
        add.setBackground(Color.GREEN);
        add.addActionListener(this);
        add(add);

        deposit = new JButton("Deposit Fee");
        deposit.setBounds(100,160,200,40);
        deposit.setBackground(Color.ORANGE);
        deposit.addActionListener(this);
        add(deposit);

        view = new JButton("View Fees");
        view.setBounds(100,220,200,40);
        view.setBackground(Color.CYAN);
        view.addActionListener(this);
        add(view);

        setLayout(null);
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == add) new AddStudent();
        if(ae.getSource() == deposit) new DepositFee();
        if(ae.getSource() == view) new ViewFee();
    }
}
