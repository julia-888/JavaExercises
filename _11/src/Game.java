import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game {
    static int number = new Random().nextInt(20);
    static int tries = 0;

    static JFrame getFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Игра-угадайка");
        Dimension dim = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        jFrame.setBounds(dim.width / 4, dim.height / 4, dim.width / 2, dim.height / 2);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        return jFrame;
    }

    static JDialog getDialog() {
        JDialog jDialog = new JDialog();
        Dimension dim = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        jDialog.setBounds(dim.width / 2 - 150, dim.height / 2 - 150, 200, 100);
        return jDialog;
    }

    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.WHITE);
        Label label = new Label("Угадайте число от 0 до 20");
        TextField textField = new TextField(20);
        JButton jButton = new JButton("угадать!");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tries == 3) {
                    JOptionPane.showMessageDialog(jPanel, "Попытки закончились!");
                    System.exit(0);
                } else {
                    int input = Integer.parseInt(textField.getText());

                    if (input == number) {
                        JOptionPane.showMessageDialog(jPanel, "Угадали!");
                        System.exit(0);
                    } else if (input < number) {
                        JOptionPane.showMessageDialog(jPanel, "Загаданное число больше!");
                    } else {
                        JOptionPane.showMessageDialog(jPanel, "Загаданное число меньше!");
                    }

                    tries++;
                }

            }
        });

        jPanel.add(label);
        jPanel.add(textField);
        jPanel.add(jButton);
        jFrame.add(jPanel);
    }

}
