package feemanagement;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.sql.*;

public class ViewFee extends JFrame {

    JTable table;

    ViewFee() {
        setTitle("Fee Records");

        getContentPane().setBackground(new Color(223, 230, 233));

        JLabel heading = new JLabel("Fee Transaction History");
        heading.setFont(new Font("Arial", Font.BOLD, 20));
        heading.setBounds(180,10,300,30);
        add(heading);

        String[] column = {"Student ID", "Amount", "Date"};

        DefaultTableModel model = new DefaultTableModel(column, 0);
        table = new JTable(model);

        try {
            DBConnection db = new DBConnection();
            ResultSet rs = db.con.createStatement().executeQuery("SELECT * FROM fee");

            while(rs.next()) {
                String id = rs.getString("student_id");
                String amt = rs.getString("amount");
                String date = rs.getString("date");

                model.addRow(new Object[]{id, amt, date});
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(50,60,500,250);
        add(sp);

        setLayout(null);
        setSize(620,400);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
