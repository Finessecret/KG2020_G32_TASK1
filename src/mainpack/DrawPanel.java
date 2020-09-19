package mainpack;


import mainpack.drawoperation.*;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private Landscape ls = new Landscape(1800,400,new Color(135, 255, 235),new Color(255, 222, 173));

    private BodyTank b1 = new BodyTank(200,300,50,50,6,6,new Color(128, 128, 0),new Color(90, 110, 50));
    private BodyPrototype b2 = new BodyPrototype(700,350,50,50,7,6,new Color(128, 128, 0),new Color(50,50,50));

    private TowerGun tg1 = new TowerGun(325,270,150,100,4,new Color(128, 128, 0),new Color(0,0,0));
    private TowerGunPro tg2 = new TowerGunPro(825,275,125,75,new Color(128, 128, 0),new Color(0,0,0));

    /* первый цвет корпуса - основной цвет корпуса
    второй цвет - цвет колёс
    Первый цвет башни - основной цвет башни
    второй цвет - цвет надписи
     */

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;

        ls.draw(gr);
        b1.draw(gr); tg1.draw(gr);
        b2.draw(gr); tg2.draw(gr);

    }
}