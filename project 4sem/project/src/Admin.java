import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;

//mport jdk.jfr.internal.jfc.JFC;

public class Admin implements ActionListener{
  JFrame jf;
  JPanel jp1,jp2,jp3,jp4,jp5,jp6,jp7;
  JButton jb1,jb2,jb3,jb4,jb5,jb6;
  CardLayout card;
  Login ll1;
  Addemployee pn; Remove rmve;
   Update upd; View vw; Othersoperation otherop;
  public Admin(Login l1){
    //jframe
    ll1=l1;
  jf=new JFrame();
  jf. setVisible(true);
   jf.setLayout(null);
  jf. setBounds(200,100,710,500);
  jf. setResizable(false);
  jf. setTitle("Employee Management System");
  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  // panel-1
  jp1=new JPanel();
  jp1.setLayout(null);
  jp1.setBackground(Color.black);
  jp1. setBounds(0,0,130,500);
  jb1=new JButton("Add");
  jb2=new JButton("Remove");
  jb3=new JButton("Update");
  jb4=new JButton("View");
  jb5=new JButton("others");
  jb6=new JButton("LOGOUT");
  jb1.setBorder(BorderFactory.createLineBorder(Color.green));
  jb2.setBorder(BorderFactory.createLineBorder(Color.red));
  jb3.setBorder(BorderFactory.createLineBorder(Color.blue));
  jb4.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
  jb5.setBorder(BorderFactory.createLineBorder(Color.gray));
  jb6.setBorder(BorderFactory.createLineBorder(Color.red));
  jb1.setBackground(Color.black);
  jb2.setBackground(Color.black);
  jb3.setBackground(Color.black);
  jb4.setBackground(Color.black);
  jb5.setBackground(Color.black);
  jb6.setBackground(Color.red);
  jb1.setForeground(Color.green);
  jb2.setForeground(Color.red);
  jb3.setForeground(Color.blue);
  jb4.setForeground(Color.darkGray);
  jb5.setForeground(Color.gray);
  jb6.setForeground(Color.white);
  Font font=new Font("Arial",Font.BOLD,14);
  jb1.setFont(font);
  jb2.setFont(font);
  jb3.setFont(font);
  jb4.setFont(font);
  jb5.setFont(font);
  jb6.setFont(font);
  jb1.setBounds(0,120,130,30);
  jb2.setBounds(0,155,130,30);
  jb3.setBounds(0,190,130,30);
  jb4.setBounds(0,225,130,30);
  jb5.setBounds(0,260,130,30);
  jb6.setBounds(0,0,150,30);
  jb1.addActionListener(this);
  jb2.addActionListener(this);
  jb3.addActionListener(this);
  jb4.addActionListener(this);
  jb5.addActionListener(this);
  jb6.addActionListener(this);
  jp1.add(jb1);
  jp1.add(jb2);
  jp1.add(jb3);
  jp1.add(jb4);
  jp1.add(jb5);
 jp1.add(jb6);
  // panel-2
  jp2=new JPanel();
  card=new CardLayout();
  jp2.setLayout(card);
  jp2.setBackground(Color.ORANGE);
  jp2. setBounds(130,0,580,500);
 pn=new Addemployee();
 rmve=new Remove();
 upd=new Update();
 vw=new View();
 otherop=new Othersoperation();
  // jp3.setBackground(Color.green);
  jp2.add(pn,"one");
  jp2.add(rmve,"two");
  jp2.add(upd,"three");
  jp2.add(vw,"four");
  jp2.add(otherop,"five");
// add panel-1,panel-2 in jframe
  jf.add(jp1);
  jf.add(jp2);
  }
  public void actionPerformed(ActionEvent e){
    if(e.getSource()==jb1) card.show(jp2, "one"); 
    else if(e.getSource()==jb2) card.show(jp2, "two"); 
    else if(e.getSource()==jb3) card.show(jp2, "three"); 
    else if(e.getSource()==jb4) { card.show(jp2, "four");   } 
    else if(e.getSource()==jb5) card.show(jp2, "five");
    else{
      //System.out.println("logout");
      jf.dispose();
    ll1.f1.setVisible(true);
    ll1.jtf1.setText("");
    ll1.jtf2.setText("");
    }
   }
}