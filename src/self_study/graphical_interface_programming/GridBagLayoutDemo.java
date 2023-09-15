package self_study.graphical_interface_programming;/*
 * Author: Jiansong Shen
 * Version: 1.0
 */

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class GridBagLayoutDemo {

    private Frame f = new Frame("GridBagLayout Test");
    private GridBagLayout gbl = new GridBagLayout();
    private GridBagConstraints gbc = new GridBagConstraints();

    private Button[] btns = new Button[10];

    private void addButton(Button btn) {
        gbl.setConstraints(btn, gbc);
        f.add(btn);
    }


    public void init() {
        for (int i = 0; i < 10; i++) { // 先初始化10个按钮
            btns[i] = new Button("button" + i);
        }
        f.setLayout(gbl); // 设定框架的布局模式

        //为了设置如果组件所在的区域比组件本身要大时的显示情况
        gbc.fill = GridBagConstraints.BOTH; // 使组件完全填满其显示区域
        //NONE：不调整组件大小。
        //HORIZONTAL：加宽组件，使它在水平方向上填满其显示区域，但是不改变高度。
        //VERTICAL：加高组件，使它在垂直方向上填满其显示区域，但是不改变宽度。
        //BOTH：使组件完全填满其显示区域。

        gbc.weighty = 1; // 该方法是设置组件水平所占用的格子数，如果为0，就说明该组件是该行的最后一个,为1则只占一格

        // 第1行的4个按钮
        gbc.weightx = 1; // 该方法设置组件水平的拉伸幅度，如果为0就说明不拉伸，不为0就随着窗口增大进行拉伸，0到1之间
        addButton(btns[0]);
        addButton(btns[1]);
        addButton(btns[2]);
        gbc.gridwidth = GridBagConstraints.REMAINDER; // 该组件是该行的最后一个，第4个添加后就要换行了
        addButton(btns[3]);

        // 第2行1个按钮，仍然保持REMAINDER换行状态
        addButton(btns[4]);

        //第3行
        gbc.gridwidth = 2; //按钮分别横跨2格
        gbc.weightx = 1;  //该方法设置组件水平的拉伸幅度
        addButton(btns[5]);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        addButton(btns[6]);

        // 按钮7纵跨2个格子，8、9一上一下
        gbc.gridheight = 2; //按钮7纵跨2格
        gbc.gridwidth = 1;  //横跨1格
        gbc.weightx = 1;    //该方法设置组件水平的拉伸幅度
        addButton(btns[7]); // 由于纵跨2格因此纵向伸缩比例不需要调整，默认为1*2格，比例刚好

        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.gridheight = 1;
        gbc.weightx = 1;
        addButton(btns[8]);
        addButton(btns[9]);

        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new GridBagLayoutDemo().init();
    }


}