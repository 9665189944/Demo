import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;
/*<applet code="identify" width=400 height=350></applet>*/
class welcomeform extends JFrame implements ActionListener
{
 JLabel img,img1,label,label1,label2,label3,label4,label5,label6,label7,label8;
  JButton b1,b2;
  ButtonGroup bg;

   public welcomeform()
 {
  Container pane=getContentPane();
  pane.setLayout(null);

/*  img=new JLabel("");
  img.setIcon(new ImageIcon("ga.jpg"));
  img.setBounds(400,400,500,500);*/
  
  img1=new JLabel("");
  img1.setIcon(new ImageIcon("registration.jpg"));
  img1.setBounds(250,-150,500,800);

   label=new JLabel("WELCOME");
     label.setFont(new Font("Times new roman",Font.BOLD,20));
    label.setForeground(Color.red);
    label.setBounds(500,20,1300,50);
    pane.add(label);

label1=new JLabel("TO");
     label1.setFont(new Font("Times new roman",Font.BOLD,20));
    label1.setForeground(Color.red);
    label1.setBounds(550,60,1300,50);
    pane.add(label1);

label2=new JLabel("SECUTITY AGENCY");
     label2.setFont(new Font("Times new roman",Font.BOLD,20));
    label2.setForeground(Color.red);
    label2.setBounds(500,100,1300,50);
    pane.add(label2);

label3=new JLabel("DEVELOPED BY");
     label3.setFont(new Font("Times new roman",Font.BOLD,20));
    label3.setForeground(Color.red);
    label3.setBounds(500,140,1300,50);
    pane.add(label3);

label4=new JLabel("akhil santosh bhosale");
     label4.setFont(new Font("Times new roman",Font.BOLD,20));
    label4.setForeground(Color.red);
    label4.setBounds(500,180,1300,50);
    pane.add(label4);

label5=new JLabel("pranv mhadik");
     label5.setFont(new Font("Times new roman",Font.BOLD,20));
    label5.setForeground(Color.red);
    label5.setBounds(500,220,1300,50);
    pane.add(label5);


/*label7=new JLabel("");
     label7.setFont(new Font("Times new roman",Font.BOLD,20));
    label7.setForeground(Color. black);
    label7.setBounds(20,140,1300,50);
    pane.add(label7);

label8=new JLabel("from your house or in night there is risk from Thieves. So we give you the well-trained,well educated,trusted Guards.");
     label8.setFont(new Font("Times new roman",Font.BOLD,20));
    label8.setForeground(Color. black);
    label8.setBounds(20,560,1400,50);
    pane.add(label8);
*/ 
    b1=new JButton("Next");
    b1.setFont(new Font("Times new roman",Font.BOLD,15));
    b1.setForeground(Color. black);
    b1.setBounds(400,350,100,30);
    b2=new JButton("Cancel");
    b2.setFont(new Font("Times new roman",Font.BOLD,15));
    b2.setForeground(Color. black);
    b2.setBounds(500,350,100,30);
 
  pane.add(b1);
  pane.add(b2);
  b1.addActionListener(this);
  b2.addActionListener(this);
//pane.add(img);
  pane.add(img1);

  setTitle("Welcome Form");
  setSize(800,800);
  setLocation(200,200);
  setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }


 public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)

{
new allloginform();
}

else if(e.getSource()==b2)
 {
  new thanku();
}
}
 
   public static void main(String args[])
 {
  new welcomeform();
 } 
}


