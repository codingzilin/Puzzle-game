import ui.GameJFrame;
import ui.LoginJFrame;
import ui.RegisterJFrame;

public class App {
    public static void main(String[] args) {
        //Start Entrance for app
        //Create object for frame，匿名对象：当对象对方法只进行一次调用时可以简化为匿名对象
        new LoginJFrame();
        new RegisterJFrame();
        new GameJFrame();

    }
}
