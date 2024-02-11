
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;


public class BalanceEnquiry extends JFrame implements ActionListener {
    
    JButton back;String pinnumber;
    
    BalanceEnquiry(String pinchange){
        this.pinnumber = pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(732,732,Image.SCALE_DEFAULT );
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,732,732);
        add(image);
        
        back = new JButton("Back");
        back .setBounds(300,430,110,15);
        back.addActionListener(this);
        image.add(back );
        
        conn c = new conn();
         int balance = 0;   
            try {
                ResultSet rs = c.s.executeQuery("select * from bank where pin= '"+pinnumber+"'");
                
                while (rs.next()){
                    if (rs.getString("type").equals("Deposit")){
                        balance+= Integer.parseInt(rs.getString("amount"));
                    } else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
             } catch(Exception e){
                 System.out.println(e);
             }
            
         JLabel text = new JLabel("Your Current Account balance is Rs " + balance);
        text.setBounds(150,250,700,30);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,12));
        image.add(text);
      
        
        setSize (732,732);
        setLocation(250,0);
        setUndecorated(true);
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae){
         setVisible(false);
         new Transactions(pinnumber).setVisible(true);
     }
    
    
    
    public static void main(String args[]){
        
        new BalanceEnquiry("");
        
    }
    
}
