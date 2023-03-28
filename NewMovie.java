package movie.review.system;

import javax.swing.*;
import java.awt.*;


public class NewMovie extends JFrame{
    
    JTextField tfName,tfcat,tfyear,tfphoto;
    
    NewMovie(){
        
        setSize(700,500);
        setLocation(350,150);
        
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBackground(new Color(173,216,230));
        add(p);
        
        JLabel heading = new JLabel("New Movie");
        heading.setBounds(180,10,200,25);
        heading.setFont(new Font("Tahoma",Font.PLAIN, 24));
        p.add(heading);
        
        JLabel lblName = new JLabel("Movie Name");
        lblName.setBounds(100,80,100,20);
        //lblName.setFont(new Font("Tahoma",Font.PLAIN, 24));
        p.add(lblName);
        
        tfName = new JTextField();
        tfName.setBounds(240,80,200,20);
        p.add(tfName);
        
        JLabel lblcategory = new JLabel("Movie Category");
        lblcategory.setBounds(100,120,100,20);
        //lblName.setFont(new Font("Tahoma",Font.PLAIN, 24));
        p.add(lblcategory);
        
        tfcat = new JTextField();
        tfcat.setBounds(240,120,200,20);
        p.add(tfcat);
        
        JLabel lblreleaseYear = new JLabel("Released Year");
        lblreleaseYear.setBounds(100,160,100,20);
        //lblName.setFont(new Font("Tahoma",Font.PLAIN, 24));
        p.add(lblreleaseYear);
        
        tfyear = new JTextField();
        tfyear.setBounds(240,160,200,20);
        p.add(tfyear);
        
        JLabel lblphoto = new JLabel("Movie Cover");
        lblphoto.setBounds(100,200,100,20);
        //lblName.setFont(new Font("Tahoma",Font.PLAIN, 24));
        p.add(lblphoto);
        
        JP   tfphoto = new JTextField();
        tfphoto.setBounds(240,200,200,20);
        p.add(tfphoto);
        
        
        setVisible(true);
    
    }
    
    public static void main(String [] args)
    {
        new NewMovie();
    }
}
