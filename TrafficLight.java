import javax.swing.*;import java.awt.*;import java.awt.event.*;
public class TrafficLight extends JFrame implements ActionListener{
 JLabel label; JRadioButton red,yellow,green;
 TrafficLight(){
  label=new JLabel("Select Signal");
  red=new JRadioButton("Red"); yellow=new JRadioButton("Yellow"); green=new JRadioButton("Green");
  ButtonGroup bg=new ButtonGroup(); bg.add(red); bg.add(yellow); bg.add(green);
  red.addActionListener(this); yellow.addActionListener(this); green.addActionListener(this);
  setLayout(new FlowLayout()); add(label); add(red); add(yellow); add(green);
  setSize(300,200); setVisible(true); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
 public void actionPerformed(ActionEvent e){
  if(red.isSelected()){label.setText("STOP");label.setForeground(Color.RED);}
  if(yellow.isSelected()){label.setText("READY");label.setForeground(Color.ORANGE);}
  if(green.isSelected()){label.setText("GO");label.setForeground(Color.GREEN);}
 }
 public static void main(String[] args){new TrafficLight();}
}
