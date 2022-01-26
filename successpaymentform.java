import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;
/*<applet code="identify" width=400 height=350></applet>*/
class successpaymentform extends JFrame implements ActionListener
{
 JLabel img,label;
  JButton b1;
  ButtonGroup bg;

   public successpaymentform()
 {
  Container pane=getContentPane();
  pane.setLayout(null);

  img=new JLabel("");
  img.setIcon(new ImageIcon("redrose.jpg"));
  img.setBounds(0,-200,1040,1040);



label=new JLabel("YOUR PAYMENT HAS BEEN SUCCESSFULLY PLACED....");
     label.setFont(new Font("Bitstream Charter",Font.BOLD,20));
    label.setForeground(Color. black);
    label.setBounds(400,190,710,50);
    pane.add(label);

    b1=new JButton("Back");

   b1.setFont(new Font("Times new roman",Font.BOLD,15));
    b1.setForeground(Color. black);
    b1.setBounds(600,260,180,35);

  
  pane.add(b1);
   b1.addActionListener(this);
    pane.add(img);

  setTitle("Back");
  setSize(800,800);
  setLocation(200,200);
  setVisible(true);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }


 public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)

{
new customerallform();
}

}

   public static void main(String args[])
 {
  new successpaymentform();
 }
}




