import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;
/*<applet code="idustrial" width=400 height=350></applet>*/
class industrial extends JFrame implements ActionListener
{
 JLabel img,img1,label,label1,label2,label3,label4,label5,label6,label7,label8,label9;
  JButton b1,b2;
  ButtonGroup bg;

   public industrial()
 {
  Container pane=getContentPane();
  pane.setLayout(null);

   label9=new JLabel("Industrial Security:");
    label9.setFont(new Font("Times new roman",Font.BOLD,30));
    label9.setForeground(Color. black);
    label9.setBounds(20,00,1300,40);
    pane.add(label9);

  img=new JLabel("");
  img.setIcon(new ImageIcon("industrialgaurd.jpg"));
  img.setBounds(400,-250,500,800);
  
/*  img1=new JLabel("");
  img1.setIcon(new ImageIcon("industrialgaurd2.jpg"));
  img1.setBounds(400,-250,800,800);
*/
   label=new JLabel("Our agency is a business corporation, which provides armed and unarmed security services and expertise to");
     label.setFont(new Font("Times new roman",Font.BOLD,20));
    label.setForeground(Color. black);
    label.setBounds(20,340,1300,50);
    pane.add(label);

label1=new JLabel("private and public clients for their industry. Our agency is primarily engaged in providing guard and patrol");
     label1.setFont(new Font("Times new roman",Font.BOLD,20));
    label1.setForeground(Color. black);
    label1.setBounds(20,370,1300,50);
    pane.add(label1);

label2=new JLabel("services, such as bodyguard, guard dog, parking security and security guard services. Many of them will even");
     label2.setFont(new Font("Times new roman",Font.BOLD,20));
    label2.setForeground(Color. black);
    label2.setBounds(20,400,1300,50);
    pane.add(label2);

label3=new JLabel("provide advanced special operations services if the client demands it. Examples of services provided by our");
     label3.setFont(new Font("Times new roman",Font.BOLD,20));
    label3.setForeground(Color. black);
    label3.setBounds(20,430,1300,50);
    pane.add(label3);

label4=new JLabel("company include the prevention of unauthorized activity or entry, traffic regulation, access control, and fire");
     label4.setFont(new Font("Times new roman",Font.BOLD,20));
    label4.setForeground(Color. black);
    label4.setBounds(20,460,1300,50);
    pane.add(label4);

label5=new JLabel("and theft prevention and detection. These services can be broadly described as the protection of personnel");
     label5.setFont(new Font("Times new roman",Font.BOLD,20));
    label5.setForeground(Color. black);
    label5.setBounds(20,490,1300,50);
    pane.add(label5);

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

/* label8=new JLabel("from your house or in night there is risk from Thieves. So we give you the well-trained,well educated,trusted Guards.");
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
new afterselectsecurity2();
}

else if(e.getSource()==b2)
 {
  new allschemeform();
}
}
 
   public static void main(String args[])
 {
  new industrial();
 } 
}


