import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Second {

    static class MyButton {
        JButton jButton;
        String name;
        JFrame jFrame;

        private void addButtons() {
            switch (name.charAt(0)) {
                case ('С'):
                    jFrame.add(jButton, BorderLayout.NORTH);
                    break;
                case ('В'):
                    jFrame.add(jButton, BorderLayout.EAST);
                    break;
                case ('Ю'):
                    jFrame.add(jButton, BorderLayout.SOUTH);
                    break;
                case ('З'):
                    jFrame.add(jButton, BorderLayout.WEST);
                    break;
                case ('Ц'):
                    jFrame.add(jButton, BorderLayout.CENTER);
                    break;

            }
        }

        MyButton(JFrame jFrame, String name, JButton jButton) {
            this.name = name;
            this.jButton = jButton;
            this.jFrame = jFrame;

            jButton.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    JOptionPane.showMessageDialog(jFrame, "Добро пожаловать в " + name + " !");
                }
            });

            this.addButtons();
        }
    }

    static JFrame getDefaultFrame() {
        JFrame jFrame = new JFrame();
        Dimension dim = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        jFrame.setBounds(dim.width / 3, dim.height / 3, dim.width / 3, dim.height / 3);
        jFrame.setTitle("Макет границы");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        return jFrame;
    }

    public static void main(String[] args) {
        JFrame jFrame = getDefaultFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        MyButton[] myButtons = new MyButton[]{new MyButton(jFrame, "САО", new JButton("САО")),
                new MyButton(jFrame, "ВАО", new JButton("ВАО")),
                new MyButton(jFrame, "ЮАО", new JButton("ЮАО")),
                new MyButton(jFrame, "ЗАО", new JButton("ЗАО")),
                new MyButton(jFrame, "ЦАО", new JButton("ЦАО"))
        };

        jFrame.setVisible(true);

    }
}
