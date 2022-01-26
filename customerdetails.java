import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.awt.event.*;
      
    public class customerdetails extends JFrame implements ActionListener
{   
        JFrame f; 
        JLabel l;
	JButton b1,b2; 
        customerdetails()
     {

/*    
img1=new JLabel();
  img1.setIcon(new ImageIcon("merge.jpg"));
setBounds(700,700,1000,1000);     
pane.add(img1);
img2=new JLabel();
  img2.setIcon(new ImageIcon("mumbai.jpg"));
pane.add(img2);
img3=new JLabel();
  img3.setIcon(new ImageIcon("agra_taj.jpg"));
pane.add(img3);
*/
        f=new JFrame();    
        String data[][]={ {"01","Omkar Lavand","Household","11000","3500","14500","omkarla43@gmail.com","Paid"},
                           {"02","Jay Yele","Personal","23000","3000","26000","jayyele6@gmail.com","Paid"},
                           {"03","Sai Gaikwad","School","200000","42000","242000","saigaikwad32@yahoo.com","Pending"},
                           {"04","Ajit Pawar","Personal","80000","20000","100000","kingpawar99@gmail.com","Paid"},
                            {"05","Vaibhav Shendkar","Industrial","2200000","8000","2208000","Vshendkar72@gmail.com","Pending"}};  	    
        String column[]={"Sr.no","Customer Name","Security Type","Cost","Extra Charges","Total Cost","EmailID","Bill Status",};
         
        JTable table=new JTable(data,column);    
   b1=new JButton("Back");
   b1.setFont(new Font("Times new roman",Font.BOLD,15));
   b1.setForeground(Color.black);                      
   b1.addActionListener(this);
   b1.setBounds(350,200,100,30);
   f.add(b1);


    b2=new JButton("Logout");
    b2.setFont(new Font("Times new roman",Font.BOLD,15));
    b2.setForeground(Color.black);
    b2.addActionListener(this);
    b2.setBounds(550,200,100,30);
     f.add(b2);
        table.setBounds(30,40,200,300);          
        JScrollPane sp=new JScrollPane(table);    
        f.add(sp); 
        
        f.setSize(800,800);    
        f.setVisible(true);  
}
public void actionPerformed(ActionEvent e)
{
 if(e.getSource()==b1)
{
new adminallform();
}
if(e.getSource()==b2)
{
new thanku();
}
  
}     
    public static void main(String[] args) 
    {    
        new customerdetails();    
    }    
    }  
