import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
public class checkpayment extends JFrame implements ActionListener  
{
   JLabel img;
  JLabel label, l1,l2,l3,l4;
   JTextField t1;
JTextField t3;
JTextField t4;

   JTextField t2;
   JButton b1,b2,b3;
   
   public checkpayment()
  {
    
    Container pane=getContentPane();
    pane.setLayout(null);
    setVisible(true);
    setSize(800,800); 
    setLocation(0,0);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("LOGIN PAGE");
    //setBackground(Color.pink);
    
     img=new JLabel();
  img.setIcon(new ImageIcon("abc.jpg"));
  img.setBounds(0,-200,1040,1040);



    label=new JLabel("Check Payment Form ");
     label.setFont(new Font("Times new roman",Font.BOLD,25));
    label.setForeground(Color. black);
    label.setBounds(300,70,400,45);
    pane.add(label); 
   
    l1=new JLabel("Holder Name:");
    l1.setFont(new Font("Times new roman",Font.BOLD,18));
    l1.setForeground(Color.orange);
    l1.setBounds(380,150,170,45);
    pane.add(l1); 

    l2=new JLabel("Bank Name:");
    l2.setFont(new Font("Times new roman",Font.BOLD,18));
    l2.setForeground(Color.orange);
    l2.setBounds(370,220,170,45);
    pane.add(l2);

    l3=new JLabel("Check No.:");
    l3.setFont(new Font("Times new roman",Font.BOLD,18));
    l3.setForeground(Color.orange);
    l3.setBounds(380,300,170,45);
    pane.add(l3);

    l4=new JLabel("Amount:");
    l4.setFont(new Font("Times new roman",Font.BOLD,18));
    l4.setForeground(Color.orange);
    l4.setBounds(380,370,170,45);
    pane.add(l4);
 

  

    t1=new JTextField(20);
    t1.setBounds(530,160,150,30);
    pane.add(t1);

    t2=new JTextField(20);
    t2.setBounds(530,230,150,30);
  //  t2.setEchoChar('*'); 
    pane.add(t2);

    t3=new JTextField(20);
    t3.setBounds(530,300,150,30);
    pane.add(t3);

    t4=new JTextField(20);
    t4.setBounds(530,370,150,30);
   // t4.setEchoChar('*');
    pane.add(t4);


    b1=new JButton("Next");
    b1.setFont(new Font("Times new roman",Font.BOLD,15));
    b1.setForeground(Color.black);
    b1.addActionListener(this);
    b1.setBounds(200,440,90,30);
    pane.add(b1);

    b2=new JButton("Cancel");
    b2.setFont(new Font("Times new roman",Font.BOLD,15));
    b2.setForeground(Color.black);
    b2.addActionListener(this);
    b2.setBounds(350,440,100,30);
     pane.add(b2);

//l3=new JLabel("Sign up for new user :");
  //l3.setFont(new Font("Times new roman",Font.BOLD,18));
   //l3.setForeground(Color.black);
    //l3.setBounds(350,450,300,30);
    //pane.add(l3);

   b3=new JButton("Logout");
    b3.setFont(new Font("Times new roman",Font.BOLD,15));
    b3.setForeground(Color.black);
    b3.addActionListener(this);
    b3.setBounds(500,440,150,30);
     pane.add(b3);
    pane.add(img);
    
}

public void actionPerformed(ActionEvent e)
{
 if(e.getSource()==b1)
 {
   
     try

 {      
          String hname=t1.getText();
          String bname=t2.getText();
           String cno=t3.getText();
           String amount=t4.getText();
           
           
          
                       
   Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost/security","root","");



      Statement stmt=con.createStatement();


 String sql="insert into checkbank values('"+hname+"','"+bname+"','"+cno+"','"+amount+"')";

         stmt.executeUpdate(sql);

     JOptionPane.showMessageDialog(null,"Record Inserted");  
          new successpaymentform();
}

catch(SQLException se)

{

JOptionPane.showMessageDialog(null,"sorry SQL:"+se); 

}

 catch(Exception ee)

{

     JOptionPane.showMessageDialog(null,"sorry:"+ee);  

 }
}

  

 if(e.getSource()==b2)
{
  new customerallform();
}
if(e.getSource()==b3)
{
  new thanku();
}
}
 public static void main(String args[])
 {
   new checkpayment();
 }
}
 

