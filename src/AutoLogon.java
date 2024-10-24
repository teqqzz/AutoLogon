import javax.swing.JOptionPane;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.awt.event.InputEvent;

public class AutoLogon {
    private static final String CHROME_PATH = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
    private static final String URL = "https://tasy.curagrupo.com.br/#/login";
    private static final int WAIT_TIME = 20000;

    public static void main(String[] args) {
        try {
            String userName = System.getProperty("user.name");
            String userDataDir = "C:\\Users\\" + userName + "\\AppData\\Local\\Google\\Chrome\\User Data";
            startChromeWithProfile(userDataDir);
            performAutoLogin();
        } catch (IOException e) {
            showError("Erro ao iniciar o Chrome.", e);
        } catch (InterruptedException | java.awt.AWTException e) {
            showError("Erro durante o processo de login.", e);
        }
    }

    private static void startChromeWithProfile(String userDataDir) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder(CHROME_PATH, "--user-data-dir=" + userDataDir, URL);
        processBuilder.start();
    }

    private static void performAutoLogin() throws InterruptedException, java.awt.AWTException {
        Robot robot = new Robot();
        Thread.sleep(WAIT_TIME);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_F11);
        robot.keyRelease(KeyEvent.VK_F11);
        robot.mouseMove(920, 730); 
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); 

        
    }

    private static void showError(String message, Exception e) {
        JOptionPane.showMessageDialog(null, message, "Erro", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
}