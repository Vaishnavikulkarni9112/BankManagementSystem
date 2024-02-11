
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class SignupThree  extends JFrame implements ActionListener{
    
    JRadioButton r1 , r2, r3, r4;
    JCheckBox c1 , c2 ,c3, c4, c5, c6, c7;
    JButton submit,cancel;
    String formno;
    SignupThree( String formno){
        this.formno = formno;
        
        setLayout(null);
        
        JLabel l1 = new JLabel("Page 3 : Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD,22 ));
        l1.setBounds(280,70,400,30);
        add(l1);
        
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 20));
        type.setBounds(110,120,200,15);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD,13));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100 , 150, 150, 20);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD,13));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350 , 150, 250, 20);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD,13));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100 , 190, 250, 20);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD,13));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350 , 190, 250, 20);
        add(r4);
        
        ButtonGroup groupaccount = new  ButtonGroup ();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Raleway", Font.BOLD, 15));
        card.setBounds(100,250,200,20);
        add(card);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway", Font.BOLD, 15));
        number.setBounds(250,250,300,20);
        add(number);
        
        JLabel carddetail = new JLabel("Your 16 Digit card Number");
         carddetail.setFont(new Font("Raleway", Font.BOLD, 10));
       carddetail.setBounds(100,270,300,15);
       
        add(carddetail);
        
        JLabel pin = new JLabel("PIN:");
         pin .setFont(new Font("Raleway", Font.BOLD,15 ));
         pin .setBounds(100,300,200,20);
        add( pin );
        
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 15));
        pnumber.setBounds(250,300,300,20);
        add(pnumber);
        
         JLabel pindetail = new JLabel("Your 4 Digit Password");
        pindetail.setFont(new Font("Raleway", Font.BOLD, 10));
        pindetail.setBounds(100,320,300,20);
        add(pindetail);
        
        JLabel services = new JLabel("Services Required:");
         services .setFont(new Font("Raleway", Font.BOLD, 15));
         services .setBounds(100,350,200,20);
        add( services );
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD,15));
        c1.setBounds(100 ,380 ,200,20);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD,15));
        c2.setBounds(300 ,380 ,200,20);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD,15));
        c3.setBounds(100 ,400,200,20);
        add(c3);
        
        
        
        c4 = new JCheckBox("EMAIL & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD,15));
        c4.setBounds(300 ,420 ,200,20);
        
        add(c4);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD,15));
        c5.setBounds(100,420,200,20);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD,15));
        c6.setBounds(300,400,200,20);
        add(c6);
        
        c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD,15));
        c7.setBounds(100,460,900,20);
        add(c7);
        
       
        
        
        
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD,13));
        submit.setBounds(200 ,500, 90, 15);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD,13));
        cancel.setBounds(400 ,500, 90, 15);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        
        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
        setSize(screenWidth - 100, screenHeight - 100);
        setLocationRelativeTo(null); // Center the JFrame on the screen

        setVisible(true);
        
     
        
       
       
        
        
        
        
        
    
        
        
    }
    
    public void actionPerformed(ActionEvent ae) {
        if ( ae.getSource() == submit)  {
            String accountType = null;
            if (r1.isSelected()) {
                accountType = "Saving Account";
            }else if (r2.isSelected()) {
                accountType = "Fixed Account";
            }else if (r3.isSelected()) {
                accountType = "Current Account";
            } else if (r4.isSelected()){
                accountType = "Recurring Deposit Account";
            }
            
            Random random = new Random();
           String cardnumber ="" + Math.abs((random.nextLong() % 90000000L) + 504093600000000L);
           
           String pinnumber = "" + Math.abs((random.nextLong()  % 9000L) + 1000L);
           
           String facility = "";
    if (c1.isSelected()) {
        facility += "ATM Card, ";
    }
    if (c2.isSelected()) {
        facility += "Internet Banking, ";
    }
    if (c3.isSelected()) {
        facility += "Mobile Banking, ";
    }
    if (c4.isSelected()) {
        facility += "EMAIL & SMS Alerts, ";
    }
    if (c5.isSelected()) {
        facility += "Cheque Book, ";
    }
    if (c6.isSelected()) {
        facility += "E-Statement, ";
    }
    if (facility.isEmpty()) {
        facility = "No facilities selected";
    } else {
        facility = facility.substring(0, facility.length() - 2); 
    }
           
           try {
               if (accountType.equals("")){
                   JOptionPane.showMessageDialog(null, "Account Type is required");
               }else {
                   conn conn = new conn();
                   String query1 = "insert into signupthree values('"+formno+"', '"+accountType+"','"+cardnumber+"','"+pinnumber+"', '"+facility+"')";
                   String query2 = "insert into login values('"+formno+"', '"+cardnumber+"','"+pinnumber+"')";
                   conn.s.executeUpdate(query1);
                   conn.s.executeUpdate(query2);
                   
                   JOptionPane.showMessageDialog(null, "Card Number:" + cardnumber +"\n Pin: " + pinnumber);
                   setVisible(false);
                   new Deposit(pinnumber).setVisible(true);
               }
           } catch (Exception e){
               System.out.println(e);
           }
               
        
    } else if  (ae.getSource()== cancel){
        setVisible(false);
        new Login().setVisible(true);
        
    }
}
    
    public static void main(String args[]){
        new SignupThree("");
        
    }
    
}
