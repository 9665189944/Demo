import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class login extends JFrame implements ActionListener  
{
   JLabel img;
  JLabel label, l1,l2,l3;
   JTextField t1;
   JPasswordField t2;
   JButton b1,b2,b3;
   
   public login()
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



    label=new JLabel("Login!!!! ");
     label.setFont(new Font("Times new roman",Font.BOLD,35));
    label.setForeground(Color. black);
    label.setBounds(400,50,170,45);
    pane.add(label); 
   
    l1=new JLabel("User Name :");
    l1.setFont(new Font("Times new roman",Font.BOLD,18));
    l1.setForeground(Color.orange);
    l1.setBounds(380,150,170,45);
    pane.add(l1); 

    l2=new JLabel("Password :");
    l2.setFont(new Font("Times new roman",Font.BOLD,18));
    l2.setForeground(Color.orange);
    l2.setBounds(380,220,170,45);
    pane.add(l2); 

    

    t1=new JTextField(20);
    t1.setBounds(510,160,150,30);
    pane.add(t1);

    t2=new JPasswordField(20);
    t2.setBounds(510,230,150,30);
    t2.setEchoChar('*'); 
    pane.add(t2);

    b1=new JButton("Login");
    b1.setFont(new Font("Times new roman",Font.BOLD,15));
    b1.setForeground(Color.black);
    b1.addActionListener(this);
    b1.setBounds(200,350,90,30);
    pane.add(b1);

    b2=new JButton("Cancel");
    b2.setFont(new Font("Times new roman",Font.BOLD,15));
    b2.setForeground(Color.black);
    b2.addActionListener(this);
    b2.setBounds(350,350,100,30);
     pane.add(b2);

//l3=new JLabel("Sign up for new user :");
  //l3.setFont(new Font("Times new roman",Font.BOLD,18));
   //l3.setForeground(Color.black);
    //l3.setBounds(350,450,300,30);
    //pane.add(l3);

   b3=new JButton("Registration");
    b3.setFont(new Font("Times new roman",Font.BOLD,15));
    b3.setForeground(Color.black);
    b3.addActionListener(this);
    b3.setBounds(500,350,150,30);
     pane.add(b3);
    pane.add(img);
    
}

public void actionPerformed(ActionEvent e)
{
/* if(e.getSource()==b1)
 {
   
    if(t1.getText().equals("mona") && t2.getText().equals("shruti"))
 {
 
 JOptionPane.showMessageDialog(null,"Login Successfully");
 new hmscrn1();
 }
 else
 {
  JOptionPane.showMessageDialog(null,"Invalid User Name or Password");
 }
 }
*/
 if(e.getSource()==b2)
{
  new thanku();
}
/*if(e.getSource()==b3)
{
  new register();
}*/
}
 public static void main(String args[])
 {
   new login();
 }
}
 

