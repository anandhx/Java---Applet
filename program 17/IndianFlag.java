import java.applet.Applet;
import java.awt.*;

public class IndianFlag extends Applet {
    public void paint(Graphics g) {
        // Set color to blue
        g.setColor(Color.blue);
g.fillRect(50,20,5,300);
g.setColor(Color.black);
g.drawRect(50,18,3,300);
g.setColor(Color.orange);
g.fillRect(55,20,120,30);
g.setColor(Color.black);
g.drawRect(55,20,118,28);
g.setColor(Color.green);
g.fillRect(55,80,119,30);
g.setColor(Color.black);
g.drawRect(55,80,117,28);
g.setColor(Color.black);
g.drawOval(100,50,30,30);
    }
}
