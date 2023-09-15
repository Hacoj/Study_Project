package self_study.graphical_interface_programming;/*
 * Author: Jiansong Shen
 * Version: 1.0
 */

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridLayout_ {
    public static void main(String[] args) {

        Frame frame = new Frame();
        frame.setBounds(100,100,1080,720);
        frame.setLayout(new GridLayout(2,4,5,5));


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

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);

        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
