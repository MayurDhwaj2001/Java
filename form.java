import javax.swing.*;
import java.awt.event.*;
public class form extends JFrame implements ActionListener
{
 JLabel lb;
 JTextField tf;
 JButton btn;
 public form()
 {
 lb=new JLabel("Enter a Value :");
 tf=new JTextField();
 btn=new JButton("SQUARE");
 lb.setBounds(10, 10, 100, 20);
 tf.setBounds(110, 10, 50, 20);
 btn.setBounds(30, 40, 100, 20);
 setLayout(null);
 add(lb);
 add(tf);
 add(btn);
 setVisible(true);
 setSize(400,400);
 setLocationRelativeTo(null);
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 btn.addActionListener(this);
 }
 @Override
 public void actionPerformed(ActionEvent a)
 {
 if (tf.getText().equals(""))
 {
 JOptionPane.showMessageDialog(this, "Empty Text Field !");
 }
 else
 {
 int n=Integer.parseInt(tf.getText());
 int sq=n*n;
 JOptionPane.showMessageDialog(this, "Square of "+n+" = "+sq);
 }
 }
 public static void main(String[] args)
 {
 new form();
 }
}
