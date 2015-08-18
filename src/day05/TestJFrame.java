package day05;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
//利用Swing的工具类可以获得当前系统的屏幕显示大小属性. 
//返回值是Dimension类型对象screen, 包含两个屏幕大小属性width, height
public class TestJFrame {
	public static void main(String[] args) {
		testSizeAndLocation();
//根据屏幕和窗口的大小计算并且设置窗口的位置, 实现窗口的居中显示
		testSizeAndCenter();

	}
    public static void testSizeAndLocation() {
        JFrame frame = new JFrame();
        frame.setSize(500, 600);
        frame.setTitle("TestFrame");
        frame.setLocation(100, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void testSizeAndCenter() {
        JFrame frame = new JFrame();
        frame.setSize(500, 600);
        frame.setTitle("TestFrame");
        Dimension screen =
Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((screen.width - frame.getWidth()) / 2,
                (screen.height - frame.getHeight()) / 2);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}