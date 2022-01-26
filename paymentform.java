
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;
/*<applet code="register" width=400 height=350></applet>*/
class paymentform extends JFrame implements ActionListener
{
 JLabel img,l1,l2,l3,label;
 JButton b1,b2,b3;
 ButtonGroup bg;

   public paymentform()
 {
  Container pane=getContentPane();
  pane.setLayout(null);

  img=new JLabel("");
  img.setIcon(new ImageIcon("asf.jpg"));
  img.setBounds(0,-200,1040,1040);

   label=new JLabel("PAYMENT DETAILS");
     label.setFont(new Font("Times new roman",Font.BOLD,35));
    label.setForeground(Color. black);
    label.setBounds(310,50,400,50);
    pane.add(label); 

   l1=new JLabel("Account No. - 04548100001529");
   l1.setFont(new Font("Times new roman",Font.BOLD,18));
    l1.setForeground(Color. black);
   l1.setBounds(340,180,700,30);

   l2=new JLabel(" IFSC Code - BARB0MURUMX");
   l2.setFont(new Font("Times new roman",Font.BOLD,18));
    l2.setForeground(Color. black);
   l2.setBounds(355,230,700,30);

   l3=new JLabel("Account holder name - Akshay Rajendra Doiphode");
   l3.setFont(new Font("Times new roman",Font.BOLD,18));
    l3.setForeground(Color. black);
   l3.setBounds(245,280,1100,30);

 
  


  
  b1=new JButton("Net Banking");
   b1.setFont(new Font("Times new roman",Font.BOLD,15));
    b1.setForeground(Color. black);
   b1.setBounds(260,350,170,30);

   b2=new JButton("Check Payment");
   b2.setFont(new Font("Times new roman",Font.BOLD,15));
    b2.setForeground(Color. black);
   b2.setBounds(510,350,170,30);

    b3=new JButton("Back");
   b3.setFont(new Font("Times new roman",Font.BOLD,15));
    b3.setForeground(Color. black);
   b3.setBounds(420,400,100,30);
 
  pane.add(l1);
   pane.add(l2);
   pane.add(l3);
  
  pane.add(b1);
  pane.add(b2);
  pane.add(b3);
 
b1.addActionListener(this);
  b2.addActionListener(this);
b3.addActionListener(this);
  pane.add(img);

  setTitle("PAYMENT DETAILS");
  setSize(800,800);
  setLocation(200,200);
  setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)

{
new netbanking();
}

else 

if(e.getSource()==b2)

{
new checkpayment();

}

if(e.getSource()==b3)

{
new customerallform();
}
}
   public static void main(String args[])
 {
  new paymentform();
 } 
}

