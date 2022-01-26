import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;
/*<applet code="Feedback" width=400 height=350></applet>*/
class feedbackform extends JFrame implements ActionListener
{
 JLabel img,l1,l2,label,l5;
 JTextField t1,t2;
 JButton b1,b2;
 TextArea t5;
 JRadioButton c1,c2,c3;
 ButtonGroup bg;

   public feedbackform()
 {
  Container pane=getContentPane();
  pane.setLayout(null);
  img=new JLabel("");
  img.setIcon(new ImageIcon("1.jpg"));
  img.setBounds(30,-700,2000,2000);

   label=new JLabel(" Feedback Form");
     label.setFont(new Font("Times new roman",Font.BOLD,35));
    label.setForeground(Color. black);
    label.setBounds(450,10,400,80);
    pane.add(label); 

    label=new JLabel("Feedback Type :");
    label.setFont(new Font("Times new roman",Font.BOLD,18));
   label.setForeground(Color.white);
   label.setBounds(120,50,400,100);
    pane.add(label);
   ButtonGroup bg=new ButtonGroup();
   c1=new JRadioButton("  Comments");
   c1.setFont(new Font("Times new roman",Font.BOLD,18));
   c1.setForeground(Color. black);
   c1.setBounds(100,130,160,30);
   c2=new JRadioButton(" Bug Reports");
   c2.setFont(new Font("Times new roman",Font.BOLD,18));
   c2.setForeground(Color. black);
   c2.setBounds(350,130,160,30);
   c3=new JRadioButton("Questions");
   c3.setFont(new Font("Times new roman",Font.BOLD,18));
   c3.setForeground(Color. black);
   c3.setBounds(650,130,160,30);


 l1=new JLabel("Enter Your Name            :");
   l1.setFont(new Font("Times new roman",Font.BOLD,18));
    l1.setForeground(Color. white);
   l1.setBounds(120,180,260,50);

   t1=new JTextField(10);
   t1.setBounds(390,180,230,30);


 l2=new JLabel("Enter Email-ID                :");
   l2.setFont(new Font("Times new roman",Font.BOLD,18));
    l2.setForeground(Color. white);
   l2.setBounds(120,230,260,50);

   t2=new JTextField(10);
   t2.setBounds(390,230,230,30);



 l5=new JLabel("Describe Feedback        :");
   l5.setFont(new Font("Times new roman",Font.BOLD,18));
    l5.setForeground(Color. white);
   l5.setBounds(120,280,260,50);

 t5=new TextArea(10,15);
   t5.setBounds(390,280,230,100);
 


   b1=new JButton("Submit");
   b1.setFont(new Font("Times new roman",Font.BOLD,15));
    b1.setForeground(Color. black);
   b1.setBounds(250,500,100,30);
 b2=new JButton("Cancel");
   b2.setFont(new Font("Times new roman",Font.BOLD,15));
    b2.setForeground(Color. black);
   b2.setBounds(430,500,100,30);



 pane.add(c1);
 pane.add(c2);
 pane.add(c3);
 pane.add(l1);
 pane.add(t1);
  pane.add(l2);
  pane.add(t2);
  pane.add(l5);
  pane.add(t5);
  pane.add(b1);
  pane.add(b2);
 b1.addActionListener(this);
 b2.addActionListener(this);

 
  pane.add(img);

  setTitle("Feedback Form");
  setSize(2000,2000);
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
          String Ename=t1.getText();
          String Eid=t2.getText();
           String Dfeedback=t5.getText();
          
           
          
                       
   Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost/security","root","");



      Statement stmt=con.createStatement();


 String sql="insert into Feedback values('"+Ename+"','"+Eid+"','"+Dfeedback+"')";

         stmt.executeUpdate(sql);

     JOptionPane.showMessageDialog(null,"Record Inserted");  
          new thanku();
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
  new feedbackform();
 } 
}

