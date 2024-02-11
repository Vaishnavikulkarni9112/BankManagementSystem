
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class MiniStatement extends JFrame {
    
    
    MiniStatement(String pinnumber){
        setTitle("Mini Statement");
        
        setLayout(null);
        
        JLabel mini = new JLabel();
        add(mini);
        
        JLabel bank = new JLabel("Indian Bank");
        bank.setBounds(130,10,100,15);
        add(bank);
        
        JLabel card = new JLabel();
        card .setBounds(10,50,250,15);
        add(card );
        
        JLabel balance = new JLabel();
        balance.setBounds(10,350,250,15);
        add(balance);
        
        try{
           conn conn = new conn();
           
           ResultSet rs =conn.s.executeQuery("Select * from login where pin = '"+pinnumber+"'");
           while(rs.next()){
               card.setText("Card number: " + rs.getString("cardnumber").substring(0 ,4) + "XXXXXXXX" + rs.getString("cardnumber").substring(12) );
           }
           
        }catch(Exception e){
            System.out.println(e);
        }
        
        try{
           conn conn = new conn();
           int bal = 0;
           ResultSet rs =conn.s.executeQuery("Select * from bank where pin = '"+pinnumber+"'");
           while(rs.next()){
              mini.setText(mini.getText() + "<html>" +  rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
              if (rs.getString("type").equals("Deposit")){
                      bal+= Integer.parseInt(rs.getString("amount"));
                    } else{
                        bal-= Integer.parseInt(rs.getString("amount"));
                    }
           }
           balance.setText("Your current account balance is RS " + bal);
        } catch(Exception e){
            System.out.println(e);
        }
        
        mini.setBounds(10,120,350,150);
            
        
        
        
        
        
        setSize(400 , 500);
        setLocation(10 ,10);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    
    public static void main (String args[]){
        new MiniStatement(" ");
    }
    
}
