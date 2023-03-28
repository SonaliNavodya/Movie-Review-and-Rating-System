package movie.review.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.*;

public class Signup extends JFrame implements ActionListener{
    
    JButton create,back;
    Choice accountType,gender;
    JTextField empId,userName,email,passWord;
    
    Signup(){
        
        
        setBounds(400,150,700,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBounds(30, 30, 625, 300);
        panel.setBorder(new TitledBorder (new LineBorder(new Color(173,216,230), 2), "Create-Account", TitledBorder.LEADING, TitledBorder.TOP,null,new Color(173,216,230)));
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        panel.setForeground(new Color(34,139,34));
        add(panel);
        
        JLabel heading = new JLabel("Create Account As");
        heading.setBounds(20, 40, 140, 20);
        heading.setForeground(Color.GRAY);
        heading.setFont(new Font("Tahoma",Font.BOLD, 14));
        panel.add(heading);
        
        accountType = new Choice();
        accountType.add("Admin");
        accountType.add("User");
        accountType.setBounds(180, 40, 150, 20);
        panel.add(accountType);
        
        JLabel lblEmployeeID = new JLabel("Employee ID");
        lblEmployeeID.setBounds(20, 80, 140, 20);
        lblEmployeeID.setForeground(Color.GRAY);
        lblEmployeeID.setFont(new Font("Tahoma",Font.BOLD, 14));
        panel.add(lblEmployeeID);
        
        empId = new JTextField();
        empId.setBounds(180,80,150,20);
        panel.add(empId);
        
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBounds(20, 120, 140, 20);
        lblUsername.setForeground(Color.GRAY);
        lblUsername.setFont(new Font("Tahoma",Font.BOLD, 14));
        panel.add(lblUsername);
        
        userName = new JTextField();
        userName.setBounds(180,120,150,20);
        panel.add(userName);
        
        JLabel lblEmali = new JLabel("Email");
        lblEmali.setBounds(20, 160, 140, 20);
        lblEmali.setForeground(Color.GRAY);
        lblEmali.setFont(new Font("Tahoma",Font.BOLD, 14));
        panel.add(lblEmali);
        
        email = new JTextField();
        email.setBounds(180,160,150,20);
        panel.add(email);
        
        JLabel lblGender = new JLabel("Gender");
        lblGender.setBounds(20, 200, 140, 20);
        lblGender.setForeground(Color.GRAY);
        lblGender.setFont(new Font("Tahoma",Font.BOLD, 14));
        panel.add(lblGender);
        
        /*gender = new JTextField();
        gender.setBounds(180,200,150,20);
        panel.add(gender);*/
        gender = new Choice();
        gender.add("Male");
        gender.add("Female");
        gender.setBounds(180, 200, 150, 20);
        panel.add(gender);
        
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(20, 240, 140, 20);
        lblPassword.setForeground(Color.GRAY);
        lblPassword.setFont(new Font("Tahoma",Font.BOLD, 14));
        panel.add(lblPassword);
        
        passWord = new JTextField();
        passWord.setBounds(180,240,150,20);
        panel.add(passWord);
        
        create = new JButton("Create");
        create.setBackground(Color.BLACK);
        create.setForeground(Color.WHITE);
        create.setBounds(350,240,120,20);
        create.addActionListener(this);
        panel.add(create);
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(480,240,120,20);
        back.addActionListener(this);
        panel.add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/signupImage.png"));
        Image i2 = i1.getImage().getScaledInstance(230, 230, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,250,250);
        panel.add(image);
        
         
        setVisible(true);
    }
    
    //method overriding
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== create){
            //empId,userName,email,gender,passWord;
            String aType = accountType.getSelectedItem();
            String sUsername = userName.getText();
            String sEmail = email.getText();
            String sGender = gender.getSelectedItem();
            String spassword = passWord.getText();
            String sEmpid = empId.getText();
            
            
            try{
                Conn c = new Conn();
                String query = "insert into login values('"+sEmpid+"','"+sUsername+"','"+sEmail+"','"+sGender+"','"+spassword+"','"+aType+"')";
            
                c.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Account Created Successfully");
                
                setVisible(false);
                new Login();
                
            }catch(Exception e){
                e.printStackTrace();
            
            } 
        
        }else if(ae.getSource()== back){
            setVisible(false);
            
            new Login();
        }
        
    }


    public static void main(String[] args){
        new Signup();
    }
}
