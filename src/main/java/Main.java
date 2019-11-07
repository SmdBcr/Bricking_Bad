import org.apache.log4j.Logger;
import ui.GamePanel;
import ui.LoginForm;

public class Main {

    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("The game is running");

        LoginForm loginForm =new LoginForm();
//        gamePanel.setSize(100,100);
//        gamePanel.setVisible(true);
        loginForm.setVisible(true);

    }
}