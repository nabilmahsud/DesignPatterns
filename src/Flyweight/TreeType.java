package Flyweight;

import java.awt.*;

public class TreeType {
    private String name;
    private Color color;
    private String otherTreeData;
    private TreeSize treeSize;

    public TreeType(String name, Color color, String otherTreeData, TreeSize treeSize) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
        this.treeSize = treeSize;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        if (treeSize == TreeSize.LARGE)
            g.fillOval(x - 5, y - 10, 20, 20);
        else if (treeSize == TreeSize.MEDIUM)
            g.fillOval(x - 5, y - 10, 15, 15);
        else if (treeSize == TreeSize.SMALL)
            g.fillOval(x - 5, y - 10, 10, 10);
    }
}