package com.company.vis;

import com.company.balance.CellWeight;
import com.company.balance.PebbleWeight;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Piotr on 17.12.2015.
 */
public class BalanceFrame extends JDialog {

    JPanel panel;
    CellWeight cell;
    PebbleWeight[] pebbles;
    int cellWidth = 50;
    int offSet = 10;

    public BalanceFrame(CellWeight cell, PebbleWeight[] pebbles) {
        this.cell = cell;
        this.pebbles = pebbles;
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(800, 600));
        this.getContentPane().add(panel);
        this.setPreferredSize(new Dimension(800, 600));
        this.setMinimumSize(new Dimension(800, 600));
        this.validate();
        this.revalidate();
    }

    public void paint(Graphics superG) {

        super.paint(superG);

        if (panel != null) {
            Graphics g = panel.getGraphics();
            int yPos = 100;
            int xPos = 100;

            Color cellColor = Color.getHSBColor(hue, 1, 1);

            Rectangle r = new Rectangle(xPos, xPos, xPos + cellWidth, yPos + cellWidth);
            g.fillRect((int) r.getX(), (int) r.getY(), (int) r.getWidth(), (int) r.getHeight());

        }
    }

}
