package src;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class StartGame extends JFrame {

    int cookies = 0;

    //Constructor
    public StartGame() {
        setTitle("Cookie Window");
        setSize(500, 500);

        JPanel panel = new JPanel();

        JButton cookieButton = new JButton("Click!");

        JLabel lb = new JLabel("Cookies: ");
        //Makes text horizontal
        lb.setHorizontalAlignment(JLabel.CENTER);

        add(lb, BorderLayout.CENTER);

        panel.add(cookieButton);

        add(panel, BorderLayout.SOUTH);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //When pressed add a cookie
        cookieButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cookies++;
                lb.setText("Cookies: " + cookies);
            }
        });
        
    }
    
    public static void main(String[] args) {
        //Starts the game
        new StartGame();
    }

}