package movie.review.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login,cancel,signUp;
    JTextField userName,passWord;
    Choice loginIn;
    
    Login(){
        super("Login Page");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBounds(300,20,100,20);
        add(lblUsername);
        
        userName = new JTextField();
        userName.setBounds(400,20,150,20);
        add(userName);
        
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(300,60,100,20);
        add(lblPassword);
        
        passWord = new JTextField();
        passWord.setBounds(400,60,150,20);
        add(passWord);
        
        JLabel lblLoginAs = new JLabel("Login in as ");
        lblLoginAs.setBounds(300,100,100,20);
        add(lblLoginAs);
        
        loginIn = new Choice();
        loginIn.add("Admin");
        loginIn.add("User");
        loginIn.setBounds(400,100,150,20);
        add(loginIn);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image i2 = i1.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        login = new JButton("Login", new ImageIcon(i2));
        login.setBounds(330, 160, 100, 20);
        login.addActionListener(this);
        add(login);
        
        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("icon/cancel.png"));
        Image i4 = i3.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        cancel = new JButton("Cancel", new ImageIcon(i4));
        cancel.setBounds(450, 160, 100, 20);
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("icon/signup.png"));
        Image i6 = i5.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT);
        signUp = new JButton("Sign Up", new ImageIcon(i6));
        signUp.setBounds(380, 200, 100, 20);
        signUp.addActionListener(this);
        add(signUp);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icon/second.jpg"));
        Image i8 = i7.getImage().getScaledInstance(270, 270, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel image = new JLabel(i9);
        image.setBounds(10,0,260,250);
        add(image);
        
        setSize(640,300);
        setLocation(400,200);
        setVisible(true);
    }
    
    //method overriding
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== login){
            String sUsername = userName.getText();
            String spassword = passWord.getText();
            String user = loginIn.getSelectedItem();
            
            try{
                Conn c = new Conn();
                String query = "Select * from login where Username = '"+sUsername+"' and Password = '"+spassword+"' and user = '"+user+"'";
            
                ResultSet rs = c.s.executeQuery(query);
                
                if(rs.next()){
                    setVisible(false);
                    new Project();
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Login");
                    userName.setText("");
                    passWord.setText("");
                }
                
            }catch (Exception e){
                e.printStackTrace();
            }
        
        }else if(ae.getSource()== cancel){
            setVisible(false);
        
        }else if(ae.getSource()== signUp){
            setVisible(false);
            
            new Signup();
        
        }
    }
    
    public static void main(String[] args){
        new Login();
        
    }
}
