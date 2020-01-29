package main;

import model.SierpinskiCarpet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;



public class SierpinskiMain extends JPanel {


    protected final int dimension = 600;
    protected final int margin = 20;
    protected int limit = dimension;


    public SierpinskiMain() {
        setPreferredSize(new Dimension(dimension + 2 * margin, dimension + 2 * margin));
        setBackground(Color.BLACK);
        setForeground(Color.WHITE);

        new Timer(1000, (ActionEvent e) -> {
            limit /= 2;
            if (limit <= 1)
                limit = dimension;
            repaint();
        }).start();
    }

    public static void main(String[] args) {
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setTitle("Sierpinski's carpet");
            f.setResizable(false);
            f.add(new SierpinskiCarpet(), BorderLayout.CENTER);
            f.pack();
            f.setLocationRelativeTo(null);
            f.setVisible(true);
    }

}
