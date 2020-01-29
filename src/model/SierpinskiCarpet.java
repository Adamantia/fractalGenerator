package model;

import main.SierpinskiMain;

import java.awt.*;


public class SierpinskiCarpet extends SierpinskiMain implements Fractal {


    void drawCarpet(Graphics2D g, int x, int y, int size)
    {
        if (size < limit)
            return;
        size /= 3;
        for (int i = 0; i < 9; i++)
        {
            if (i == 4)
            {

                g.fillRect(x + size, y + size, size, size);
            } else {
                // recursive call
                drawCarpet(g, x + (i % 3) * size, y +(i /3) * size, size);
            }
        }
    }


    @Override
    public void paintComponent(Graphics gg)
    {
        super.paintComponent(gg);
        Graphics2D g = (Graphics2D) gg;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.translate(margin, margin);
        drawCarpet(g, 0, 0, dimension);
    }
}