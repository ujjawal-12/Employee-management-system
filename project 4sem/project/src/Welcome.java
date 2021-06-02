import java.awt.*;
import javax.swing.*;

public class Welcome {
  private JWindow jf1;
  private JPanel jp1, jp2;
  private JLabel jlb1;
  private ImageIcon imgicon, imgicon2;
  private Image img;
  private int x;

  public Welcome() {
    jf1 = new JWindow();
    jp1 = new JPanel();
    jp2 = new JPanel();
    jf1.setBounds(200, 100, 700, 450);
    jf1.setVisible(true);
    jp1.setLayout(new BorderLayout());
    jp2.setLayout(new BorderLayout());
    jp1.setBorder(BorderFactory.createLineBorder(Color.black));
    jp2.setBorder(BorderFactory.createLineBorder(Color.black));
    imgicon = new ImageIcon("E:\\Java\\project 4sem\\project\\images\\img.jpg");
    img = imgicon.getImage().getScaledInstance(700, 430, Image.SCALE_DEFAULT);
    imgicon2 = new ImageIcon(img);
    jlb1 = new JLabel(imgicon2);
    jp2.add(jlb1);
    Container c1 = jf1.getContentPane();
    JProgressBar progress = new JProgressBar(0, 104);
    progress.setStringPainted(true);
    progress.setForeground(Color.GREEN);
    jp1.add(BorderLayout.CENTER, jp2);
    jp1.add(BorderLayout.PAGE_END, progress);
    c1.add(BorderLayout.CENTER, jp1);
    jf1.revalidate();
    while (progress.getValue() != 104) {
      if (progress.getValue() < 30) {
        progress.setString("Proccessing......");
      } else if (progress.getValue() > 30 && progress.getValue() < 80) {
        progress.setString("Wait for sometime....");
      } else {
        progress.setString("Just finished....");
      }
  
      if (progress.getValue() == 100) {
        jf1.setVisible(false);
        System.out.println(progress.getValue());
        new Login();
        break;

      } else {
        x += 4;
        progress.setValue(x);
        try {
          Thread.sleep(200);
        } catch (Exception e) {
          System.out.println(e.getMessage());
        }
      }

    }
  }
}
