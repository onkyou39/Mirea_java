import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
abstract class Shapes {




}
class Star extends Shapes {

    int x, y;

    public Star(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        int xPoints[] = {9, 15, 0, 18, 3};
        int yPoints[] = {0, 18, 6, 6, 18};

        Graphics2D g2d = (Graphics2D) g;
        GeneralPath star = new GeneralPath();

        star.moveTo(xPoints[0] + x, yPoints[0] + y);
        for (int i = 1; i < xPoints.length; i++) {
            star.lineTo(xPoints[i] + x, yPoints[i] + y);
        }
        star.closePath();

        g2d.setColor(new Color((int) (Math.random() * 0x1000000)));
        g2d.fill(star);
    }
}
class Circle extends Shapes{

    int x, y;

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y, 10, 10);

        g2d.setColor(new Color((int) (Math.random() * 0x1000000)));
        g2d.fill(circle);
    }

}
public class DynamicShapes extends JPanel {

    private List shapes = new ArrayList<>();
    private Random random = new Random();

    public DynamicShapes(int i, String shape) {
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(400, 400));

        int mid = i / 2;
        for (int j = 0; j < mid; j++) {
            addCircle(390, 390);
        }
        for (int j = mid; j < i; j++) {
            addStar(380, 380);
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Object s : shapes) {
            if (s instanceof Circle) {
                ((Circle) s).draw(g);
            } else if (s instanceof Star) {
                ((Star) s).draw(g);
            }
        }
    }

    public void addCircle(int maxX, int maxY) {
        shapes.add(new Circle(random.nextInt(maxX), random.nextInt(maxY)));
        repaint();
    }

    public void addStar(int maxX, int maxY) {
        shapes.add(new Star(random.nextInt(maxX), random.nextInt(maxY)));
        repaint();
    }

    public static void main(String[] args) {

        int amount = 20;

        String shapes[] = {"Stars", "Circles"};
        String shape = shapes[0];
        JFrame frame = new JFrame();
        frame.add(new DynamicShapes(amount, shape));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
