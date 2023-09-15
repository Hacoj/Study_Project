package self_study.graphical_interface_programming;
/*
 * Author: Jiansong Shen
 * Version: 1.0
 */

import javax.swing.*;
import java.awt.*;

public class TestMain extends JFrame {
    public static void main(String[] args) {
        TestMain testMain = new TestMain();

        testMain.setVisible(true);
    }

    TestMain (){
        this.setBounds(100,100,500,300);

        Panel p = new Panel();

        p.add(new TextField("TestText"));
        p.add(new Button("TestButton"));

        this.add(p);
    }
}
