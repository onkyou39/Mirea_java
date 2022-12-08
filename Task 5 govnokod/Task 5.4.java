import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.WindowConstants;


public class MyGif extends JFrame {

    private JLabel imgLabel;
    private int imgNum = 1; 

    public MyGif(){
        this.setSize(500, 370);
        imgLabel = new JLabel("", new ImageIcon(getClass().getResource("1.png")), SwingConstants.CENTER);

        getContentPane().add(imgLabel);

        Timer timer = new Timer(160, e -> nextImg());
        timer.start();
    }
    public void nextImg(){
        imgLabel.setIcon(new ImageIcon(getClass().getResource((++imgNum)+".png")));
        if(imgNum == 7)
            imgNum = 0;
    }

    public static void main(String[] args) {
        MyGif mg = new MyGif();
        mg.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mg.setVisible(true);
    }
}
