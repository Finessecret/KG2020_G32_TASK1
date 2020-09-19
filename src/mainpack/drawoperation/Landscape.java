package mainpack.drawoperation;

import mainpack.Drawable;

import java.awt.*;

public class Landscape implements Drawable {

    private int w, h;
    private Color c, c1;

    @Override
    public void draw(Graphics2D g) {

        drawSkyEarth(g, w, h, c, c1);
    }

    public Landscape(int w, int h, Color c, Color c1) {
        this.w = w;
        this.h = h;
        this.c = c;
        this.c1 = c1;
    }

    private static void drawSkyEarth(Graphics2D g, int w, int h,Color c,Color c1) {
        g.setColor(c);
        g.fillRect(0, 0, w, h * 2);
        g.setColor(c1);
        g.fillRect(0, 325, w, h);
    }
}
