import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI {
    static JFrame getFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Сила притяжения на планете");
        Dimension dim = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        jFrame.setBounds(dim.width * 3 / 8, dim.height / 4, dim.width / 4, dim.height / 5);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        return jFrame;
    }

    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.WHITE);
        jFrame.add(jPanel);
        jPanel.add(new Label("Выберите в меню планету, силу притяжения на которой хотите узнать\n"));

        JMenuItem MERCURY = new JMenuItem("Меркурий");
        JMenuItem VENUS = new JMenuItem("Венера");
        JMenuItem EARTH = new JMenuItem("Земля");
        JMenuItem MARS = new JMenuItem("Марс");
        JMenuItem JOVIAN = new JMenuItem("Юпитер");
        JMenuItem SATURN = new JMenuItem("Сатурн");
        JMenuItem URANIUM = new JMenuItem("Уран");
        JMenuItem NEPTUNIUM = new JMenuItem("Нептун");

        MERCURY.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jPanel, "Сила притяжения на Меркурии равна " + Planet.MERCURY.getGravitation());
            }
        });
        VENUS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jPanel, "Сила притяжения на Венере равна " + Planet.VENUS.getGravitation());
            }
        });
        EARTH.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jPanel, "Сила притяжения на Земле равна " + Planet.EARTH.getGravitation());
            }
        });
        MARS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jPanel, "Сила притяжения на Марсе равна " + Planet.MARS.getGravitation());
            }
        });
        JOVIAN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jPanel, "Сила притяжения на Юпитере равна " + Planet.JOVIAN.getGravitation());
            }
        });
        SATURN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jPanel, "Сила притяжения на Сатурне равна " + Planet.SATURN.getGravitation());
            }
        });
        URANIUM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jPanel, "Сила притяжения на Уране равна " + Planet.URANIUM.getGravitation());
            }
        });
        NEPTUNIUM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jPanel, "Сила притяжения на Нептуне равна " + Planet.NEPTUNIUM.getGravitation());
            }
        });


        JMenu menu = new JMenu("Планеты");
        menu.add(MERCURY);
        menu.add(VENUS);
        menu.add(EARTH);
        menu.add(MARS);
        menu.add(JOVIAN);
        menu.add(SATURN);
        menu.add(URANIUM);
        menu.add(NEPTUNIUM);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        jFrame.setJMenuBar(menuBar);
    }

}
