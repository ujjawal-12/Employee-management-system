import java.awt.event.*;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.*;
//import javax.swing.JOptionPane;

public class Login {
  JPanel pnl1, pnl2, pnl3, pnl4;
  JLabel l1, l2, l3, l4,l5;
  JTextField jtf1;
  JPasswordField jtf2;
  JButton btn1, btn2,btn3;
  JFrame f1;
  ImageIcon img1, img2, img3;
  JComboBox<String> jcmb;

  public Login() {
    f1 = new JFrame();
    f1.setVisible(true);
    f1.setLayout(null);
    f1.setBounds(200, 100, 700, 450);
    f1.setResizable(false);
    ImageIcon i1 = new ImageIcon("E:\\Java\\project 4sem\\project\\images\\team.png");
    f1.setIconImage(i1.getImage());
    f1.setTitle("Employee Management System");
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pnl1 = new JPanel();
    pnl1.setLayout(null);
    pnl2 = new JPanel();
    pnl2.setLayout(null);
    pnl3 = new JPanel();
    pnl3.setLayout(null);
    pnl4 = new JPanel();
    pnl4.setLayout(null);


    l2 = new JLabel("User Type");
    l2.setBounds(220, 0, 80, 25);
    l2.setFont(new Font("Arial", Font.PLAIN, 15));
    l2.setForeground(Color.white);
    pnl2.add(l2);
    String username[] = { "Admin", "User" };
    jcmb = new JComboBox<String>(username);
    jcmb.setBounds(300, 0, 80, 25);
    // jcmb.setForeground(Color.pink);
    jcmb.setSelectedIndex(0);
    jcmb.setBorder(BorderFactory.createLineBorder(Color.pink));
    jcmb.setFont(new Font("Arial", Font.PLAIN, 15));
    // jcmb.setForeground(Color.);
    pnl2.add(jcmb);
    // img2=new ImageIcon("E:\\Java\\project 4sem\\project\\images\\tea.png");
    img2 = new ImageIcon("E:\\Java\\project 4sem\\project\\images\\user.png");
    img3 = new ImageIcon("E:\\Java\\project 4sem\\project\\images\\padlock.png");
    // l2=new JLabel("User");
    l4 = new JLabel("Username", img2, JLabel.LEFT);
    l4.setBounds(0, 0, 110, 40);
    l4.setBorder(BorderFactory.createLineBorder(Color.black));
    l4.setFont(new Font("Arial", Font.PLAIN, 15));
    l4.setForeground(Color.white);
    pnl4.add(l4);

    l3 = new JLabel("Password", img3, JLabel.LEFT);
    l3.setBounds(0, 80, 110, 40);
    l3.setFont(new Font("Arial", Font.PLAIN, 15));
    l3.setForeground(Color.white);
    l3.setBorder(BorderFactory.createLineBorder(Color.black));
    pnl4.add(l3);
    jtf1 = new JTextField();
    jtf2 = new JPasswordField();
    jtf1.setBorder(BorderFactory.createLineBorder(Color.pink));
    jtf2.setBorder(BorderFactory.createLineBorder(Color.pink));
    jtf1.setFont(new Font("Arial", Font.PLAIN, 15));
    jtf2.setFont(new Font("Arial", Font.PLAIN, 19));
    jtf1.setBounds(130, 0, 150, 30);
    jtf2.setBounds(130, 80, 150, 30);
    jtf2.setEchoChar('*');
    pnl4.add(jtf1);
    pnl4.add(jtf2);
    btn1 = new JButton("Login");
    btn2 = new JButton("Clear");
    btn1.setBorder(BorderFactory.createLineBorder(Color.pink));
    btn2.setBorder(BorderFactory.createLineBorder(Color.pink));
    btn1.setForeground(Color.white);
    btn2.setForeground(Color.white);
    btn1.setBackground(Color.BLUE);
    btn2.setBackground(Color.RED);
    btn1.setFont(new Font("Arial", Font.PLAIN, 15));
    btn2.setFont(new Font("Arial", Font.PLAIN, 15));
    btn1.setBounds(35, 165, 80, 30);
    btn2.setBounds(165, 165, 80, 30);
    btn1.addActionListener(new handleevent(this));
    btn2.addActionListener(new handleevent(this));
    l5=new JLabel("If you are new user? create");
    l5.setBounds(37,210,200,30);
    l5.setForeground(Color.white);
    l5.setFont(new Font("Arial", Font.PLAIN, 14));
    btn3=new JButton("Account");
    btn3.setForeground(Color.green);
    btn3.setFont(new Font("Arial", Font.PLAIN, 14));
    btn3.setBounds(207,210,83,30);
    btn3.setBorder(BorderFactory.createLineBorder(Color.black));
    btn3.setBackground(Color.black);
    btn3.addActionListener(new signin(this));
    pnl4.add(l5);
    pnl4.add(btn3);
    pnl4.add(btn1);
    pnl4.add(btn2);

    // pnl3.setLayout(new Flowlay);
    // pnl3.setBounds(0,0,200,400);
    img1 = new ImageIcon("E:\\Java\\project 4sem\\project\\images\\teamwork.png");
    l1 = new JLabel("", img1, JLabel.CENTER);
    l1.setSize(img1.getIconWidth(), img1.getIconHeight());
    l1.setLocation(20, 0);
    // pnl3.setBounds(100,100,100,300);
    pnl3.setBackground(Color.pink);
    pnl3.setBounds(0, 70, 300, 260);
    pnl3.add(l1);

    // pnl4.setBorder(BorderFactory.createLineBorder(Color.white));
    pnl4.setBackground(Color.black);
    pnl4.setBounds(40, 100, 300, 250);
    // String str[]={"Admin","User"};
    // JComboBox jcb=new JComboBox(str);

    pnl1.setBounds(0, 0, 300, 500);
    pnl2.setBounds(300, 0, 400, 500);
    pnl1.setBackground(Color.pink);
    pnl2.setBackground(Color.BLACK);
    pnl1.add(pnl3);
    pnl2.add(pnl4);
    f1.add(pnl1);
    f1.add(pnl2);
    f1.repaint();
  }

}

class handleevent implements ActionListener {
  Login l1;
  char getpss[];
  String ps;

  public handleevent(Login l2) {
    l1 = l2;
  }

  public void actionPerformed(ActionEvent e) {
    String nme = l1.jtf1.getText();
    getpss = l1.jtf2.getPassword();
    ps = String.valueOf(getpss);
    if (e.getSource() == l1.btn1) {
      if(l1.btn1.getText().equals("Login")){
      if (l1.jcmb.getSelectedItem().toString() == "Admin") {
        if (nme.isEmpty() || ps.isEmpty()) {
          JOptionPane.showMessageDialog(l1.f1, "fill the Field first", "information", JOptionPane.INFORMATION_MESSAGE);
        } else {
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/aap", "root", "");
            if (c.isClosed()) {
              System.out.println("not connected");
            } else {
         
              Statement s1 = c.createStatement();
              ResultSet rs = s1.executeQuery("select admin,passwrd from data");
              // rs.absolute(1);
              while (rs.next()) {
                String s = rs.getString("admin");
                String pswrd = rs.getString("passwrd");
                if (s.equals(nme) && pswrd.equals(ps)) {
                  JOptionPane.showMessageDialog(l1.f1, "login sucess", "message", JOptionPane.PLAIN_MESSAGE);
                  l1.f1.setVisible(false);
                  new Admin(l1);
                } else {
                  JOptionPane.showMessageDialog(l1.f1, "Wrong password", "Error", JOptionPane.ERROR_MESSAGE);
                }
              }
              c.close();
            }
          } catch (Exception ems) {
            System.out.println(ems.getMessage());
          }
        }
      }
      else{
        if (nme.isEmpty() || ps.isEmpty()) {
          JOptionPane.showMessageDialog(l1.f1, "fill the Field first", "information", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
          int fl=0;
       try{
          // Class.forName("com.mysql.jdbc.Driver");
          Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/stu","root","");
          String st="select * from userdetail";
          Statement stm=conn.createStatement();
          ResultSet rs=stm.executeQuery(st);
          while(rs.next()){
            String id = rs.getString("userid");
            String pswrd = rs.getString("psswrd");
             if(id.equals(nme) && pswrd.equals(ps)){
              JOptionPane.showMessageDialog(l1.f1, "login sucess", "message", JOptionPane.PLAIN_MESSAGE);
              fl=1;
              l1.f1.setVisible(false);
              new User(l1,nme);
             }
          }
          if(fl==0){
            JOptionPane.showMessageDialog(l1.f1, "Wrong data field", "message", JOptionPane.PLAIN_MESSAGE);
          }
          conn.close();
       }
       catch(SQLException er){
           JOptionPane.showMessageDialog(l1.f1, er.getMessage(), "message", JOptionPane.PLAIN_MESSAGE);
       }
      }
      }
    }
    else{
      if (nme.isEmpty() || ps.isEmpty()) {
        JOptionPane.showMessageDialog(l1.f1, "fill the Field first", "information", JOptionPane.INFORMATION_MESSAGE);
      } 
      else{  
       int flag=0;
         try{
          // Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stu", "root", "");
           String str="select * from studetail  ";
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery(str);
          while(rs.next()){
                    if(rs.getString("user_id").equals(nme)){
          
                      String str1="insert into userdetail values('"+nme+"'"+","+Integer.parseInt(ps)+","+Integer.parseInt(rs.getString("id"))+")";
                      int val=st.executeUpdate(str1);
                                 if(val>0){
                                  JOptionPane.showMessageDialog(l1.f1, "Account creaed successfully..", "information", JOptionPane.INFORMATION_MESSAGE);
                                  flag=1;
                                 } 
                                 l1.jtf1.setText("");
                                 l1.jtf2.setText("");
                                //  con.close();
                       }
                  }
                  if(flag == 0){
                    JOptionPane.showMessageDialog(l1.f1, "User id is not valid..", "Error", JOptionPane.ERROR_MESSAGE);
                  }
         }
  //         while(rs.next()){
  //           if(rs.getString("user_id").equals(nme)){
  //             con.close();
  //             String str1="insert into user values('"+nme+"'"+Integer.parseInt(ps)+")";
  //            int val=st.executeUpdate(str1);
  //            System.out.print(val);
  //            if(val>0){
  //             JOptionPane.showMessageDialog(l1.f1, "Account creaed successfully..", "information", JOptionPane.INFORMATION_MESSAGE);
  //            }
  //            con.close();
  //           System.out.print("yes equal");
  //            l1.btn1.setText("Login");
  //           }
  //         }
     
  //  }   
     catch(SQLException er){
      JOptionPane.showMessageDialog(l1.f1,er.getMessage(), "information", JOptionPane.INFORMATION_MESSAGE);
         }
      }
     
    }
    } else {
      // System.out.println("before"+l1.jtf1);
      l1.jtf1.setText("");
      l1.jtf2.setText("");
      // System.out.println("after"+l1.jtf1);
    }
  }
}

class signin implements ActionListener{
Login obje;
  public signin(Login par){
    obje=par;
  }
  public void actionPerformed(ActionEvent e){
    if(obje.btn3.getText().equals("Account")){ 
    obje.btn1.setText("Signup");
      obje.jcmb.setSelectedItem("User");
      obje.pnl2.setBackground(Color.DARK_GRAY);
      obje.pnl4.setBackground(Color.DARK_GRAY);
     obje. l4.setBorder(BorderFactory.createLineBorder(Color.darkGray));
     obje. l3.setBorder(BorderFactory.createLineBorder(Color.darkGray));
      obje.pnl4.remove(obje.l5);
      obje.btn3.setText("Back to Login Area");
      obje.btn3.setBounds(8,210,300,30);

    }
    else{
      obje.btn1.setText("Login");
      obje.jcmb.setSelectedItem("Admin");
      obje.pnl2.setBackground(Color.black);
      obje.pnl4.setBackground(Color.black);
      obje. l4.setBorder(BorderFactory.createLineBorder(Color.black));
     obje. l3.setBorder(BorderFactory.createLineBorder(Color.black));
      obje.pnl4.add(obje.l5);
      obje.btn3.setText("Account");
      obje.btn3.setBounds(207,210,83,30);
    }
  }
}