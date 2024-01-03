import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class House extends Applet {

    public void paint(Graphics page) {
        Polygon poly = new Polygon();
        poly.addPoint(50, 90);
        poly.addPoint(150, 50);
        poly.addPoint(250, 90);

        page.setColor(Color.blue); // Set color to blue
        page.fillPolygon(poly);

        page.setColor(Color.black);
        page.drawLine(50, 90, 150, 50);
        page.drawLine(150, 50, 250, 90);

        page.setColor(Color.yellow);
        page.fillRect(50, 90, 200, 100);

        page.setColor(Color.black);
        page.drawRect(50, 90, 200, 100);

        page.setColor(Color.black);
        page.fillRect(75, 110, 30, 25);
        page.fillRect(180, 110, 30, 25);

        page.setColor(Color.blue); // Set color to blue
        page.drawLine(80, 115, 80, 140);
        page.drawLine(80, 140, 120, 140);
        page.drawLine(120, 140, 120, 115);

        page.drawLine(90, 115, 90, 130);
        page.drawLine(90, 130, 110, 130);
        page.drawLine(110, 130, 110, 115);

        page.setColor(Color.blue); // Set color to blue
        page.fillOval(130, 150, 35, 40);

        page.setColor(Color.red);
        page.fillOval(155, 170, 4, 4);
    }
}
