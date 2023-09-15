package self_study.graphical_interface_programming;/*
 * Author: Jiansong Shen
 * Version: 1.0
 */

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridBagLayout_ {

    private Frame frame = new Frame("GridBagLayoutTest");
    private GridBagLayout gridBagLayout = new GridBagLayout();
    private GridBagConstraints gridBagConstraints = new GridBagConstraints();

    private Button[] buttons = new Button[10];

    private void addButton(Button button){
        gridBagLayout.setConstraints(button,gridBagConstraints);
        frame.add(button);
    }

    public void init(){
        for(int i = 0; i < 10; i++){
            buttons[i] = new Button("button" + i);
        }
        //设定布局格式
        frame.setLayout(gridBagLayout);
        frame.setBounds(100,100,500,400);

        gridBagConstraints.fill = GridBagConstraints.BOTH; // 使组件完全填满其显示区域
        //NONE：不调整组件大小。
        //HORIZONTAL：加宽组件，使它在水平方向上填满其显示区域，但是不改变高度。
        //VERTICAL：加高组件，使它在垂直方向上填满其显示区域，但是不改变宽度。
        //BOTH：使组件完全填满其显示区域。

        gridBagConstraints.weighty = 1; // 该方法是设置组件水平所占用的格子数，如果为0，就说明该组件是该行的最后一个,为1则只占一格
        // 第1行的4个按钮
        gridBagConstraints.weightx = 1; // 该方法设置组件水平的拉伸幅度，如果为0就说明不拉伸，不为0就随着窗口增大进行拉伸，0到1之间
        addButton(buttons[0]);
        addButton(buttons[1]);
        addButton(buttons[2]);
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER; // 该组件是该行的最后一个，第4个添加后就要换行了
        addButton(buttons[3]);

        // 第2行1个按钮，仍然保持REMAINDER换行状态
        addButton(buttons[4]);

        //第3行
        gridBagConstraints.gridwidth = 2; //按钮分别横跨2格
        gridBagConstraints.weightx = 1;  //该方法设置组件水平的拉伸幅度
        addButton(buttons[5]);
        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        addButton(buttons[6]);

        // 按钮7纵跨2个格子，8、9一上一下
        gridBagConstraints.gridheight = 2; //按钮7纵跨2格
        gridBagConstraints.gridwidth = 1;  //横跨1格
        gridBagConstraints.weightx = 2;    //该方法设置组件水平的拉伸幅度
        addButton(buttons[7]); // 由于纵跨2格因此纵向伸缩比例不需要调整，默认为1*2格，比例刚好

        gridBagConstraints.gridwidth = GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 2;
        addButton(buttons[8]);
        addButton(buttons[9]);

        //frame.pack();
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }


    public static void main(String[] args) {
        new GridBagLayout_().init();
    }
}
