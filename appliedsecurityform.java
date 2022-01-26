import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;
/*<applet code="identify" width=400 height=350></applet>*/
class appliedsecurityform extends JFrame implements ActionListener
{
 JLabel img,label,label1;
  JButton b1,b2;
  ButtonGroup bg;

   public appliedsecurityform()
 {
  Container pane=getContentPane();
  pane.setLayout(null);

  img=new JLabel("");
  img.setIcon(new ImageIcon("redrose.jpg"));
  img.setBounds(0,-200,1040,1040);
  label=new JLabel("Cogratulations");
     label.setFont(new Font("Bitstream Charter",Font.BOLD,40));
    label.setForeground(Color. black);
    label.setBounds(600,200,500,50);
    pane.add(label);
   label1=new JLabel("Your scheme has been seccessfully applied,please follow the next process.");
     label1.setFont(new Font("Bitstream Charter",Font.BOLD,18));
    label1.setForeground(Color. black);
    label1.setBounds(400,250,700,50);
    pane.add(label1);



    b1=new JButton("Next");
    b1.setFont(new Font("Times new roman",Font.BOLD,15));
 b1.setForeground(Color. black);
    b1.setBounds(500,350,100,30);

   b2=new JButton("Back");
   b2.setFont(new Font("Times new roman",Font.BOLD,15));
    b2.setForeground(Color. black);
   b2.setBounds(650,350,100,30);

  pane.add(b1);
  pane.add(b2);
  b1.addActionListener(this);
  b2.addActionListener(this);
  pane.add(img);

  setTitle("Identifying Images");
  setSize(800,800);
  setLocation(200,200);
  setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }


 public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)

{
new declarationform();
}

else if(e.getSource()==b2)
 {
  new customerallform();
}
}

   public static void main(String args[])
 {
  new appliedsecurityform();
 }
}




