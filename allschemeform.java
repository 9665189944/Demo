import java.awt.*;


import java.awt.event.*;


import javax.swing.*;


import java.util.*;


class allschemeform extends JFrame implements ActionListener




{


 JLabel l,label,image;
 ImageIcon img;

	

JButton b1,b2,b3,b4,b5;


allschemeform()
{
l=new JLabel("All Schemes");

  l.setBounds(400,5,300,30);
l.setFont(new Font("Caladea",Font.PLAIN,35));

   img=new ImageIcon("flower.jpg");

        image=new JLabel(img);

        add(image);

        image.setBounds(0,0,1000,700);



b1=new JButton("Household Security");
 b1.setBounds(400,50,190,30);

 b2=new JButton("Idustrial Security");
  b2.setBounds(400,90,190,30);
b3=new JButton("Personal Security");
   b3.setBounds(400,130,190,30);
b4=new JButton("School/College");
   b4.setBounds(400,170,190,30);
b5=new JButton("Back");
 b5.setBounds(400,210,190,30);

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

  }

public void actionPerformed(ActionEvent e)
{
 if(e.getSource()==b1)
{
new household();
}
if(e.getSource()==b2)
{
new industrial();
}
if(e.getSource()==b3)
{
new personal();
}
if(e.getSource()==b4)
{
new school();
}
if(e.getSource()==b5)
{
new customerallform();
}

}
  public static void main(String args[])
{
    new allschemeform();
}
}
