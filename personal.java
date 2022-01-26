import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;
/*<applet code="personal" width=400 height=350></applet>*/
class personal extends JFrame implements ActionListener
{
 JLabel img,img1,label,label1,label2,label3,label4,label5,label6,label7,label8,label9;
  JButton b1,b2;
  ButtonGroup bg;

   public personal()
 {
  Container pane=getContentPane();
  pane.setLayout(null);

   label9=new JLabel("Personal Security:");
    label9.setFont(new Font("Times new roman",Font.BOLD,30));
    label9.setForeground(Color. black);
    label9.setBounds(20,00,1300,40);
    pane.add(label9);

  img=new JLabel("");
  img.setIcon(new ImageIcon("personalgaurd.jpg"));
  img.setBounds(400,-220,500,800);
  
/*  img1=new JLabel("");
  img1.setIcon(new ImageIcon("industrialgaurd2.jpg"));
  img1.setBounds(400,-300,800,800);
*/
   label=new JLabel("Our personal protection officers (bodyguards) are the elite security officers of Security Arsenal. All officers ");
     label.setFont(new Font("Times new roman",Font.BOLD,20));
    label.setForeground(Color. black);
    label.setBounds(20,370,1300,50);
    pane.add(label);

label1=new JLabel("receive very specialized training by the State of Texas and are certified to protect the clients ensuring their");
     label1.setFont(new Font("Times new roman",Font.BOLD,20));
    label1.setForeground(Color. black);
    label1.setBounds(20,400,1300,50);
    pane.add(label1);

label2=new JLabel("safety. But we also require training beyond the state requirements, because do you trust your life in the");
     label2.setFont(new Font("Times new roman",Font.BOLD,20));
    label2.setForeground(Color. black);
    label2.setBounds(20,430,1300,50);
    pane.add(label2);

label3=new JLabel("hands of a person that took a short class? We protect you as if you are our family!");
     label3.setFont(new Font("Times new roman",Font.BOLD,20));
    label3.setForeground(Color. black);
    label3.setBounds(20,460,1300,50);
    pane.add(label3);

label4=new JLabel("Personal Protection-Bodyguard Services Provided for: Witness Protection, Fortune 500 Executive Protection,");
     label4.setFont(new Font("Times new roman",Font.BOLD,20));
    label4.setForeground(Color. black);
    label4.setBounds(20,490,1300,50);
    pane.add(label4);

label5=new JLabel("Celebrity Protection, Dignitaries, CEO Protection, Overseas Travel Protection, Personal Protection. ");
     label5.setFont(new Font("Times new roman",Font.BOLD,20));
    label5.setForeground(Color. black);
    label5.setBounds(20,520,1300,50);
    pane.add(label5);
/*
label6=new JLabel("and/or assets. Other security services such as roving patrol, bodyguard, and guard dog services are also");
     label6.setFont(new Font("Times new roman",Font.BOLD,20));
    label6.setForeground(Color. black);
    label6.setBounds(20,520,1300,50);
    pane.add(label6);

label7=new JLabel("included, but are a very small portion of the industry.");
     label7.setFont(new Font("Times new roman",Font.BOLD,20));
    label7.setForeground(Color. black);
    label7.setBounds(20,550,1300,50);
    pane.add(label7);

 label8=new JLabel("from your house or in night there is risk from Thieves. So we give you the well-trained,well educated,trusted Guards.");
     label8.setFont(new Font("Times new roman",Font.BOLD,20));
    label8.setForeground(Color. black);
    label8.setBounds(20,570,1400,50);
    pane.add(label8);
*/ 
    b1=new JButton("Next");
    b1.setFont(new Font("Times new roman",Font.BOLD,15));
    b1.setForeground(Color. black);
    b1.setBounds(500,600,100,30);

   b2=new JButton("Back");
   b2.setFont(new Font("Times new roman",Font.BOLD,15));
    b2.setForeground(Color. black);
   b2.setBounds(700,600,100,30);
 
  pane.add(b1);
  pane.add(b2);
  b1.addActionListener(this);
  b2.addActionListener(this);
 pane.add(img);
 // pane.add(img1);

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
new afterselectsecurity3();
}

else if(e.getSource()==b2)
 {
  new allschemeform();
}
}
 
   public static void main(String args[])
 {
  new personal();
 } 
}


