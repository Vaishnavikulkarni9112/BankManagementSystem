
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Transactions extends JFrame implements ActionListener{
    JButton deposit,withdrawl, ministatement , pinchange , fastcash , balanceenquiry , exit;
    String pinnumber;
    
    Transactions(String pinnumber){
        this.pinnumber = pinnumber;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(732,732,Image.SCALE_DEFAULT );
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,732,732);
        add(image);
        
        JLabel text = new JLabel("Please select your Transactions");
        text.setBounds(190,250,700,30);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,12));
        image.add(text);
        
        deposit = new JButton ("Deposit");
        deposit.setBounds(130,340,100,15);
        deposit.addActionListener(this);
        image.add(deposit);
        
        withdrawl = new JButton ("Withdrawl");
        withdrawl.setBounds(320,340,100,15);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash = new JButton ("Fast Cash");
        fastcash.setBounds(130,370,100,15);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        ministatement = new JButton ("statement");
        ministatement.setBounds(320,370,100,15);
        ministatement.addActionListener(this);
        image.add(ministatement);
        
        pinchange = new JButton ("pinchange");
        pinchange.setBounds(130,400,100,15);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balanceenquiry = new JButton ("Enquiry");
        balanceenquiry.setBounds(130,430,100,15);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);
        
        exit = new JButton ("Exit");
        exit.setBounds(320,400,100,15);
        exit.addActionListener(this);
        image.add(exit);
        
        setSize (732,732);
        setLocation(250,0);
        setUndecorated(true);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== exit){
            System.exit(0);
        }else if (ae.getSource() == deposit) {
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }else if (ae.getSource()== withdrawl){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }else if (ae.getSource()==fastcash){
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }else if(ae.getSource()==pinchange){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }else if(ae.getSource()==balanceenquiry){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        } else if(ae.getSource()== ministatement){
          
            new MiniStatement(pinnumber).setVisible(true); 
        }
    }
    
    
    


public static void main(String args[]){
    new Transactions("");

}
}
