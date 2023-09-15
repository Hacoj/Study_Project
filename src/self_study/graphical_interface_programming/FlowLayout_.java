package self_study.graphical_interface_programming;/*
 * Author: Jiansong Shen
 * Version: 1.0
 */

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayout_ {
    public static void main(String[] args) {

        Frame frame = new Frame();
        frame.setBounds(100,100,400,300);
        frame.setLayout(new FlowLayout());

        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");
        Button button4 = new Button("button4");

        button1.setBackground(Color.BLUE);
        button2.setBackground(Color.red);
        button3.setBackground(Color.BLACK);
        button4.setBackground(Color.cyan);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);

        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
