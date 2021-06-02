import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
//import javax.swing.JOptionPane;
public class View extends JPanel {
  ImageIcon img1,img2,img3,img4;
  Image img,imga;
  JLabel jlb,jlb1,jlb2,jlb3,jlb4,jlb5,jlb6,jlb7,jlb8,jlb9,jlb10,jlb11,jlb12,jlb13,jlb14,jlb15,jlb16,jlb17,jlb18,jlb19,jlb20,jlb21;
  JTextField jtf1;
  JPanel jpl;
  JButton jbtnn;
  public View(){
    setLayout(null);
    setBackground(Color.darkGray);
  img1=new ImageIcon("E:\\Java\\project 4sem\\project\\images\\img4.jpg");
  img=img1.getImage().getScaledInstance(580, 440, Image.SCALE_DEFAULT);
  img2=new ImageIcon(img);
  jlb=new JLabel(img2);
  img3=new ImageIcon("E:\\Java\\project 4sem\\project\\images\\right-arrow.png");
  imga=img3.getImage().getScaledInstance(img3.getIconWidth(), img3.getIconHeight(),Image.SCALE_DEFAULT);
 img4=new ImageIcon(imga);
  jlb1=new JLabel("Employee Id:- ");
  jlb1.setBounds(150,20,140,25);
  jlb1.setFont(new Font("Arial",Font.PLAIN,21));
  jlb1.setForeground(Color.white);
  jtf1=new JTextField();
  jtf1.setBounds(295,20,100,25);
  jtf1.setFont(new Font("Arial",Font.PLAIN,18));
  jbtnn=new JButton(img4);
  jbtnn.setBorder(BorderFactory.createLineBorder(Color.darkGray));
  jbtnn.setBackground(Color.darkGray);
  jbtnn.setBounds(405,13,70,35);
  jbtnn.addActionListener(new run(this));
  add(jbtnn);
  add(jlb1);
  add(jtf1);

jpl=new JPanel();
jpl.setLayout(null);
jlb.setBounds(0,0,img2.getIconWidth(),img2.getIconHeight());
jpl.add(jlb);
jpl.setBounds(0,60,580,440);
jlb2=new JLabel("Name :-");
jlb3=new JLabel();
jlb4=new JLabel("Age :-");
jlb5=new JLabel();
jlb6=new JLabel("Job post :-");
jlb7=new JLabel();
jlb8=new JLabel("Email id :-");
jlb9=new JLabel();
jlb10=new JLabel("Father name :-");
jlb11=new JLabel();
jlb12=new JLabel("Phone no :-");
jlb13=new JLabel();
jlb14=new JLabel("Date-of-birth :-");
jlb15=new JLabel();
jlb16=new JLabel("Education :-");
jlb17=new JLabel();
jlb18=new JLabel("Adhaar no :-");
jlb19=new JLabel();
jlb20=new JLabel("Address :-");
jlb21=new JLabel();

jlb2.setBounds(40,10,200,25);
jlb3.setBounds(145,10,100,25);
jlb4.setBounds(40,40,100,25);
jlb5.setBounds(145,40,100,25);
jlb6.setBounds(40,70,100,25);
jlb7.setBounds(145,70,100,25);
jlb8.setBounds(40,100,100,25);
jlb9.setBounds(145,100,200,25);
jlb10.setBounds(40,130,150,25);
jlb11.setBounds(145,130,100,25);
jlb12.setBounds(40,160,100,25);
jlb13.setBounds(145,160,100,25);
jlb14.setBounds(40,190,150,25);
jlb15.setBounds(145,190,100,25);
jlb16.setBounds(40,220,100,25);
jlb17.setBounds(145,220,100,25);
jlb18.setBounds(40,250,150,25);
jlb19.setBounds(145,250,100,25);
jlb20.setBounds(40,280,100,25);
jlb21.setBounds(145,280,300,25);

jlb2.setForeground(Color.white);
jlb3.setForeground(Color.white);
jlb4.setForeground(Color.white);
jlb5.setForeground(Color.white);
jlb6.setForeground(Color.white);
jlb7.setForeground(Color.white);
jlb8.setForeground(Color.white);
jlb9.setForeground(Color.white);
jlb10.setForeground(Color.white);
jlb11.setForeground(Color.white);
jlb12.setForeground(Color.white);
jlb13.setForeground(Color.white);
jlb14.setForeground(Color.white);
jlb15.setForeground(Color.white);
jlb16.setForeground(Color.white);
jlb17.setForeground(Color.white);
jlb18.setForeground(Color.white);
jlb19.setForeground(Color.white);
jlb20.setForeground(Color.white);
jlb21.setForeground(Color.white);

Font f1=new Font("Arial",Font.PLAIN,17);
jlb2.setFont(f1);
jlb3.setFont(f1);
jlb4.setFont(f1);
jlb5.setFont(f1);
jlb6.setFont(f1);
jlb7.setFont(f1);
jlb8.setFont(f1);
jlb9.setFont(f1);
jlb10.setFont(f1);
jlb11.setFont(f1);
jlb12.setFont(f1);
jlb13.setFont(f1);
jlb14.setFont(f1);
jlb15.setFont(f1);
jlb16.setFont(f1);
jlb17.setFont(f1);
jlb18.setFont(f1);
jlb19.setFont(f1);
jlb20.setFont(f1);
jlb21.setFont(f1);

jlb.add(jlb2);
jlb.add(jlb3);
jlb.add(jlb4);
jlb.add(jlb5);
jlb.add(jlb6);
jlb.add(jlb7);
jlb.add(jlb8);
jlb.add(jlb9);
jlb.add(jlb10);
jlb.add(jlb11);
jlb.add(jlb12);
jlb.add(jlb13);
jlb.add(jlb14);
jlb.add(jlb15);
jlb.add(jlb16);
jlb.add(jlb17);
jlb.add(jlb18);
jlb.add(jlb19);
jlb.add(jlb20);
jlb.add(jlb21);
add(jpl);
  }
}

class run implements ActionListener{
  View v1;
  public run(View obj){
   v1=obj;
  }
  public void actionPerformed(ActionEvent e){
    if(v1.jtf1.getText().isEmpty()){
      JOptionPane.showMessageDialog(v1, "Field is empty", "Error", JOptionPane.ERROR_MESSAGE);
    } 
    else{ 
    try{
      int flag=0;
         Class.forName("com.mysql.jdbc.Driver");
         Connection c1=DriverManager.getConnection("jdbc:mysql://localhost:3306/stu", "root", "");
         Statement s1=c1.createStatement();
         String str="select * from studetail where id="+Integer.parseInt(v1.jtf1.getText());
         ResultSet rs=s1.executeQuery(str);
         System.out.println(rs);
         while(rs.next()){
          v1.jlb3.setText(rs.getString("name"));
          v1.jlb5.setText(rs.getString("age"));
          v1.jlb7.setText(rs.getString("post"));
          v1.jlb9.setText(rs.getString("email"));
          v1.jlb11.setText(rs.getString("fathername"));
          v1.jlb13.setText(rs.getString("phone"));
          v1.jlb15.setText(rs.getString("dateofbirth"));
          v1.jlb17.setText(rs.getString("education"));
          v1.jlb19.setText(rs.getString("adhaar_no"));
          v1.jlb21.setText(rs.getString("address"));
          flag=1;
         }
         if(flag == 0){
           JOptionPane.showMessageDialog(v1, "This id of Employee doesn't Exit", "Error", JOptionPane.ERROR_MESSAGE);
           v1.jlb3.setText("");
           v1.jlb5.setText("");
           v1.jlb7.setText("");
           v1.jlb9.setText("");
           v1.jlb11.setText("");
           v1.jlb13.setText("");
           v1.jlb15.setText("");
           v1.jlb17.setText("");
           v1.jlb19.setText("");
           v1.jlb21.setText("");
         }
      }
      catch(ClassNotFoundException err ){
        System.out.println(err.getMessage());
      }
      catch( SQLException err){
        System.out.println(err.getMessage());
      }
    }
  }
}