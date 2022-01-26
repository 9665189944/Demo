import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;
/*<applet code="identify" width=400 height=350></applet>*/
class declarationform extends JFrame implements ActionListener
{
 JLabel img,label;
  JButton b1,b2;
  ButtonGroup bg;

   public declarationform()
 {
  Container pane=getContentPane();
  pane.setLayout(null);

  img=new JLabel("");
  img.setIcon(new ImageIcon("redrose.jpg"));
  img.setBounds(0,-200,1040,1040);

   label=new JLabel("I hereby accept all your terms and conditions.Information that i submit is correct as per my knowledge");
     label.setFont(new Font("Bitstream Charter",Font.BOLD,25));
    label.setForeground(Color. black);
    label.setBounds(100,250,1200,50);
    pane.add(label);



    b1=new JButton("Accept");
    b1.setFont(new Font("Times new roman",Font.BOLD,15));
 b1.setForeground(Color. black);
    b1.setBounds(500,350,100,30);

   b2=new JButton("Cancel");
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
new paymentform();
}

else if(e.getSource()==b2)
 {
  new customerallform();
}
}

   public static void main(String args[])
 {
  new declarationform();
 }
}




