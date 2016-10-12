import java.awt.Color;
import uwcse.graphics.*;

/**
 * A sailboat in a graphics window
 */

public class SailBoat {

    // The graphics window the boat belongs to
    private GWindow window;

    // The location of the boat
    private int x;

    private int y;

    // Scale of the drawing of the boat
    private double scale;

    /**
     * Draws a sailboat in a graphics window
     *
     * @param x
     *            the x coordinate of the location of the boat
     * @param y
     *            the y coordinate of the location of the boat
     * @param window
     *            the graphics window where the boat is displayed
     * @param window
     *            the graphics window the boat belongs to
     */
    public SailBoat(int x, int y, double scale, GWindow window) {
        // Initialize the instance fields
        this.x = x;
        this.y = y;
        this.window = window;
        this.scale = scale;

        // Draw the boat
        this.draw();
    }

    /**
     * Draws this sailboat
     */
    private void draw() {
        Polygon boat = new Polygon();

        int boatSize = (int) (this.scale);

        boat.addPoint(x, y);
        boat.addPoint(x + boatSize, y);
        boat.addPoint(x + (int)(.8 * boatSize), y + (int)(.2 * boatSize));
        boat.addPoint(x + (int) (.2 * boatSize), y + (int) (.2 * boatSize));

        boat.setColor(Color.RED);

        int mastTopX = x + (int)(.5 * boatSize);
        int mastTopY = y - (int)(.5 * boatSize);
        int mastBotX = x + (int) (.5 * boatSize);
        int mastBotY = y;

        Line mast = new Line(mastTopX, mastTopY, mastBotX, mastBotY);

        // Sail1

        int sail1X1 = x + (int)(.2 * boatSize);
        int sail1Y1 = y;
        int sail1X2 = mastTopX;
        int sail1Y2 = mastTopY;
        int sail1X3 = mastBotX;
        int sail1Y3 = mastBotY; // NOTE: We do not need this, and can just reuse sailY1, but I am showing this for clarity
        Triangle sail1 = new Triangle(sail1X1, sail1Y1, sail1X2, sail1Y2, sail1X3, sail1Y3, Color.ORANGE, true);


        int sail2X1 = mastBotX;
        int sail2Y1 = mastBotY;
        int sail2X2 = mastTopX;
        int sail2Y2 = mastTopY;
        int sail2X3 = x + (int)(.8 * boatSize);
        int sail2Y3 = y; // NOTE: We do not need this, and can just reuse sailY1, but I am showing this for clarity
        Triangle sail2 = new Triangle(sail2X1, sail2Y1, sail2X2, sail2Y2, sail2X3, sail2Y3, Color.PINK, true);

        this.window.add(boat);
        this.window.add(sail1);
        this.window.add(sail2);
        this.window.add(mast);
    }
}