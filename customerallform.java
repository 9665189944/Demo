import java.awt.*;


import java.awt.event.*;


import javax.swing.*;


import java.util.*;


class customerallform extends JFrame implements ActionListener




{


 JLabel l,label,image;
 ImageIcon img;



JButton b1,b2,b3,b4,b5,b6;


customerallform()
{
l=new JLabel("Main Screen");

  l.setBounds(400,5,300,30);
l.setFont(new Font("Arial",Font.PLAIN,35));

img=new ImageIcon("flower.jpg");
image=new JLabel(img);

        add(image);

        image.setBounds(0,0,1000,700);


b1=new JButton("Profile");
 b1.setBounds(400,50,150,30);

 b2=new JButton("All Schemes");
  b2.setBounds(400,90,150,30);
b3=new JButton("Declaration Form");
   b3.setBounds(400,140,170,30);
b4=new JButton("Payment");
   b4.setBounds(400,180,180,30);
b5=new JButton("Feedback");
 b5.setBounds(400,220,170,30);
b6=new JButton("Logout");
 b6.setBounds(400,260,170,30);


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
pane.add(b5);
b5.addActionListener(this);
pane.add(b6);
b6.addActionListener(this);
  }

public void actionPerformed(ActionEvent e)
{
 if(e.getSource()==b1)
{
new customerprofile();
}
if(e.getSource()==b2)
{
new allschemeform();
}
if(e.getSource()==b3)
{
new declarationform();
}

if(e.getSource()==b4)
{
new paymentform();
}
if(e.getSource()==b5)
{
new feedbackform();
}
if(e.getSource()==b6)
{
new thanku();
}


}
  public static void main(String args[])
{
    new customerallform();
}
}


