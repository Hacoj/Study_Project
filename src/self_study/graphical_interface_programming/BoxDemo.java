package self_study.graphical_interface_programming;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * Author: Jiansong Shen
 * Version: 1.0
 */public class BoxDemo {
    public static void main(String[] args) {
        Frame frame = new Frame();

        Box horBox = Box.createHorizontalBox();
        horBox.add(new Button("horizon button1"));
        horBox.add(Box.createHorizontalGlue());
        horBox.add(new Button("horizon button2"));
        horBox.add(Box.createHorizontalStrut(30));
        horBox.add(new Button("horizon button3"));

        Box verBox = Box.createVerticalBox();
        verBox.add(new Button("vertical button1"));
        verBox.add(Box.createVerticalGlue());
        verBox.add(new Button("vertical button1"));
        verBox.add(Box.createVerticalStrut(40));
        verBox.add(new Button("vertical button1"));

        frame.add(horBox, BorderLayout.NORTH);
        frame.add(verBox);
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
