package movie.review.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame{
    
    Project(){
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/elect1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1550, 850, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        setJMenuBar(mb);
        
        //1 - Movie details
        JMenu master = new JMenu("  Movie Details  ");
        master.setFont(new Font("Tahoma",Font.PLAIN,18));
        mb.add(master);
        
        JMenuItem newMovie = new JMenuItem("Add New Movie");
        newMovie.setFont(new Font("Tahoma",Font.PLAIN,16));
        newMovie.setBackground(Color.WHITE);
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icon/icon12.png"));
        Image image1 = icon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        newMovie.setIcon(new ImageIcon(image1));
        
        //Adding short cut keys
        newMovie.setMnemonic('D');
        newMovie.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
        master.add(newMovie);
        
        JMenuItem viewMovie = new JMenuItem("View Movie List");
        viewMovie.setFont(new Font("Tahoma",Font.PLAIN,16));
        viewMovie.setBackground(Color.WHITE);
        ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
        Image image2 = icon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        viewMovie.setIcon(new ImageIcon(image2));
        
        //Adding short cut keys
        viewMovie.setMnemonic('M');
        viewMovie.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
        master.add(viewMovie);
        
        
        
        //2 - Short Movie Details 
        JMenu master1 = new JMenu("  Short-Movie Details  ");
        master1.setFont(new Font("Tahoma",Font.PLAIN,18));
        mb.add(master1);
        
        JMenuItem newSMovie = new JMenuItem("Add New Short-Movie");
        newSMovie.setFont(new Font("Tahoma",Font.PLAIN,16));
        newSMovie.setBackground(Color.WHITE);
        ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("icon/icon12.png"));
        Image image3 = icon3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        newSMovie.setIcon(new ImageIcon(image3));
        
        //Adding short cut keys
        newSMovie.setMnemonic('O');
        newSMovie.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        master1.add(newSMovie);
        
        JMenuItem viewSMovie = new JMenuItem("View Short-Movie List");
        viewSMovie.setFont(new Font("Tahoma",Font.PLAIN,16));
        viewSMovie.setBackground(Color.WHITE);
        ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
        Image image4 = icon4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        viewSMovie.setIcon(new ImageIcon(image4));
        
        //Adding short cut keys
        viewSMovie.setMnemonic('P');
        viewSMovie.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
        master1.add(viewSMovie);
        
        
        
        //3 - TV series Details 
        JMenu master2 = new JMenu("  TV series Details  ");
        master2.setFont(new Font("Tahoma",Font.PLAIN,18));
        mb.add(master2);
        
        JMenuItem newtvs = new JMenuItem("Add New TV series");
        newtvs.setFont(new Font("Tahoma",Font.PLAIN,16));
        newtvs.setBackground(Color.WHITE);
        ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("icon/icon12.png"));
        Image image5 = icon5.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        newtvs.setIcon(new ImageIcon(image5));
        
        //Adding short cut keys
        newtvs.setMnemonic('Q');
        newtvs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
        master2.add(newtvs);
        
        JMenuItem viewtvs = new JMenuItem("View TV series List");
        viewtvs.setFont(new Font("Tahoma",Font.PLAIN,16));
        viewtvs.setBackground(Color.WHITE);
        ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
        Image image6 = icon6.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        viewtvs.setIcon(new ImageIcon(image6));
        
        //Adding short cut keys
        viewtvs.setMnemonic('R');
        viewtvs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
        master2.add(viewtvs);
        
        
        //4 - Admin Details
        JMenu admindetails = new JMenu("  Admin Details  ");
        admindetails.setFont(new Font("Tahoma",Font.PLAIN,18));
        mb.add(admindetails);
        
        JMenuItem adminview = new JMenuItem("View Admin Details");
        adminview.setFont(new Font("Tahoma",Font.PLAIN,16));
        adminview.setBackground(Color.WHITE);
        ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
        Image image7 = icon7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        adminview.setIcon(new ImageIcon(image7));
        
        //Adding short cut keys
        adminview.setMnemonic('S');
        adminview.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        admindetails.add(adminview);
        
        JMenuItem adminupdate = new JMenuItem("Update Admin Details");
        adminupdate.setFont(new Font("Tahoma",Font.PLAIN,16));
        adminupdate.setBackground(Color.WHITE);
        ImageIcon icon8 = new ImageIcon(ClassLoader.getSystemResource("icon/icon1.png"));
        Image image8 = icon8.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        adminupdate.setIcon(new ImageIcon(image8));
        
        //Adding short cut keys
        adminupdate.setMnemonic('T');
        adminupdate.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));
        admindetails.add(adminupdate);
        
        
        //5 - Exit
        JMenu mExit = new JMenu("  Exit  ");
        mExit.setFont(new Font("Tahoma",Font.PLAIN,18));
        mb.add(mExit);
        
        JMenuItem exit = new JMenuItem("Exit");
        exit.setFont(new Font("Tahoma",Font.PLAIN,16));
        exit.setBackground(Color.WHITE);
        ImageIcon icon9 = new ImageIcon(ClassLoader.getSystemResource("icon/icon11.png"));
        Image image9 = icon9.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        exit.setIcon(new ImageIcon(image7));
        
        //Adding short cut keys
        exit.setMnemonic('X');
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        mExit.add(exit);
        
        
        
        
        setVisible(true);
        
    }
    
    
    public static void main(String[] args){
        new Project();
    
    }
    
}
