package mainpack.drawoperation;

import mainpack.Drawable;

import java.awt.*;

public class TowerGun implements Drawable {

    private int x, y, w, h, k;
    private Color c,c1;

    @Override
    public void draw(Graphics2D g) {
        drawTowerGun(g, x, y, w, h, k, c,c1);
    }

    public TowerGun(int x, int y, int w, int h, int k, Color c,Color c1) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.k = k;
        this.c = c;
        this.c1 = c1;
    }

    private static void drawTowerGun(Graphics2D g, int x, int y, int w, int h, int k, Color c, Color c1) {
        g.setColor(new Color(90, 110, 50));
        g.fillRect(x + 25, y, w / 5 - 5, h / 5); // люк

        g.setColor(c);
        g.fillArc(x, y, w, h, 0, 180); // башня
        g.fillPolygon(new int[]{x + w - 30, x + w + 20, x + w + 20, x + w - 10}, new int[]{y + 12, y + 20, y + 28, y + 33}, k); // основание ствола
        g.fillRect(x + w - 20, y + 20, w + 75, h / 10 - 2); // ствол
        g.fillOval(x + w * 2 + 20, y + 16, w / 5, h / 10 + 6); // расширение ствола

        g.setColor(c1);
        String str = "Iron Fist";
        char[] result = str.toCharArray();
        g.drawChars(result, 0, result.length, x + 50, y + 25);

    }
}
