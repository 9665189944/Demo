import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;
/*<applet code="identify" width=400 height=350></applet>*/
class household extends JFrame implements ActionListener
{
 JLabel img,img1,label,label1,label2,label3,label4,label5,label6,label7,label8;
  JButton b1,b2;
  ButtonGroup bg;

   public household()
 {
  Container pane=getContentPane();
  pane.setLayout(null);

/*  img=new JLabel("");
  img.setIcon(new ImageIcon("gaurd.jpg"));
  img.setBounds(200,-250,500,800);*/
  
  img1=new JLabel("");
  img1.setIcon(new ImageIcon("cctv.jpg"));
  img1.setBounds(400,-250,800,800);

   label=new JLabel("Home security systems work on the simple concept of securing entry points into a home with sensors that");
     label.setFont(new Font("Times new roman",Font.BOLD,20));
    label.setForeground(Color. black);
    label.setBounds(20,320,1300,50);
    pane.add(label);

label1=new JLabel("communicate with a control panel or command center installed in a convenient location somewhere in the home.");
     label1.setFont(new Font("Times new roman",Font.BOLD,20));
    label1.setForeground(Color. black);
    label1.setBounds(20,350,1300,50);
    pane.add(label1);

label2=new JLabel("A typical home security system includes: A control panel, which is the primary controller of a home’s security");
     label2.setFont(new Font("Times new roman",Font.BOLD,20));
    label2.setForeground(Color. black);
    label2.setBounds(20,380,1300,50);
    pane.add(label2);

label3=new JLabel("system Door and window sensors Motion sensors, both interior and exterior Wired or wireless security");
     label3.setFont(new Font("Times new roman",Font.BOLD,20));
    label3.setForeground(Color. black);
    label3.setBounds(20,410,1300,50);
    pane.add(label3);

label4=new JLabel("cameras A high-decibel siren or alarm A yard sign and window stickers");
     label4.setFont(new Font("Times new roman",Font.BOLD,20));
    label4.setForeground(Color. black);
    label4.setBounds(20,440,1300,50);
    pane.add(label4);

label5=new JLabel("Surveillance Cameras: Available in both wired and wireless configurations, surveillance cameras can be used");
     label5.setFont(new Font("Times new roman",Font.BOLD,20));
    label5.setForeground(Color. black);
    label5.setBounds(20,470,1300,50);
    pane.add(label5);

label6=new JLabel("in several different ways as part of an overall security system.");
     label6.setFont(new Font("Times new roman",Font.BOLD,20));
    label6.setForeground(Color. black);
    label6.setBounds(20,500,1300,50);
    pane.add(label6);

label7=new JLabel("Home Gaurd : It is very essential to put home gaurd behind your house gate, because when you are outside");
     label7.setFont(new Font("Times new roman",Font.BOLD,20));
    label7.setForeground(Color. black);
    label7.setBounds(20,530,1300,50);
    pane.add(label7);

label8=new JLabel("from your house or in night there is risk from Thieves. So we give you the well-trained,well educated,trusted Guards.");
     label8.setFont(new Font("Times new roman",Font.BOLD,20));
    label8.setForeground(Color. black);
    label8.setBounds(20,560,1400,50);
    pane.add(label8);
 
    b1=new JButton("Next");
    b1.setFont(new Font("Times new roman",Font.BOLD,15));
    b1.setForeground(Color. black);
    b1.setBounds(500,650,100,30);

   b2=new JButton("Back");
   b2.setFont(new Font("Times new roman",Font.BOLD,15));
    b2.setForeground(Color. black);
   b2.setBounds(700,650,100,30);
 
  pane.add(b1);
  pane.add(b2);
  b1.addActionListener(this);
  b2.addActionListener(this);
 // pane.add(img);
  pane.add(img1);

  setTitle("Identifying Image");
  setSize(800,800);
  setLocation(200,200);
  setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }


 public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)

{
new afterselectsecurity();
}

else if(e.getSource()==b2)
 {
  new allschemeform();
}
}
 
   public static void main(String args[])
 {
  new household();
 } 
}


