package src;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class StartGame extends JFrame {

    public StartGame() {
        setTitle("Cookie Window");
        setSize(500, 500);

        JButton cookieButton = new JButton("Click!");
        JPanel cookiePanel = new JPanel();

        cookiePanel.add(cookieButton);

        this.getContentPane().add(cookiePanel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        

    }


    public static void main(String[] args) {
        StartGame start = new StartGame();
    }

}