package day01;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/** 演示系统的API(类库)的使用 */
public class JFrameHelloWorldDemo {
	public static void main(String[] args) {
		// 注释
		JFrame frame  = new JFrame("窗口");//画框
		JPanel pane  = new JPanel();//代表面板
		JLabel label  = new JLabel("Hello World");//标签,显示文本/照片
		//组装
		pane.add(label);//面板上添加标签
		frame.setContentPane(pane);//画框设置内容面板是panel//等价于  frame.add(pane);
		//显示
		frame.setSize(300,200);
		frame.setResizable(false);
		frame.setVisible(true);//设置显示true
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口时退出程序
	}
}