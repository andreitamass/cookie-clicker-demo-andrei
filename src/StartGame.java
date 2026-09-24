package src;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Label;
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

        JPanel Panel = new JPanel();

        JButton cookieButton = new JButton("Click!");

        Label lb = new Label();

        Panel.add(cookieButton);

        add(Panel, BorderLayout.SOUTH);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //When pressed add a cookie
        cookieButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cookies++;
                System.out.println(cookies);
            }
        });
        
    }
    
    public static void main(String[] args) {
        //Starts the game
        new StartGame();
    }

}