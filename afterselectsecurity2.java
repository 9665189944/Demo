import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;
/*<applet code="register" width=400 height=350></applet>*/
class afterselectsecurity2 extends JFrame implements ActionListener
{
 JLabel img,l1,l2,l3,l4,l5,l6,label,label1,label2;
 JTextField t1,t2,t3,t4,t5;
 JButton b1,b2;
 JRadioButton c1,c2;
 ButtonGroup bg;

   public afterselectsecurity2()
 {
  Container pane=getContentPane();
  pane.setLayout(null);

  img=new JLabel("");
  img.setIcon(new ImageIcon("registration.jpg"));
  img.setBounds(0,-200,1050,1050);

     label=new JLabel("APPLY HERE...");
     label.setFont(new Font("Times new roman",Font.BOLD,30));
     label.setForeground(Color. orange);
     label.setBounds(250,50,400,50);
     pane.add(label); 

     label1=new JLabel("Security Type : Industrial Security");
     label1.setFont(new Font("Times new roman",Font.BOLD,25));
     label1.setForeground(Color.red);
     label1.setBounds(250,130,800,50);
     pane.add(label1);


   l1=new JLabel("Customer Name :");
   l1.setFont(new Font("Times new roman",Font.BOLD,18));
    l1.setForeground(Color. orange);
   l1.setBounds(250,180,230,30);

   t1=new JTextField(10);
   t1.setBounds(480,180,100,30);

   l2=new JLabel(" Address:");
   l2.setFont(new Font("Times new roman",Font.BOLD,18));
    l2.setForeground(Color. orange);
   l2.setBounds(250,230,250,30);

   t2=new JTextField(10);
   t2.setBounds(480,230,100,30);  

   l3=new JLabel("Contact no:");
   l3.setFont(new Font("Times new roman",Font.BOLD,18));
    l3.setForeground(Color. orange);
   l3.setBounds(250,280,180,30);

   t3=new JTextField(10);
   t3.setBounds(480,280,100,30);

 
   l4=new JLabel("Email ID :");
   l4.setFont(new Font("Times new roman",Font.BOLD,18));
    l4.setForeground(Color. orange);
   l4.setBounds(250,330,160,30);
  
   t4=new JTextField(10);
   t4.setBounds(480,330,100,30);   

   l5=new JLabel("Date Of Birth :");
   l5.setFont(new Font("Times new roman",Font.BOLD,18));
   l5.setForeground(Color. orange);
   l5.setBounds(250,370,170,30);
  
   t5=new JTextField(10);
   t5.setBounds(480,370,100,30);    


     label2=new JLabel("Cost       :          1,00,000");
     label2.setFont(new Font("Times new roman",Font.BOLD,25));
     label2.setForeground(Color.red);
     label2.setBounds(250,410,830,50);
     pane.add(label2);

    l6=new JLabel("Gender :");
    l6.setFont(new Font("Times new roman",Font.BOLD,18));
    l6.setForeground(Color. orange);
    l6.setBounds(250,470,160,30);

  
   ButtonGroup bg=new ButtonGroup();
   c1=new JRadioButton("Male");
   c1.setFont(new Font("Times new roman",Font.BOLD,18));
    c1.setForeground(Color. orange);
   c1.setBounds(460,470,100,30);
   c2=new JRadioButton("Female");
   c2.setFont(new Font("Times new roman",Font.BOLD,18));
    c2.setForeground(Color. orange);
   c2.setBounds(560,470,100,30);

   b1=new JButton("Submit");
   b1.setFont(new Font("Times new roman",Font.BOLD,15));
   b1.setForeground(Color. black);
   b1.setBounds(250,550,100,30);

   b2=new JButton("Cancel");
   b2.setFont(new Font("Times new roman",Font.BOLD,15));
   b2.setForeground(Color. black);
   b2.setBounds(370,550,100,30);
 
  pane.add(l1);
  pane.add(t1);
  pane.add(l2);
  pane.add(t2);
  pane.add(l3);
  pane.add(t3);
  pane.add(l4);
  pane.add(t4);
  pane.add(l5);
  pane.add(t5);
  pane.add(l6);
  pane.add(c1);
  pane.add(c2);
  bg.add(c1);
  bg.add(c2);
  pane.add(b1);
  pane.add(b2);
  b1.addActionListener(this);
  b2.addActionListener(this);
  pane.add(img);

  setTitle("after select security");
  setSize(800,800);
  setLocation(200,200);
  setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }


 public void actionPerformed(ActionEvent e)

{

     if(e.getSource()==b1)

{

   try

 {      
          String custname=t1.getText();
          String custaddr=t2.getText();
           String custno=t3.getText();
           String custemail=t4.getText();
           String custdob=t5.getText();
           
          
                       
   Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost/security","root","");



      Statement stmt=con.createStatement();


 String sql="insert into selectsecurity2  values('"+custname+"','"+custaddr+"','"+custno+"','"+custemail+"','"+custdob+"')";

         stmt.executeUpdate(sql);

     JOptionPane.showMessageDialog(null,"Record Inserted");  
          new declarationform();
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

  
 else if(e.getSource()==b2)
 {
  new thanku();
}
}
 
   public static void main(String args[])
 {
  new afterselectsecurity2();
 } 
}

