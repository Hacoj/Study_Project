package self_study.graphical_interface_programming;/*
 * Author: Jiansong Shen
 * Version: 1.0
 */

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayout_ {
    public static void main(String[] args) {

        Frame frame = new Frame();
        frame.setBounds(100, 100, 400, 300);
        frame.setLayout(new BorderLayout());

        Button button1 = new Button("Button1");
        Button button2 = new Button("Button2");
        Button button3 = new Button("Button3");
        Button button4 = new Button("Button4");
        Button button5 = new Button("Button5");

        button1.setBackground(Color.BLUE);
        button2.setBackground(Color.CYAN);
        button3.setBackground(Color.RED);
        button4.setBackground(Color.GREEN);
        button5.setBackground(Color.PINK);

        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.EAST);
        frame.add(button3, BorderLayout.WEST);
        frame.add(button4, BorderLayout.SOUTH);
        frame.add(button5, BorderLayout.CENTER);

        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
