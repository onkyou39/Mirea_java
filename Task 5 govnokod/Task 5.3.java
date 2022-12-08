import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

public class MyImage extends JComponent {

    static int imageWidth = 300, imageHeight = 300;
    int grid = 10;
    int imageX, imageY;
    Image image;

    public MyImage(Image i) {
        image = i;
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(image, imageX, imageY, this);
    }

    public static void main(String[] args) {
        String imageFile = "Enter_path";
        ImageIcon imageicon = new ImageIcon(imageFile);

        Image image = imageicon.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_DEFAULT);
        image = image.getScaledInstance(imageWidth, imageHeight, Image.SCALE_DEFAULT);

        JFrame frame = new JFrame("MyImage");
        frame.add(new MyImage(image));
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
