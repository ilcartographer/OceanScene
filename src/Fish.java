import uwcse.graphics.GWindow;
import uwcse.graphics.Oval;
import uwcse.graphics.Triangle;

import java.awt.*;

/**
 * Created by ilcartographer on 7/18/2015.
 */
public class Fish {
    // The graphics window the boat belongs to
    private GWindow window;

    // The location of the boat
    private int x;

    private int y;

    private boolean faceRight;

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
    public Fish(int x, int y, double scale, boolean faceRight, GWindow window) {
        // Initialize the instance fields
        this.x = x;
        this.y = y;
        this.window = window;
        this.scale = scale;
        this.faceRight = faceRight;

        // Draw the boat
        this.draw();
    }

    /**
     * Draws this sailboat
     */
    private void draw() {

        Color fishColor = Color.MAGENTA;

        int fishSize = (int)this.scale;

        int fishX = (faceRight) ? x + (int)(.25 * fishSize) : x;
        int fishY = y;
        int fishWidth = (int)(.75 * fishSize);
        int fishHeight = (int)(.3 * fishSize); // NOTE: The scale factor should be what you use to get the bottom point of the tail
        Oval fishBody = new Oval(fishX, fishY, fishWidth, fishHeight, fishColor, true);

        int tailX1 = (faceRight) ?  x : x + fishSize;
        int tailY1 = y;
        int tailX2 = (faceRight) ? x : x + fishSize;
        int tailY2 = y + fishHeight;
        int tailX3 = (faceRight) ? fishX : x + fishWidth;
        int tailY3 = y + (int)(.5 * fishHeight);

        Triangle fishTail = new Triangle(tailX1, tailY1, tailX2, tailY2, tailX3, tailY3, fishColor, true);

        this.window.add(fishBody);
        this.window.add(fishTail);

    }
}
