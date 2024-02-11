
package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener {
    
    JPasswordField pin,repin;
    JButton change , back;
    String pinnumber;
    
    
    PinChange(String pinnumber) {
        this.pinnumber= pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(732,732,Image.SCALE_DEFAULT );
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,732,732);
        add(image);
        
        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setBounds(210,230,700,30);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,12));
        image.add(text);
        
        JLabel pintext = new JLabel(" NEW PIN :");
        pintext.setBounds(135,250,700,30);
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System", Font.BOLD,12));
        image.add(pintext);
        
         pin = new JPasswordField();
        pin.setFont(new Font("Raleway", Font.BOLD, 12));
        pin.setBounds(270,260,140,15);
        image.add(pin);
        
        JLabel repintext = new JLabel("RE-Enter NEW PIN :");
        repintext.setBounds(135,280,700,30);
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System", Font.BOLD,12));
        image.add(repintext);
        
         repin = new JPasswordField();
        repin.setFont(new Font("Raleway", Font.BOLD, 12));
        repin.setBounds(270,290,140,15);
        image.add(repin);
        
        change = new JButton("CHANGE");
        change.setBounds(270,400,110,15);
        change.addActionListener(this);
        image.add(change);
        
         back = new JButton("BACK");
        back .setBounds(270,430,110,15);
        back.addActionListener(this);
        image.add(back );
        
        setSize (732,732);
        setLocation(250,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== change){
            try {
            String npin = pin.getText();
            String rpin = repin.getText();
            
            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }
            if (npin.equals("")){
              JOptionPane.showMessageDialog(null, "Please Enter new Pin");
                return;  
            }
            
            if (rpin.equals("")){
               JOptionPane.showMessageDialog(null, "Please re-Enter new Pin");
                return;   
            }
            conn conn = new conn();
            String query1 = "update bank set pin = '"+rpin+"' where pin='"+pinnumber+"'";
            String query2 = "update login set pin = '"+rpin+"' where pin='"+pinnumber+"'";
            String query3 = "update signupThree set pin = '"+rpin+"' where pin='"+pinnumber+"'";
            
            conn.s.executeUpdate(query1);
            conn.s.executeUpdate(query2);
            conn.s.executeUpdate(query3);
            
            JOptionPane.showMessageDialog(null, "Pin Changed Sucessfully");
            
            setVisible(false);
            new Transactions(rpin).setVisible(true);
            
            
        }catch (Exception e){
            System.out.println(e);
        
            
        }
        } else{
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
           
                
                
                
                
                
                
    }
        
        
    
    
    


public static void main(String args[]){
    new PinChange("").setVisible(true);
    
}

}








