// Swing中使用匿名内部类

package com.learnjava.innerclass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingTest
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("JFrame");
        JButton button = new JButton("JButton");

        button.addActionListener(new ActionListener()
        {
            // new出来一个实现了ActionListener接口的类的实例

            @Override
            public void actionPerformed(ActionEvent arg0)
            {
                System.out.println("Hello World");

            }
        });

        //加入按钮
        frame.getContentPane().add(button);

        //设置关闭行为
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(200, 200);
        
        frame.addWindowListener(new WindowAdapter()
        {
            //也可以使用继承了适配器类的匿名内部类
            @Override
            public void windowClosing(WindowEvent e)
            {
            
                System.out.println("Closing");
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }

}