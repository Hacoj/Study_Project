package self_study.graphical_interface_programming;/*
 * Author: Jiansong Shen
 * Version: 1.0
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.CancellationException;

public class CardLayout_ {

    Frame frame = new Frame("test");
    Panel panel = new Panel();
    String[] names = {"first", "second", "third", "fourth",
            "fifth", "sixth", "seventh"};

    public void init(){
        final CardLayout cardLayout = new CardLayout();
        panel.setLayout(cardLayout);

        frame.setBounds(100, 100, 400, 300);

        for(int i =0;i < names.length; i++){
            panel.add(names[i],new Button(names[i]));
        }

        Panel panel_ = new Panel();
        Button previous = new Button("previous");
        previous.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.previous(panel);
            }
        });

        Button next = new Button("next");
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(panel);
            }
        });

        Button first = new Button("first");
        first.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.first(panel);
            }
        });

        Button last = new Button("last");
        last.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.last(panel);
            }
        });

        Button thirdButton = new Button("third");
        thirdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panel, "third");
            }
        });



        panel_.add(previous);
        panel_.add(next);
        panel_.add(first);
        panel_.add(last);
        panel_.add(thirdButton);

        frame.add(panel);
        frame.add(panel_,BorderLayout.SOUTH);

        frame.pack();
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setVisible(true);    }
    public static void main(String[] args) {
        new CardLayout_().init();
    }
}
