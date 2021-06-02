import javax.swing.*;
import javax.swing.JTextField;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class Update  extends JPanel{
  ImageIcon img1,img2,img3,img4;
  Image img,imga;
  JLabel jlb,jlb1,jlb3,jlb4,jlb5,jlb6,jlb7,jlb8,jlb9,jlb10,jlb11,jlb13;
  JTextField jtf,jtf1,jtf2,jtf3,jtf4,jtf6,jtf7;
  JPanel jpl;
  JButton jbtnn,btn;
  JTextArea jtarea;
  JSpinner spinner;
  JComboBox<String> jcmb;
  public Update(){
    setLayout(null);
    setBackground(Color.darkGray);
  img1=new ImageIcon("E:\\Java\\project 4sem\\project\\images\\img1.jpg");
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
  jtf=new JTextField();
  jtf.setBounds(295,20,100,25);
  jtf.setFont(new Font("Arial",Font.PLAIN,18));
  jbtnn=new JButton(img4);
  jbtnn.setBorder(BorderFactory.createLineBorder(Color.darkGray));
  jbtnn.setBackground(Color.darkGray);
  jbtnn.setBounds(405,13,70,35);
  jbtnn.addActionListener(new arrowbtn(this));
 // jbtnn.addActionListener(new run(this));
  add(jbtnn);
  add(jlb1);
  add(jtf);

jpl=new JPanel();
jpl.setLayout(null);
jlb.setBounds(0,0,img2.getIconWidth(),img2.getIconHeight());
jpl.add(jlb);
jpl.setBounds(0,60,580,440);

Font f2=new Font("Arial",Font.PLAIN,17);

//name

jlb3=new JLabel("Name");
jlb3.setBounds(20,30,100,20);
jlb3.setFont(f2);
jlb3.setForeground(Color.white);
jlb.add(jlb3);
jtf1=new JTextField();
jtf1.setBounds(110,30,110,30);
jtf1.setBackground(Color.DARK_GRAY);
jtf1.setForeground(Color.white);
jtf1.setBorder(BorderFactory.createLineBorder(Color.white));
jlb.add(jtf1);
//age
jlb4=new JLabel("Age");
jlb4.setBounds(20,90,100,20);
jlb4.setFont(f2);
jlb4.setForeground(Color.white);
jlb.add(jlb4);
SpinnerModel smodel=new SpinnerNumberModel(25,20,30,1);
 spinner=new JSpinner(smodel);
spinner.setFont(f2);
spinner.setBounds(110,90,70,25);
jlb.add(spinner);
//email id
jlb5=new JLabel("Email Id");
jlb5.setBounds(20,150,100,20);
jlb5.setFont(f2);
jlb5.setForeground(Color.white);
jlb.add(jlb5);
jtf2=new JTextField();
jtf2.setBounds(110, 150, 130, 30);
jtf2.setBackground(Color.DARK_GRAY);
jtf2.setForeground(Color.white);
jtf2.setBorder(BorderFactory.createLineBorder(Color.white));
jlb.add(jtf2);
//job post
jlb6=new JLabel("Job Post");
jlb6.setBounds(20,210,100,20);
jlb6.setFont(f2);
jlb6.setForeground(Color.white);
jlb.add(jlb6);
String post[] = { "Assitant Manager", "HR" ,"Manager","Tester","Devloper"};
jcmb = new JComboBox<String>(post);
  jcmb.setBounds(110, 210, 130, 25);
  jcmb.setSelectedIndex(1);
  jcmb.setBorder(BorderFactory.createLineBorder(Color.white));
  jcmb.setFont(new Font("Arial", Font.PLAIN, 15));
  jlb.add(jcmb);
// adress
jlb7=new JLabel("Address");
jlb7.setBounds(20,280,100,20);
jlb7.setFont(f2);
jlb7.setForeground(Color.white);
jtarea=new JTextArea();
jtarea.setBounds(110, 275, 170, 85);
jtarea.setBackground(Color.DARK_GRAY);
jtarea.setForeground(Color.white);
jtarea.setBorder(BorderFactory.createLineBorder(Color.white));
jlb.add(jtarea);
jlb.add(jlb7);
//father name
jlb8=new JLabel("Father's name");
jlb8.setBounds(270,23,130,20);
jlb8.setFont(f2);
jlb8.setForeground(Color.white);
jlb.add(jlb8);
jtf3=new JTextField();
jtf3.setBounds(400,23,130,30);
jtf3.setBackground(Color.DARK_GRAY);
jtf3.setForeground(Color.white);
jtf3.setBorder(BorderFactory.createLineBorder(Color.white));
jlb.add(jtf3);
//date of birth
jlb9=new JLabel("Date of birth");
jlb9.setBounds(270,80,100,20);
jlb9.setFont(f2);
jlb9.setForeground(Color.white);
jlb.add(jlb9);
jtf7=new JTextField();
jtf7.setBounds(400,80,130,30);
jtf7.setBackground(Color.DARK_GRAY);
jtf7.setForeground(Color.white);
jtf7.setBorder(BorderFactory.createLineBorder(Color.white));
jlb.add(jtf7);
//phone
jlb10=new JLabel("Phone");
jlb10.setBounds(270,135,100,20);
jlb10.setFont(f2);
jlb10.setForeground(Color.white);
jlb.add(jlb10);
jtf4=new JTextField();
jtf4.setBounds(400,135,130,30);
jtf4.setBackground(Color.DARK_GRAY);
jtf4.setForeground(Color.white);
jtf4.setBorder(BorderFactory.createLineBorder(Color.white));
jlb.add(jtf4);
//education
jlb11=new JLabel("Education");
jlb11.setBounds(270,197,100,20);
jlb11.setFont(f2);
jlb11.setForeground(Color.white);
jlb.add(jlb11);
jtf6=new JTextField();
jtf6.setBounds(400,197,130,30);
jtf6.setBackground(Color.DARK_GRAY);
jtf6.setForeground(Color.white);
jtf6.setBorder(BorderFactory.createLineBorder(Color.white));
jlb.add(jtf6);
//aadahr no
btn=new JButton("Update");
btn.setBounds(390,290,90,30);
  btn.setFont(new Font("Arial",Font.BOLD,16));
  btn.setBackground(Color.green);
  btn.setForeground(Color.black);
  btn.addActionListener(new action(this));
  jlb.add(btn);
add(jpl);
jpl.revalidate();
  }
  public void setempty(){
    this.jtf1.setText(""); this.jtf2.setText(""); this.jtf3.setText(""); this.jtf4.setText("");  this.jtf6.setText("");  this.jtf7.setText(""); this.jtarea.setText("");}
  }

class arrowbtn implements ActionListener{
  Update l2;
  public arrowbtn(Update obj1){
  l2=obj1;
  }
  public void actionPerformed(ActionEvent e){
     if(l2.jtf.getText().isEmpty()){
      JOptionPane.showMessageDialog(l2, "make sure to fill the fields..!!!", "information", JOptionPane.INFORMATION_MESSAGE);
     }
     else{
       try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/stu", "root", "");
         Statement s1=con.createStatement();
         String query="select * from studetail where id="+Integer.parseInt(l2.jtf.getText());
         ResultSet rslt=s1.executeQuery(query);
         while(rslt.next()){
           l2.jtf1.setText(rslt.getString("name"));
           l2.spinner.setValue(Integer.parseInt(rslt.getString("age")));
           l2.jtf2.setText(rslt.getString("email"));
           l2.jcmb.setSelectedItem(rslt.getString("post"));
           l2.jtarea.setText(rslt.getString("address"));
           l2.jtf3.setText(rslt.getString("fathername"));
           l2.jtf7.setText(rslt.getString("dateofbirth"));
           l2.jtf4.setText(rslt.getString("phone"));
           l2.jtf6.setText(rslt.getString("education"));
         }
         con.close();
       }
       catch(Exception err){      JOptionPane.showMessageDialog(l2, err.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);}
     }
  }
}


class action implements ActionListener{
  Update obj;
  public action(Update l1){
  obj=l1;
  }
  public void actionPerformed(ActionEvent e){
    if(obj.jtf1.getText().isEmpty() || obj.jtf2.getText().isEmpty() || obj.jtf3.getText().isEmpty() || obj.jtf4.getText().isEmpty() ||  obj.jtf6.getText().isEmpty() || obj.jtarea.getText().isEmpty() || obj.jtf7.getText().isEmpty()){
      JOptionPane.showMessageDialog(obj, "make sure to fill all the fields..!!!", "information", JOptionPane.INFORMATION_MESSAGE);
    }
    else{
      try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/stu", "root", "");
        Statement s1=con.createStatement();
        String query="update studetail set name="+"'"+obj.jtf1.getText()+"'"+","+ "age="+obj.spinner.getValue()+","+"email="+"'"+obj.jtf2.getText()+"'"+","+"post="+"'"+obj.jcmb.getSelectedItem().toString()+"'" +","+"address="+"'"+obj.jtarea.getText()+"'"+","+"fathername="+"'"+obj.jtf3.getText()+"'"+","+   "dateofbirth="+"'"+obj.jtf7.getText()+"'"+"," +"phone="+Integer.parseInt(obj.jtf4.getText())+","+"education="+"'"+obj.jtf6.getText()+"'" +"where id="+Integer.parseInt(obj.jtf.getText());
        int val=s1.executeUpdate(query);
        if(val>0){
          JOptionPane.showMessageDialog(obj, "Record update successfully", "Message", JOptionPane.PLAIN_MESSAGE);
          obj.setempty();
        }
        con.close();
      }
      catch(ClassNotFoundException err){
        System.out.println(err.getMessage());
      }
      catch(SQLException err){
        JOptionPane.showMessageDialog(obj, err.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
      }
    }
  }
}