import java.applet.Applet;
import java.awt.*;

public class Shapes extends Applet {
    public void paint(Graphics g) {
        /* Cylinder */
        g.drawString("(a) Cylinder", 10, 10);
        g.drawOval(10, 90, 50, 10);
        g.drawOval(10, 80, 50, 10);
        g.drawLine(10, 15, 10, 85);
        g.drawLine(60, 15, 60, 85);

        /* Cube */
        g.drawString("(b) Cube", 95, 110);
        g.drawRect(80, 10, 50, 50);
        g.drawRect(95, 25, 50, 50);
        g.drawLine(130, 10, 145, 25);
        g.drawLine(80, 60, 145, 75);
        g.drawLine(130, 60, 145, 75);

        /* Squares Inside a Circle */
        g.drawString("Square inside a circle", 150, 110);
        g.drawOval(180, 10, 80, 80);
        g.drawRect(192, 22, 55, 55);

        /* Circle Inside a Square */
        g.drawString("Circle inside a Square", 250, 110);
        g.drawRect(280, 10, 80, 80);
        g.drawOval(240, 10, 80, 80);

        /* Polygon */
        g.drawString("(c) Polygon", 90, 250);
        int[] xPoints = {200, 400, 200, 400};
        int[] yPoints = {200, 200, 500, 500};
        g.drawPolygon(xPoints, yPoints, 4);
    }
}
