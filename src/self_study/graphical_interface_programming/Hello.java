package self_study.graphical_interface_programming;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Author: Jiansong Shen
 * Version: 1.0
 */
public class Hello {
    public static void main(String[] args) {
        Frame frame = new Frame("TestListener");
        frame.setSize(1000,700);

        Button b = new Button("yes");
        b.setFont(new Font("宋体",Font.BOLD,20));

        TextField tf = new TextField(30);
        tf.setFont(new Font("宋体",Font.BOLD,20));

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Hello");
            }
        });

        frame.add(tf,BorderLayout.NORTH);
        frame.add(b);
        frame.pack();
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
