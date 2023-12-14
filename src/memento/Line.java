/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.awt.*;

public class Line extends BaseShape {
    private int x2, y2;

    public Line(int x1, int y1, int x2, int y2, Color color) {
        super(x1, y1, color);
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public int getWidth() {
        return Math.abs(x2 - getX());
    }

    @Override
    public int getHeight() {
        return Math.abs(y2 - getY());
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawLine(getX(), getY(), x2, y2);
    }
}