import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="Signals" width="400" height="250"></applet>*/

public class Signals extends Applet implements ItemListener {
    String msg = "";
    CheckboxGroup cbg;
    Checkbox stop, ready, go;

    public void init() {
        cbg = new CheckboxGroup();
        stop = new Checkbox("Stop", cbg, false);
        ready = new Checkbox("Ready", cbg, false);
        go = new Checkbox("Go", cbg, false);

        add(stop);
        add(ready);
        add(go);

        stop.addItemListener(this);
        ready.addItemListener(this);
        go.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        repaint();
    }

    public void paint(Graphics g) {
        msg = "Signal: ";
        Checkbox currentCheckbox = cbg.getSelectedCheckbox();

        if (currentCheckbox == stop) {
            msg += "Stop";
            g.setColor(Color.red);
            g.fillOval(165, 40, 50, 50);
            g.setColor(Color.gray);
            g.fillOval(165, 100, 50, 50);
            g.fillOval(165, 160, 50, 50);
        } else if (currentCheckbox == ready) {
            msg += "Ready";
            g.setColor(Color.gray);
            g.fillOval(165, 40, 50, 50);
            g.setColor(Color.yellow);
            g.fillOval(165, 100, 50, 50);
            g.setColor(Color.gray);
            g.fillOval(165, 160, 50, 50);
        } else if (currentCheckbox == go) {
            msg += "Go";
            g.setColor(Color.gray);
            g.fillOval(165, 40, 50, 50);
            g.fillOval(165, 100, 50, 50);
            g.setColor(Color.green);
            g.fillOval(165, 160, 50, 50);
        }

        g.setColor(Color.black);
        g.drawOval(165, 40, 50, 50);
        g.drawOval(165, 100, 50, 50);
        g.drawOval(165, 160, 50, 50);

        g.drawString(msg, 20, 200);
    }
}
