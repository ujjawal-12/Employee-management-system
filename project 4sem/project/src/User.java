import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;
import java.sql.DriverManager;
import java.awt.*;
import java.sql.*;
public class User implements ActionListener{
  JFrame jfr;
  Login lg;
  Image img;
  JButton jbtn1,jbtn2;
  ImageIcon im1,im2,im3;
  JLabel jb1,jb2,jb3;
  JPanel jp1,jp2;
  String usernm;
  public User(Login obj,String st){
   lg=obj; usernm=st;
   jfr=new JFrame();
   jfr.setVisible(true);
   jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   jfr.setLayout(null);
   jfr. setResizable(false);
   jfr. setTitle("Employee Management System");
   jfr.setBounds(240,120,600,400);
   jfr.getContentPane(). setBackground(Color.darkGray);
  jp1=new JPanel();
  jp1.setLayout(null);
  jp1.setBounds(0,0,180,400);
  jp1.setBackground(Color.cyan);
 jb1=new JLabel("WELCOME TO EMS");;
 jb1.setBounds(270,40,300,30);
 jb1.setForeground(Color.PINK);
 Font f=new Font("Arial",Font.BOLD,25);
 jb1.setFont(f);
 im1=new ImageIcon("E:\\Java\\project 4sem\\project\\images\\teamwork1.png");
 img=im1.getImage().getScaledInstance(im1.getIconWidth(), im1.getIconHeight(), Image.SCALE_DEFAULT);
 im2=new ImageIcon(img);
 jb2=new JLabel(im2);
 jb2.setBounds(260,100,im1.getIconWidth(),im1.getIconHeight());
 im3=new ImageIcon("E:\\Java\\project 4sem\\project\\images\\profile.png");
 ImageIcon imgic=new ImageIcon("E:\\Java\\project 4sem\\project\\images\\user1.png");
 jb3=new JLabel(imgic);
 jb3.setBounds(18,80,imgic.getIconWidth(),imgic.getIconHeight());
 jbtn1=new JButton("LOGOUT");
 jbtn2=new JButton("PROFILE");
 jbtn1.addActionListener(this);
 jbtn2.addActionListener(this);
 jbtn1.setForeground(Color.white);
 jbtn2.setForeground(Color.white);
 jbtn1.setBackground(Color.red);
 jbtn2.setBackground(Color.GREEN);
 jbtn1.setFont(new Font("Arial",Font.BOLD,16));
 jbtn2.setFont(new Font("Arial",Font.BOLD,16));
 jbtn1.setBounds(0,0,180,30);
 jbtn2.setBounds(0,80 + imgic.getIconHeight(),180,30);
 jp1.add(jbtn1);
 jp1.add(jb3);
 jp1.add(jbtn2);
  jfr.add(jp1);
  jfr.add(jb1);
  jfr.add(jb2);
  }

  public void actionPerformed(ActionEvent e){
  if(e.getSource()==jbtn1){
    jfr.dispose();
    lg.jtf1.setText("");
    lg.jtf2.setText("");
   lg.f1.setVisible(true);
  }
  else{
    jfr.remove(jb1);
    jfr.remove(jb2);
    jp2=new JPanel();
    jp2.setLayout(null);
    jp2.setBounds(180,0,420,400);
    jp2.setBackground(Color.black);
    
    JLabel jlbal=new JLabel(im3);
    jlbal.setBounds(140,20,im3.getIconWidth(),im3.getIconHeight());
     jb1.setText("Welcome "+ usernm);
     jb1.setBounds(100,20+im3.getIconHeight(),235,30);
     jb1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.pink));
     JLabel jl4=new JLabel("Degination :-");
     JLabel jl5=new JLabel("Age :-");
     JLabel jl6=new JLabel("Phone :-");
     JLabel jl7=new JLabel("Qualification :-");
     JLabel jl8=new JLabel("");
     JLabel jl9=new JLabel("");
     JLabel jl10=new JLabel("");
     JLabel jl11=new JLabel("");
     jl4.setBounds(17,20+im3.getIconHeight()+50,120,30);
     jl5.setBounds(230,20+im3.getIconHeight()+50,70,30);
     jl6.setBounds(17,20+im3.getIconHeight()+130,80,30);
     jl7.setBounds(210,20+im3.getIconHeight()+130,140,30);
     jl8.setBounds(137,20+im3.getIconHeight()+50,150,30);
    jl9.setBounds(290,20+im3.getIconHeight()+50,70,30);
    jl10.setBounds(100,20+im3.getIconHeight()+130,130,30);
    jl11.setBounds(340,20+im3.getIconHeight()+130,100,30);

    jl4.setForeground(Color.pink);
    jl5.setForeground(Color.pink);
    jl6.setForeground(Color.pink);
    jl7.setForeground(Color.pink);
    jl8.setForeground(Color.white);
    jl9.setForeground(Color.white);
    jl10.setForeground(Color.white);
    jl11.setForeground(Color.white);

   jl4.setFont(new Font("Arial",Font.PLAIN,19));
   jl5.setFont(new Font("Arial",Font.PLAIN,19));
   jl6.setFont(new Font("Arial",Font.PLAIN,19));
   jl7.setFont(new Font("Arial",Font.PLAIN,19));
   jl8.setFont(new Font("Arial",Font.PLAIN,19));
   jl9.setFont(new Font("Arial",Font.PLAIN,19));
   jl10.setFont(new Font("Arial",Font.PLAIN,19));
   jl11.setFont(new Font("Arial",Font.PLAIN,19));

   jp2.add(jl4);
   jp2.add(jl5);
   jp2.add(jl6);
   jp2.add(jl7);
   jp2.add(jl8);
   jp2.add(jl9);
   jp2.add(jl10);
   jp2.add(jl11);

    jp2.add(jlbal);
   jp2.add(jb1);
    jfr.getContentPane().add(jp2);
    jfr.repaint();

    try{
     // Class.forName("com.mysql.jdbc.Driver");
      Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stu", "root", "");
      Statement stmt=conn.createStatement();
      String que="select * from studetail where user_id='"+usernm+"'";
      ResultSet rst=stmt.executeQuery(que);
      while(rst.next()){
        jl8.setText(rst.getString("post"));
        jl9.setText(rst.getString("age"));
        jl10.setText(rst.getString("phone"));
        jl11.setText(rst.getString("education"));
      }
    

conn.close();
    }
    catch(Exception err){System.out.println(err.getMessage());}
  }
}
}
