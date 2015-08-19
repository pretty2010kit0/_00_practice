package day01;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
public class MyDoc {
	public static void main(String[] args) {
		JFrame frame=new JFrame("无法找到服务器");
		JPanel panel=new JPanel();
		JLabel label=new JLabel("The First Day");
		
		panel.add(label);
		frame.add(panel);

		frame.setVisible(true);
		frame.setSize(1500,900);
	}
}