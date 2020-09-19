package mainpack.drawoperation;

import mainpack.Drawable;

import java.awt.*;

public class BodyPrototype implements Drawable {
    private int x, y, w, h, n, k;
    private Color c,c1;

    @Override
    public void draw(Graphics2D g) {
        drawBodyP(g, x, y, w, h, n, k, c,c1);
    }

    public BodyPrototype(int x, int y, int w, int h, int n, int k, Color c, Color c1) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.n = n;
        this.k = k;
        this.c = c;
        this.c1 = c1;

    }

    private static void drawBodyP(Graphics2D g, int x, int y, int w, int h, int n, int k, Color c, Color c1) {
        g.setColor(new Color(160, 82, 30));
        g.fillOval(x - 40, y + 10, w / 2, h / 2); // бревно

        g.setColor(c);
        g.fillPolygon(new int[]{x, x - 50, x, x + w * (n - 2), x + w * (n - 2) + 50, x + w * (n - 2)}, new int[]{y, y + 50, y + 100, y + 100, y + 50, y}, k); // корпус
        g.fillRect(x + 25, y - 10, w * 3 / 4, h / 4 - 2); // дополнение корпуса

        g.setColor(new Color(25, 25, 25));
        g.fillRect(x, y, w, h / 2); // бак 1-ый
        g.fillRect(x + w + 25, y, w, h / 2); // бак 2-ой
        g.drawPolygon(new int[]{x, x - 50, x + w * (n - 2) + 50, x + w * (n - 2)}, new int[]{y, y + 50, y + 50, y}, k - 2); // обводка корпуса
        g.drawRect(x + 25, y - 10, w * 3 / 4, h / 4 - 2); // обводка дополнения

        g.setColor(c1);
        x = x - 50;
        y = y + 50;
        for (int i = 0; i < n; i++) {
            if (i != 0 && i != n - 1) {
                g.fillOval(x + i * w, y, w, h); // колёса внутренние
            } else {
                if (i == 0) {
                    g.fillOval(x + 25 + i * w, y, w / 2, h / 2); // 1-ое колесо
                } else {
                    g.fillOval(x + i * w, y, w / 2, h / 2); // последнее колесо
                }
            }
        }
    }
}
