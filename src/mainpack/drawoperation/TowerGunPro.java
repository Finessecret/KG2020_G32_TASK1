package mainpack.drawoperation;

import mainpack.Drawable;

import java.awt.*;

public class TowerGunPro implements Drawable {
    private int x, y, w, h;
    private Color c,c1;
    @Override
    public void draw(Graphics2D g) {
        drawTowerGunP(g, x, y, w, h,c,c1);
    }

    public TowerGunPro(int x, int y, int w, int h,Color c,Color c1) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.c = c;
        this.c1= c1;
    }

    private static void drawTowerGunP(Graphics2D g, int x, int y, int w, int h, Color c, Color c1) {
        g.setColor(new Color(90, 110, 50));
        g.fillRect(x + 10, y, w / 5, h / 3); // люк


        g.setColor(new Color(25, 25, 25));
        g.drawOval(x, y, w, h); // оводка башни

        g.setColor(c);
        g.fillRect(x + w - 10, y + 35, w * 2, h / 10); // ствол
        g.fillRect(x + w * 3 - 10, y + 30, w / 10, h / 5); // конец ствола
        g.fillOval(x, y, w, h); // башня
        g.fillRect(x + w / 5, y + h * 4 / 5, w * 3 / 5, h / 5); // основание башни

        g.setColor(c1);
        String str = "Bag With Gifts";
        char[] result = str.toCharArray();
        g.drawChars(result, 0, result.length, x + 25, y + 35);

    }

}
