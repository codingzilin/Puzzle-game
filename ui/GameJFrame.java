package ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.util.Random;

public class GameJFrame extends JFrame {
    //the logic related to game in this class
    //创建二维数组
    //管理数据，并根据二维数组的数据进行加载图片
    int[][] data = new int[4][4];
    public GameJFrame(){
        //初始化界面
        initJFrame();


        //initialize menu
        initJMenuBar();

        //初始化数据(打乱)
        initData();

        //初始化图片(根据打乱之后的结果去加载图片)
        initImage();

        //display
        this.setVisible(true);
    }
    //初始化数据（打乱）
    private void initData() {
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                data[i][j] = tempArr[index];
                index++;
            }
        }

    }

    //初始化图片
    //添加图片时需按照二维数组的数据添加图片
    private void initImage() {
        //细节：
        //先加载的图片在上方，后加载的图片在下面
        //外循环：重复四次内循环

        for (int i = 0; i < 4; i++) {
            //内循环：在一行中添加四张图片
            for (int j = 0; j < 4; j++) {
                //获取当前要加载图片的序号
                //通过二维数组获得每个图片的序号
                int num = data[i][j];
                //create ImageIcon object
                ImageIcon icon = new ImageIcon("/Users/harrysong/IdeaProjects/阶段综合项目_puzzlegame/image/animal/animal3/" + num + ".jpg");
                //create JLabel object(管理容器)
                JLabel jLabel = new JLabel(icon);
                //指定图片位置
                jLabel.setBounds(105 * j + 83,105 * i + 134,105,105);
                //给图片添加边框
                //0表示图片凸起来
                //1表示图片凹下去
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                //把管理容器添加到界面中
                //this.add(jLabel);
                this.getContentPane().add(jLabel);
                //添加一次之后number需要自增，表示下一次加载后面一张
                System.out.println(num);
            }
        }
        //添加背景图片
        JLabel background = new JLabel(new ImageIcon("/Users/harrysong/IdeaProjects/阶段综合项目_puzzlegame/image/background.png"));
        background.setBounds(40,40,508,560);
        //把背景图片添加到界面中
        this.getContentPane().add(background);


    }

    private void initJMenuBar() {
        //create menu object
        JMenuBar jMenuBar = new JMenuBar();
        //create two option object(function and about us)
        JMenu functionJMenu = new JMenu("Function");
        JMenu aboutJMenu = new JMenu("About Us");
        //create menu items
        JMenuItem replayItem = new JMenuItem("Restart");
        JMenuItem reLoginItem = new JMenuItem("Re-login");
        JMenuItem closeItem = new JMenuItem("Close");
        JMenuItem accountItem = new JMenuItem("Contact Us");

        //add items to menu options
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //add two options into menubar
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单⚠️
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //构造方法
        //set width and height
        this.setSize(600,660);
        //set title
        this.setTitle("Puzzle Game v1.0");
        //set always on top
        this.setAlwaysOnTop(true);
        //set frame in middle
        this.setLocationRelativeTo(null);
        //set close model
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认的居中放置，才能按照XY轴形式添加组件
        this.setLayout(null);
    }
}
