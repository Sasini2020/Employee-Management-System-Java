package Employeee;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.Border;

class details  implements ActionListener{

    JFrame f;
    JLabel l1,l2;
    JButton b1,b2,b3,b4;

    details(){
        f=new JFrame("Manage Employees");
        f.setBackground(Color.white);
        f.setLayout(null);

        l1 = new JLabel();
        l1.setBounds(0,0,1368,855);
        l1.setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/6308.jpg"));
        l1.setIcon(i1);
        f.add(l1);

        l2 = new JLabel("Manage Employees");
        l2.setBounds(500,30,300,80);
        l2.setFont(new Font("serif",Font.BOLD,29));
        l2.setForeground(new Color(21, 67, 96));
        l1.add(l2);

        b1=new JButton("Add");
        b1.setBounds(420,130,100,40);
        b1.setFont(new Font("serif",Font.BOLD,15));
//        button.setBackground(new Color(243, 156, 18));// inside the brackets your rgb color value like 255,255,255
        b1.setBackground(new Color(21, 67, 96));
        b1.setForeground(new Color(243, 156, 18));
        b1.setFocusPainted(false);
        b1.addActionListener(this);
        l1.add(b1);


        b2=new JButton("View");
        b2.setBounds(550,130,100,40);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(new Color(243, 156, 18));
        b2.setForeground(new Color(21, 67, 96));
        b2.addActionListener(this);
        l1.add(b2);

        b3=new JButton("Remove");
        b3.setBounds(680,130,100,40);
        b3.setFont(new Font("serif",Font.BOLD,15));
        b3.addActionListener(this);
        b3.setBackground(new Color(243, 156, 18));
        b3.setForeground(new Color(21, 67, 96));
        l1.add(b3);

        b4=new JButton("Update");
        b4.setBounds(810,130,100,40);
        b4.setFont(new Font("serif",Font.BOLD,15));
        b4.setBackground(new Color(243, 156, 18));
        b4.setForeground(new Color(21, 67, 96));
        b4.addActionListener(this);
        l1.add(b4);

        f.setVisible(true);
        f.setSize(1368,855);
        f.setLocation(450,200);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            f.setVisible(false);
            new Add_Employee();
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            new View_Employee();
        }
        if(ae.getSource()==b3){
            f.setVisible(false);
            new Remove_Employee();
        }
        if(ae.getSource()==b4){
            f.setVisible(false);
            new Search_Employee();
        }
    }

    public static void main(String[ ] arg){
        details d = new details();
    }
}
