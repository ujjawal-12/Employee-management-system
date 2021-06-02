//import javax.swing.BorderFactory;
//import javax.swing.border.Border;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
//import java.awt.BorderLayout;
public class Addemployee extends JPanel{
  JLabel jlb,jlb1,jlb2,jlb3,jlb4,jlb5,jlb6,jlb7,jlb8,jlb9,jlb10,jlb11,jlb12,jlb13,jlb14;
  JTextField jtf1,jtf2,jtf3,jtf4,jtf5,jtf6,jtf7,jtf8;
  JTextArea jtarea;
  JSpinner spinner,spinner1;
  JComboBox<String> jcmb;
  ImageIcon img1,img2;
  Image img;
  JButton jbtnn;
  public Addemployee(){
  //  jp3=new JPanel();
  setBackground(Color.green);
  setLayout(new BorderLayout());
  img1=new ImageIcon("E:\\Java\\project 4sem\\project\\images\\img3.jpg");
  img=img1.getImage().getScaledInstance(580, 500, Image.SCALE_DEFAULT);
  img2=new ImageIcon(img);
  jlb=new JLabel(img2);
  jlb1=new JLabel("Register New Employee");
  jlb1.setForeground(Color.cyan);
  jlb1.setBorder(new MatteBorder(0,0,1,0,Color.cyan));
  Font f1=new Font("Arial",Font.BOLD,25);
  Font f2=new Font("Arial",Font.PLAIN,17);
  jlb1.setFont(f1);
  jlb1.setBounds(150, 10, 288, 30);
  //id
  jlb2=new JLabel("Employee ID");
  jlb2.setBounds(20,80,100,20);
  jlb2.setFont(f2);
  jlb2.setForeground(Color.white);
  jlb.add(jlb2);
  SpinnerModel smodel1=new SpinnerNumberModel(0,0,50,1);
  spinner1=new JSpinner(smodel1);
  spinner1.setFont(f2);
  spinner1.setBounds(130,75,70,25);
  jlb.add(spinner1);
  //name
  jlb14=new JLabel("Emp User Id");
  jlb14.setBounds(20,130,110,25);
  jlb14.setFont(f2);
  jlb14.setForeground(Color.white);
  jlb.add(jlb14);
  jtf8=new JTextField();
  jtf8.setBounds(125,130,110,30);
  jtf8.setBackground(Color.DARK_GRAY);
  jtf8.setForeground(Color.white);
  jtf8.setBorder(BorderFactory.createLineBorder(Color.white));
  jlb.add(jtf8);

  jlb3=new JLabel("Name");
  jlb3.setBounds(20,180,100,20);
  jlb3.setFont(f2);
  jlb3.setForeground(Color.white);
  jlb.add(jlb3);
  jtf1=new JTextField();
  jtf1.setBounds(110,180,110,30);
  jtf1.setBackground(Color.DARK_GRAY);
  jtf1.setForeground(Color.white);
  jtf1.setBorder(BorderFactory.createLineBorder(Color.white));
  jlb.add(jtf1);
  //age
  jlb4=new JLabel("Age");
  jlb4.setBounds(20,230,100,20);
  jlb4.setFont(f2);
  jlb4.setForeground(Color.white);
  jlb.add(jlb4);
  SpinnerModel smodel=new SpinnerNumberModel(25,20,30,1);
   spinner=new JSpinner(smodel);
  spinner.setFont(f2);
  spinner.setBounds(110,230,70,25);
  jlb.add(spinner);
  //email id
  jlb5=new JLabel("Email Id");
  jlb5.setBounds(20,280,100,20);
  jlb5.setFont(f2);
  jlb5.setForeground(Color.white);
  jlb.add(jlb5);
  jtf2=new JTextField();
  jtf2.setBounds(110, 280, 130, 30);
  jtf2.setBackground(Color.DARK_GRAY);
  jtf2.setForeground(Color.white);
  jtf2.setBorder(BorderFactory.createLineBorder(Color.white));
  jlb.add(jtf2);
  //job post
  jlb6=new JLabel("Job Post");
  jlb6.setBounds(20,330,100,20);
  jlb6.setFont(f2);
  jlb6.setForeground(Color.white);
  jlb.add(jlb6);
  String post[] = { "Assitant Manager", "HR" ,"Manager","Tester","Devloper"};
  jcmb = new JComboBox<String>(post);
    jcmb.setBounds(110, 335, 130, 25);
    jcmb.setSelectedIndex(1);
    jcmb.setBorder(BorderFactory.createLineBorder(Color.white));
    jcmb.setFont(new Font("Arial", Font.PLAIN, 15));
    jlb.add(jcmb);
  // adress
  jlb7=new JLabel("Address");
  jlb7.setBounds(20,380,100,20);
  jlb7.setFont(f2);
  jlb7.setForeground(Color.white);
  jtarea=new JTextArea();
  jtarea.setBounds(110, 380, 170, 75);
  jtarea.setBackground(Color.DARK_GRAY);
  jtarea.setForeground(Color.white);
  jtarea.setBorder(BorderFactory.createLineBorder(Color.white));
  jlb.add(jtarea);
  jlb.add(jlb7);
  //father name
  jlb8=new JLabel("Father's name");
  jlb8.setBounds(270,80,130,20);
  jlb8.setFont(f2);
  jlb8.setForeground(Color.white);
  jlb.add(jlb8);
  jtf3=new JTextField();
  jtf3.setBounds(400,70,130,30);
  jtf3.setBackground(Color.DARK_GRAY);
  jtf3.setForeground(Color.white);
  jtf3.setBorder(BorderFactory.createLineBorder(Color.white));
  jlb.add(jtf3);
  //date of birth
  jlb9=new JLabel("Date of birth");
  jlb9.setBounds(270,130,100,20);
  jlb9.setFont(f2);
  jlb9.setForeground(Color.white);
  jlb.add(jlb9);
  jtf7=new JTextField();
  jtf7.setBounds(400,130,130,30);
  jtf7.setBackground(Color.DARK_GRAY);
  jtf7.setForeground(Color.white);
  jtf7.setBorder(BorderFactory.createLineBorder(Color.white));
  jlb.add(jtf7);
  //phone
  jlb10=new JLabel("Phone");
  jlb10.setBounds(270,180,100,20);
  jlb10.setFont(f2);
  jlb10.setForeground(Color.white);
  jlb.add(jlb10);
  jtf4=new JTextField();
  jtf4.setBounds(400,180,130,30);
  jtf4.setBackground(Color.DARK_GRAY);
  jtf4.setForeground(Color.white);
  jtf4.setBorder(BorderFactory.createLineBorder(Color.white));
  jlb.add(jtf4);
  //education
  jlb11=new JLabel("Education");
  jlb11.setBounds(270,230,100,20);
  jlb11.setFont(f2);
  jlb11.setForeground(Color.white);
  jlb.add(jlb11);
  jtf6=new JTextField();
  jtf6.setBounds(400,230,130,30);
  jtf6.setBackground(Color.DARK_GRAY);
  jtf6.setForeground(Color.white);
  jtf6.setBorder(BorderFactory.createLineBorder(Color.white));
  jlb.add(jtf6);
  //aadahr no
  jlb12=new JLabel("Aadhar no");
  jlb12.setBounds(270,280,100,20);
  jlb12.setFont(f2);
  jlb12.setForeground(Color.white);
  jlb.add(jlb12);
  jtf5=new JTextField();
  jtf5.setBounds(400,280,130,30);
  jtf5.setBackground(Color.DARK_GRAY);
  jtf5.setForeground(Color.white);
  jtf5.setBorder(BorderFactory.createLineBorder(Color.white));
  jlb.add(jtf5);
  //button
  jbtnn=new JButton("Save");
  jbtnn.setBounds(410,380,90,30);
  jbtnn.setFont(new Font("Arial",Font.BOLD,20));
  jbtnn.setBackground(Color.green);
  jbtnn.setForeground(Color.black);
  jbtnn.addActionListener(new Savestu(this));
  jbtnn.setBorder(BorderFactory.createLineBorder(Color.green));
  jlb.add(jbtnn);
  //jlb1.setBorder(BorderFactory.createLineBorder(Color.white));
  jlb.add(jlb1);
  add(jlb,BorderLayout.CENTER);
  }
  public void setempty(){
    this.jtf1.setText(""); this.jtf2.setText(""); this.jtf3.setText(""); this.jtf4.setText(""); this.jtf5.setText(""); this.jtf6.setText("");  this.jtf7.setText(""); this.jtarea.setText("");}
}

class Savestu implements ActionListener{
  Addemployee addobj;
  public Savestu(Addemployee obj){
      addobj=obj;
  }
  public void actionPerformed(ActionEvent e){
    if(addobj.jtf1.getText().isEmpty() || addobj.jtf2.getText().isEmpty() || addobj.jtf3.getText().isEmpty() || addobj.jtf4.getText().isEmpty() || addobj.jtf5.getText().isEmpty() || addobj.jtf6.getText().isEmpty() || addobj.jtarea.getText().isEmpty() || addobj.jtf7.getText().isEmpty() || addobj.jtf8.getText().isEmpty()){
      JOptionPane.showMessageDialog(addobj, "make sure to fill all the fields..!!!", "information", JOptionPane.INFORMATION_MESSAGE);
    }
  else{
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stu", "root", "");
    String st="insert into studetail values("+addobj.spinner1.getValue()+","+"'"+addobj.jtf8.getText()+"'"+","+ "'"+addobj.jtf1.getText()+"'"+","+addobj.spinner.getValue()+","+"'"+addobj.jtf2.getText()+"'"+","+"'"+addobj.jcmb.getSelectedItem().toString()+"'"+","+"'"+addobj.jtarea.getText()+"'"+","+"'"+addobj.jtf3.getText()+"'"+","+"'"+addobj.jtf7.getText()+"'"+","+"'"+addobj.jtf4.getText()+"'"+","+"'"+addobj.jtf6.getText()+"'"+","+"'"+addobj.jtf5.getText()+"'"+")";
    Statement stmt=con.createStatement();
    int val=stmt.executeUpdate(st);
    if(val>0){
      JOptionPane.showMessageDialog(addobj, "Record inserted successfully", "Message", JOptionPane.PLAIN_MESSAGE);
      addobj.setempty();
    }

    con.close();
    }
    catch(ClassNotFoundException err){
      System.out.println(err.getMessage());
    }
    catch(SQLException err){ JOptionPane.showMessageDialog(addobj, err.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);}

  }
}
}
