import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;
/*<applet code="register" width=400 height=350></applet>*/
class hongkong  extends JFrame /*implements ActionListener*/
{
 JLabel img,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,label;
 JLabel t1,t2,t3,t4,t5,t7,t9;
 JButton b1,b4;
 JRadioButton c1,c2,c3,c4;
 JTextField t6;
 ButtonGroup bg,bg1;

   public hongkong()
 {
  Container pane=getContentPane();
  pane.setLayout(null);

  img=new JLabel("");
  img.setIcon(new ImageIcon("Goa.jpg"));
  img.setBounds(0,-200,1040,1040);

   label=new JLabel("Goa Details");
     label.setFont(new Font("Times new roman",Font.BOLD,35));
    label.setForeground(Color. black);
    label.setBounds(270,50,400,50);
    pane.add(label);
 
   l1=new JLabel("place ID :");
   l1.setFont(new Font("Times new roman",Font.BOLD,18));
    l1.setForeground(Color. black);
   l1.setBounds(250,130,170,30);

   t1=new JLabel("121");
   t1.setFont(new Font("Times new roman",Font.BOLD,18));
    t1.setForeground(Color. black);
   t1.setBounds(480,130,100,30);


   l2=new JLabel("place Name :");
   l2.setFont(new Font("Times new roman",Font.BOLD,18));
    l2.setForeground(Color. black);
   l2.setBounds(250,180,230,30);

   t2=new JLabel("Goa");
  t2.setFont(new Font("Times new roman",Font.BOLD,18));
    t2.setForeground(Color. black);
   t2.setBounds(480,180,100,30);

   l3=new JLabel("Discription:");
   l3.setFont(new Font("Times new roman",Font.BOLD,18));
    l3.setForeground(Color. black);
   l3.setBounds(250,230,250,30);

   t3=new JLabel("Goa with main beech,beech of sea water");
   t3.setFont(new Font("Times new roman",Font.BOLD,18));
    t3.setForeground(Color. black);
   t3.setBounds(480,230,100,30);  

   
    l4=new JLabel("Stay details :");
    l4.setFont(new Font("Times new roman",Font.BOLD,18));
    l4.setForeground(Color. black);
   l4.setBounds(250,280,180,30);
  
   t4=new JLabel("2 Days,1 Night");
  t4.setFont(new Font("Times new roman",Font.BOLD,18));
    t4.setForeground(Color. black);
   t4.setBounds(480,280,100,30);  

                               
    l5=new JLabel("Stay Rupees :");
    l5.setFont(new Font("Times new roman",Font.BOLD,18));
    l5.setForeground(Color. black);
   l5.setBounds(250,330,140,30);
  
   t5=new JLabel("2500 per head");
  t5.setFont(new Font("Times new roman",Font.BOLD,18));
    t5.setForeground(Color. black);
  t5.setBounds(480,330,100,30);
 
  
 
    l6=new JLabel("Extra Facility :");
    l6.setFont(new Font("Times new roman",Font.BOLD,18));
    l6.setForeground(Color. black);
    l6.setBounds(250,380,160,30);
  
   ButtonGroup bg=new ButtonGroup();
   c1=new JRadioButton("Yes");
   c1.setFont(new Font("Times new roman",Font.BOLD,18));
    c1.setForeground(Color. black);
   c1.setBounds(460,380,100,30);
   c2=new JRadioButton("No");
   c2.setFont(new Font("Times new roman",Font.BOLD,18));
    c2.setForeground(Color. black);
   c2.setBounds(560,380,100,30);

                               
    l7=new JLabel("Date Of Journey :");
    l7.setFont(new Font("Times new roman",Font.BOLD,18));
    l7.setForeground(Color. black);
   l7.setBounds(250,430,170,30);
  
   t6=new JTextField(10);
   t6.setBounds(480,430,100,30);

                               
    l8=new JLabel("place State :");
    l8.setFont(new Font("Times new roman",Font.BOLD,18));
    l8.setForeground(Color. black);
   l8.setBounds(250,480,140,30);
  
   t7=new JLabel("Gujrat");
  t7.setFont(new Font("Times new roman",Font.BOLD,18));
    t7.setForeground(Color. black);
 t7.setBounds(480,470,100,30);
 

                               
    l9=new JLabel("have a food :");
    l9.setFont(new Font("Times new roman",Font.BOLD,18));
    l9.setForeground(Color. black);
   l9.setBounds(250,510,120,30);
  

 ButtonGroup bg1=new ButtonGroup();
   c3=new JRadioButton("Yes");
   c3.setFont(new Font("Times new roman",Font.BOLD,18));
    c3.setForeground(Color. black);
   c3.setBounds(480,510,100,30);
   c4=new JRadioButton("No");
   c4.setFont(new Font("Times new roman",Font.BOLD,18));
    c4.setForeground(Color. black);
   c4.setBounds(580,380,100,30);
   

                               
    l10=new JLabel("total RS :");
    l10.setFont(new Font("Times new roman",Font.BOLD,18));
    l10.setForeground(Color. black);
   l10.setBounds(250,550,100,30);
  
   t9=new JLabel("3000");
t9.setFont(new Font("Times new roman",Font.BOLD,18));
    t9.setForeground(Color. black);

   t9.setBounds(480,550,100,30);
 

    b1=new JButton("Submit");
   b1.setFont(new Font("Times new roman",Font.BOLD,15));
    b1.setForeground(Color. black);
   b1.setBounds(250,590,100,30);


b4=new JButton("Cancel");
   b4.setFont(new Font("Times new roman",Font.BOLD,15));
    b4.setForeground(Color. black);
   b4.setBounds(500,590,100,30);


 
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
  pane.add(l7);
  pane.add(t6);
  pane.add(l8);
  pane.add(t7);
  pane.add(l9);
  pane.add(c3);
  pane.add(c4);
  pane.add(l10);
  pane.add(t9);

  bg.add(c1);
  bg.add(c2);
   bg1.add(c3);
  bg1.add(c4);

  pane.add(b1);

 pane.add(b4);

// b1.addActionListener(this);
 //b4.addActionListener(this);
 pane.add(img);

  setTitle("Place Details");
  setSize(1000,1000);
  setLocation(200,200);
  setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }


/* public void actionPerformed(ActionEvent e)

{

     if(e.getSource()==b1)

{

   try

 {          int cid=Integer.parseInt(t1.getText());
          String cname=t2.getText();
          String caddr=t3.getText();
           String dob=t4.getText();
            int age=Integer.parseInt(t5.getText());
            String date_of_arrest=t6.getText();
           String cinv_in=t7.getText();
         int imgid=Integer.parseInt(t8.getText());
          String imgname=t9.getText();
          
          
                       
   Class.forName("com.mysql.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost/nurserydb","root","");



      Statement stmt=con.createStatement();


 String sql="insert into customerdetails values("+cid+",'"+cname+"','"+caddr+"','"+dob+"',"+age+",'"+date_of_arrest+"','"+cinv_in+"',"+imgid+",'"+imgname+"')";

         stmt.executeUpdate(sql);

     JOptionPane.showMessageDialog(null,"Record Inserted");  
          criminaldetails cd=new criminaldetails();
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
    try
  {
Class.forName("com.mysql.jdbc.Driver");
  Connection con=DriverManager.getConnection("jdbc:mysql://localhost/nurserydb","root","");

       Statement stmt=con.createStatement();

int cid=Integer.parseInt(t1.getText());
          String cname=t2.getText();
          String caddr=t3.getText();
           String dob=t4.getText();
            int age=Integer.parseInt(t5.getText());
            String date_of_arrest=t6.getText();
           String cinv_in=t7.getText();
         int imgid=Integer.parseInt(t8.getText());
          String imgname=t9.getText();
          //String gender=
 String sql="update criminaldetails set cid="+cid+",cname='"+t2.getText()+"',caddr='"+t3.getText()+"',dob='"+t4.getText()+"',age="+t5.getText()+",date_of_arrest='"+t6.getText()+"',cinv_in='"+t7.getText()+"',imgid="+t8.getText()+",imgname='"+t9.getText()+"' where cid="+cid;
      stmt.executeUpdate(sql);
     JOptionPane.showMessageDialog(null,"Record Updated");  
}
catch(SQLException se)
{

JOptionPane.showMessageDialog(null,"sorry sql:"+se); 
}
 catch(Exception ee)
{
     JOptionPane.showMessageDialog(null,"sorry:"+ee);  
 }
 }

else if(e.getSource()==b3)
{
    try
  {
     int n=Integer.parseInt(t1.getText());
  Class.forName("com.mysql.jdbc.Driver");
  Connection con=DriverManager.getConnection("jdbc:mysql://localhost/nurserydb","root","");
     Statement stmt=con.createStatement();
    String sql="DELETE FROM customerdetails where cid="+n;
          stmt.executeUpdate(sql);
      JOptionPane.showMessageDialog(null,"Record Deleted"); 
     }
  catch(SQLException se)
{

JOptionPane.showMessageDialog(null,"sorry"); 
}
 catch(Exception ee)
{
     JOptionPane.showMessageDialog(null,"sorry");  
 }
 }


else if(e.getSource()==b4)
 {
  new thank();
}
}*/
 
   public static void main(String args[])
 {
  new hongkong();
 } 
}



