import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;
/*<applet code="school" width=400 height=350></applet>*/
class school extends JFrame implements ActionListener
{
 JLabel img,img1,label,label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11;
  JButton b1,b2;
  ButtonGroup bg;

   public school()
 {
  Container pane=getContentPane();
  pane.setLayout(null);

   label9=new JLabel("School/College Security:");
    label9.setFont(new Font("Times new roman",Font.BOLD,30));
    label9.setForeground(Color. black);
    label9.setBounds(20,00,1300,40);
    pane.add(label9);

  img=new JLabel("");
  img.setIcon(new ImageIcon("schoolcctv.jpg"));
 
 img.setBounds(200,-220,500,800);
  
  img1=new JLabel("");
  img1.setIcon(new ImageIcon("schoolgaurd.jpg"));
  img1.setBounds(700,-220,800,800);

   label=new JLabel("  Running a school is a huge responsibility. The larger the school, the more there is that can go wrong.");
     label.setFont(new Font("Times new roman",Font.BOLD,20));
    label.setForeground(Color. black);
    label.setBounds(20,300,1300,50);
    pane.add(label);

label1=new JLabel("Fortunately, surveillance technology can make your job a lot easier and your school a lot safer. Many schools");
     label1.setFont(new Font("Times new roman",Font.BOLD,20));
    label1.setForeground(Color. black);
    label1.setBounds(20,320,1300,50);
    pane.add(label1);

label2=new JLabel("have invested in surveillance technology and have reaped the benefits of having a more secured school.So we");
     label2.setFont(new Font("Times new roman",Font.BOLD,20));
    label2.setForeground(Color. black);
    label2.setBounds(20,340,1300,50);
    pane.add(label2);

label3=new JLabel("provide a school security.");
     label3.setFont(new Font("Times new roman",Font.BOLD,20));
    label3.setForeground(Color. black);
    label3.setBounds(20,360,1300,50);
    pane.add(label3);

label4=new JLabel("Deter Crime & Reduce Break-ins: When security cameras a placed in plain sight they have been shown to");
     label4.setFont(new Font("Times new roman",Font.BOLD,20));
    label4.setForeground(Color. black);
    label4.setBounds(20,380,1300,50);
    pane.add(label4);

label5=new JLabel("reduce criminal activity in that area. No one wants to be recorded on camera committing a crime. In fact");
     label5.setFont(new Font("Times new roman",Font.BOLD,20));
    label5.setForeground(Color. black);
    label5.setBounds(20,410,1300,50);
    pane.add(label5);

label6=new JLabel("students will point out the cameras to other students which will make everyone aware that their activities");
     label6.setFont(new Font("Times new roman",Font.BOLD,20));
    label6.setForeground(Color. black);
    label6.setBounds(20,430,1300,50);
    pane.add(label6);

label7=new JLabel("are being recorded. When students know they are being watched, they are usually on their best behavior.");
     label7.setFont(new Font("Times new roman",Font.BOLD,20));
    label7.setForeground(Color. black);
    label7.setBounds(20,450,1300,50);
    pane.add(label7);

 label8=new JLabel("Protect Vehicles: Keeping an eye on your schools’ parking lot will help to protect your staff’s vehicles. There");
     label8.setFont(new Font("Times new roman",Font.BOLD,20));
    label8.setForeground(Color. black);
    label8.setBounds(20,470,1400,50);
    pane.add(label8);

label10=new JLabel("are times when an incident occurs and it is hard to tell who is at fault. With the proper surveillance, you will");
     label10.setFont(new Font("Times new roman",Font.BOLD,20));
    label10.setForeground(Color. black);
    label10.setBounds(20,490,1400,50);
    pane.add(label10);

label11=new JLabel("know exactly what happened and who is at fault.");
     label11.setFont(new Font("Times new roman",Font.BOLD,20));
    label11.setForeground(Color. black);
    label11.setBounds(20,510,1400,50);
    pane.add(label11);
 
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
new afterselectsecurity4();
}

else if(e.getSource()==b2)
 {
  new allschemeform();
}
}
 
   public static void main(String args[])
 {
  new school();
 } 
}


