package mainpack.drawoperation;

import mainpack.Drawable;

import java.awt.*;

public class BodyTank implements Drawable {
    private int x, y, w, h, n, k;
    private Color c,c1;

    @Override
    public void draw(Graphics2D g) {
        drawBody(g, x, y, w, h, n, k, c,c1);
    }

    public BodyTank(int x, int y, int w, int h, int n, int k, Color c,Color c1) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.n = n;
        this.k = k;
        this.c = c;
        this.c1 = c1;

    }

    private static void drawBody(Graphics2D g, int x, int y, int w, int h, int n, int k,Color c,Color c1) {
        g.setColor(new Color(160, 82, 30));
        g.fillOval(x - 4, y + 28, 16, 16); // бревно

        g.setColor(c);
        g.fillPolygon(new int[]{x, x, x + 75, x + 100 + w * (n - 2), x + 200 + w * (n - 2), x + 100 + w * (n - 2)}, new int[]{y + 10, y + 25, y + 75, y + 75, y + 50, y + 10}, k); // корпус

        g.setColor(new Color(25, 25, 25));
        g.fillOval(x - 30, y - 20, 35, 35); // бак
        g.fillRect(x, y + 5, 10, 5); // бак
        g.fillRect(x + 350, y + 15, 5, 10); // основание фары
        g.drawPolygon(new int[]{x + 25, x, x + 100, x + 100 + w * (n - 2), x + 225 + w * (n - 2), x + 175 + w * (n - 2)}, new int[]{y + h / 2, y + h, y + 2 * h, y + 2 * h, y + h, y + h / 2}, k); // обводка гусениц

        g.setColor(c1);
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                g.fillOval(x + (i + 1) * w, y + 35, w, h); // первое и последнее колёса
            } else {
                g.fillOval(x + (i + 1) * w, y + 50, w, h); // колёса внутренние
            }
        }
        g.fillArc(x + 353, y + 15, 10, 8, 90, 180); // типо фара

        g.setColor(new Color(0, 80, 40));
        g.fillPolygon(new int[]{x + 25, x, x + 225 + w * (n - 2), x + 175 + w * (n - 2)}, new int[]{y + 25, y + 50, y + 50, y + 25}, k - 2); // рама над гусеницами
    }

}
