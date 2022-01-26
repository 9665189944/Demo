import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;
 import java.util.*;
 class thanku extends JFrame
 {
 JLabel l;
 
 
  thanku()
{
l=new JLabel("THANK YOU");
   l.setBounds(280,440,2000,70);
l.setFont(new Font("Arial",Font.ITALIC,80));  
 Container pane=getContentPane();
  JLabel img=new JLabel(" ");
  img.setIcon(new ImageIcon("camera.jpg"));
  setVisible(true);
  pane.setLayout(null);
    setSize(800,800); 
    setLocation(200,200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 pane.add(l);	

img.setBounds(320,90,500,300);
     pane.add(img);

   }
  public static void main(String args[])
  {  
    new thanku();
  }
}
