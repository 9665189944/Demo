import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import java.util.*;

class allloginform extends JFrame implements ActionListener

{

 JLabel l,label,image;
 ImageIcon img;

JButton b1,b2,b3,b4;

allloginform()
{
l=new JLabel("");

  l.setBounds(600,50,300,30);
l.setFont(new Font("Caladea",Font.PLAIN,35));


   img=new ImageIcon("sample.jpg");

       image=new JLabel(img);

        add(image);

        image.setBounds(0,0,1000,700);



b1=new JButton("Customer Login or Registration");
 b1.setBounds(600,100,280,30);

 b2=new JButton("Employee Login or Registration");
  b2.setBounds(600,140,280,30);

b3=new JButton("Admin Login");
   b3.setBounds(600,180,280,30);

b4=new JButton("Cancel");
  b4.setBounds(680,220,120,30);


Container pane=getContentPane();

setVisible(true);
  pane.setLayout(null);

    setSize(800,800);

    setLocation(200,200);

   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

pane.add(l);

  pane.add(b1);
b1.addActionListener(this);
  pane.add(b2);
b2.addActionListener(this);
pane.add(b3);
b3.addActionListener(this);
pane.add(b4);
b4.addActionListener(this);
pane.add(image);

  }

public void actionPerformed(ActionEvent e)
{
 if(e.getSource()==b1)
{
new customerlogin();
}
if(e.getSource()==b2)
{
new employeelogin();
}
if(e.getSource()==b3)
{
new adminlogin();
}
if(e.getSource()==b4)
{
new thanku();
}
}
  public static void main(String args[])
{
    new allloginform();
}
}


