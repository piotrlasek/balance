package com.company.vis;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Piotr on 17.12.2015.
 */
public class BalanceFrame extends JDialog {


    public void paint(Graphics g) {
        Rectangle r = new Rectangle(10, 10, 100, 100);
        g.fillRect(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

}
