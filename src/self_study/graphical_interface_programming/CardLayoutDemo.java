package self_study.graphical_interface_programming;/*
 * Author: Jiansong Shen
 * Version: 1.0
 */

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutDemo {
    Frame f = new Frame("测试窗口");
    String[] names = { "第一张", "第二张", "第三张", "第四张", "第五张" };
    Panel p1 = new Panel(); //显示的面板

    public void init() {
        final CardLayout c = new CardLayout(); //卡片局部
        p1.setLayout(c); //面板布局使用卡片布局
        for (int i = 0; i < names.length; i++) {
            p1.add(names[i], new Button(names[i])); //设置面板的名字和组件
        }
        Panel p = new Panel(); //创建一个放按钮的面板

        // 控制显示上一张的按钮
        Button previous = new Button("上一张");
        //为按钮添加监听
        previous.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                c.previous(p1);
            }
        });

        // 控制显示下一张的按钮
        Button next = new Button("下一张");
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                c.next(p1);
            }
        });

        // 控制显示第一张的按钮
        Button first = new Button("第一张");
        first.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                c.first(p1);
            }
        });

        // 控制显示最后一张的按钮
        Button last = new Button("最后一张");
        last.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                c.last(p1);
            }
        });

        // 控制根据Card显示的按钮
        Button third = new Button("第三张");
        third.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                c.show(p1, "第三张");
            }
        });

        p.add(previous);
        p.add(next);
        p.add(first);
        p.add(last);
        p.add(third);
        f.add(p1);
        f.add(p, BorderLayout.SOUTH);

        f.pack(); //紧凑排列
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new CardLayoutDemo().init();
    }

}