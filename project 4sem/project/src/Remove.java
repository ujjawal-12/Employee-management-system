//import javax.swing.BorderFactory;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;
import java.sql.*;
//import javax.swing.border.Border;

import java.awt.*;
public class Remove extends JPanel implements ActionListener{
  JLabel jl1,jl2;
  JTextField jtf1;
  JButton jbtn1;
  public Remove(){
    setLayout(null);
    setBackground(Color.DARK_GRAY);
    jl1=new JLabel();
    jl1.setText("Enter the Employee Id to delete the employe record.");
    jl1.setFont(new Font("Arial",Font.BOLD,20));
    jl1.setBackground(Color.black);
    jl1.setForeground(Color.white);
    //jl1.setBorder(BorderFactory.createLineBorder(Color.black));
    jl1.setBounds(60,110,450,30);
    add(jl1);
    jl2=new JLabel();
    jl2.setFont(new Font("Arial",Font.PLAIN,18));
    jl2.setText("Employee Id :-");
    jl2.setBackground(Color.black);
    jl2.setForeground(Color.white);
    //jl2.setBorder(BorderFactory.createLineBorder(Color.black));
    jl2.setBounds(140,180,130,30);
    jtf1=new JTextField();
    jtf1.setBounds(285,180,90,30);
    jtf1.setFont(new Font("Arial",Font.PLAIN,17));
    jbtn1=new JButton("Delete");
    jbtn1.setFont(new Font("Arial",Font.PLAIN,17));
    jbtn1.setBackground(Color.red);
    jbtn1.setForeground(Color.white);
    jbtn1.setBorder(BorderFactory.createLineBorder(Color.black));
    jbtn1.setBounds(210,240,90,30);
    jbtn1.addActionListener(this);
    add(jbtn1);
    add(jtf1);
   add(jl2);
  }

  public void actionPerformed(ActionEvent e){
   int sel= JOptionPane.showConfirmDialog(this,"Are you sure to delete this record?", "confirm", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE); 
    if(sel==JOptionPane.YES_OPTION){
           if(jtf1.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"Id is not entered","Error" ,JOptionPane.ERROR_MESSAGE);
            }
       else{
        try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stu", "root", "");
          Statement stmt=con.createStatement();
          String st="delete from studetail where id="+Integer.parseInt(jtf1.getText())+"";
          int val=stmt.executeUpdate(st);
          if(val>0){
             JOptionPane.showMessageDialog(this, "Record deleted successfully", "Message", JOptionPane.PLAIN_MESSAGE);
             jtf1.setText("");
          }
          else{
            JOptionPane.showMessageDialog(this, "This Id record not found", "Message", JOptionPane.PLAIN_MESSAGE);
            jtf1.setText("");
          }
          con.close();
          }
          catch(ClassNotFoundException err){
            System.out.println(err.getMessage());
          }
          catch(SQLException err){
            JOptionPane.showMessageDialog(this, "Invalid id entered.", "Message", JOptionPane.PLAIN_MESSAGE);
          }
        }
      }
  }
}
