import javax.swing.JPanel;
import java.awt.*;
public class Othersoperation extends JPanel {
  JPanel jp1;
  public Othersoperation(){
    setBackground(Color.gray);
     jp1=new JPanel();
     jp1.setLayout(null);
     jp1.setBounds(0,0,300,200);
     jp1.setBackground(Color.blue);
     add(jp1);
  }
}
