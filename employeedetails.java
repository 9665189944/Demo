import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.awt.event.*;

public class employeedetails extends JPanel implements ActionListener
{
         JLabel l;
  JButton b1,b2;
    public employeedetails()
    {
      
        Icon aboutIcon = new ImageIcon("index.jpg");
        Icon addIcon = new ImageIcon("cr4.jpg");
        Icon copyIcon = new ImageIcon("cr5.jpg");
        Icon gheIcon = new ImageIcon("cr3.jpg");
        Icon theIcon = new ImageIcon("cr2.jpg");
        Icon lavIcon = new ImageIcon("cr1.jpg");

        String[] columnNames = {"Emp Name","Place","Work Days","Salary","Picture", "Post"};
        Object[][] data =
        {
            {"Sahil Khan","Mumbai","23","12000",aboutIcon,"Household"},
            {"Om Roy","Pune","90","16000",addIcon,"Industrial"},
            {"Ram Dev","Baramati","45","14000",copyIcon,"Personal"},
             {"Raj Vani","Delhi","180","55000",gheIcon,"Manager"},
            {"Yash Khan","Thane","87","19000",theIcon,"School"},
            {"K Modi","Nasik","30","8000",lavIcon,"Personal"},

         };

        DefaultTableModel model = new DefaultTableModel(data, columnNames)
        {
            //  Returning the Class of each column will allow different
            //  renderers to be used based on Class
            public Class getColumnClass(int column)
            {
                return getValueAt(0, column).getClass();
            }
        };
// JPanel panel = new JPanel();
JTable table = new JTable( model );
      //first column width
  TableColumn column = table.getColumnModel().getColumn(4);
  column.setPreferredWidth(200);
  //set all rows height 
  table.setRowHeight(100);
  //set specific row height
  table.setRowHeight(2,100);
  //Select single cell
  table.setCellSelectionEnabled(true);
 // panel.add(table,BorderLayout.CENTER);
//  frame.add(panel);
        table.setPreferredScrollableViewportSize(table.getPreferredSize());
        table.setBounds(200,-100,2000,2040);     
        JScrollPane scrollPane = new JScrollPane( table );
        add( scrollPane );
    }

    private static void createAndShowGUI()
    { 
	JButton b1,b2;
         JTable table = new JTable();
        table.setBounds(500,-200,1040,1040);

         JPanel panel = new JPanel();
        panel.add(table,BorderLayout.CENTER);

        JFrame frame = new JFrame("employeedetails");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new employeedetails());
        frame.setLocationByPlatform( true );
        frame.pack();
       frame.add(panel);

        frame.setSize(800,1000); 
       
b1=new JButton("Back");
   b1.setFont(new Font("Times new roman",Font.BOLD,15));
   b1.setForeground(Color.black);                      
  // b1.addActionListener(this);
   b1.setBounds(350,800,10,10);
   panel.add(b1);

b2=new JButton("Logout");
    b2.setFont(new Font("Times new roman",Font.BOLD,15));
    b2.setForeground(Color.black);
    //b2.addActionListener(this);
    b2.setBounds(900,800,10,10);
     panel.add(b2);



     frame.setVisible( true );
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
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowGUI();
            }
        });
 
    }

}
