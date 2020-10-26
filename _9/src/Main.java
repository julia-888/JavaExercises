import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.Random;


class RandomShapeFactory {
    static Random r = new Random();

    static Shape getRandomShape() {
        int shapeNumber = r.nextInt(3);
        if (shapeNumber == 1) {
            return new Rectangle(r.nextInt(1000), r.nextInt(600), r.nextInt(70), r.nextInt(100));
        } else if (shapeNumber == 2) {
            int radius = r.nextInt(1000);
            return new Ellipse2D.Double(r.nextInt(1000), r.nextInt(600), radius, radius);
        } else {
            int side = r.nextInt(700);
            return new Rectangle(r.nextInt(1000), r.nextInt(600), side, side);
        }
    }
}

class ShapeComponent extends JComponent {
    ArrayList<Shape> shapes = new ArrayList<>();

    ShapeComponent(Graphics g) {
        for (int i = 0; i < 20; i++) {
            shapes.add(RandomShapeFactory.getRandomShape());
        }
        this.paintComponent(g);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Random rand = new Random();
        int c = rand.nextInt(4);
        Graphics2D g2d = (Graphics2D) g;

        for (Shape s : shapes) {
            float red = rand.nextFloat();
            float green = rand.nextFloat();
            float blue = rand.nextFloat();
            Color randomColor = new Color(red, green, blue);
            g2d.setColor(randomColor);
            g2d.fill(s);
        }
    }
}


public class Main extends JPanel{
    public static void main(String[] args) {
        JFrame jFrame = getDefaultFrame();
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.WHITE);
        JButton jButton = new JButton("generate!");

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.add(new ShapeComponent(jPanel.getGraphics()));
            }
        });

        jPanel.add(jButton);
        jFrame.add(jPanel);
        jFrame.setVisible(true);

    }

    static JFrame getDefaultFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setTitle("Shapes");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        jFrame.setBounds(toolkit.getScreenSize().width / 4, toolkit.getScreenSize().height / 4, 1000, 600);
        return jFrame;
    }
}

/*
public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }

}

class MyComponent extends JComponent {
    MyComponent(Graphics g) {
        this.paintComponent(g);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Random rand = new Random();
        Graphics2D g2d = (Graphics2D) g;

        float red = rand.nextFloat();
        float green = rand.nextFloat();
        float blue = rand.nextFloat();
        Color randomColor = new Color(red, green, blue);
        g2d.setColor(randomColor);

        int numberOfShape = rand.nextInt(3);
        if (numberOfShape == 1) {
            g2d.fill(new Rectangle(rand.nextInt(1000), rand.nextInt(600), rand.nextInt(70), rand.nextInt(100)));
        } else if (numberOfShape == 2) {
            int radius = rand.nextInt(200);
            g2d.fill(new Ellipse2D.Double(rand.nextInt(1000), rand.nextInt(600), radius, radius));
        } else {
            int side = rand.nextInt(70);
            g2d.fill(new Rectangle(rand.nextInt(1000), rand.nextInt(600), side, side));
        }

    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("generate!");
        jPanel.setBackground(Color.WHITE);

        jFrame.add(jPanel);
        jPanel.add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.add(new MyComponent(jPanel.getGraphics()));
            }
        });
    }

    public JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        Dimension dim = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        jFrame.setBounds(dim.width / 4, dim.height / 4, dim.width / 2, dim.height / 2);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setTitle("Приложение");

        jFrame.setVisible(true);
        return jFrame;
    }
}

 */