import java.awt.Color; //graphics library
import uwcse.graphics.*; // uw graphics library

/**
 * CSC 142 homework 1
 *
 * Create a landscape that features 4 different types of elements (3 of the
 * types must be a sailboat, a fish, and a star)
 *
 * @author (Write your name here)
 */

public class OceanScene {
    /**
     * Creates an ocean scene
     */
    public OceanScene() {
        // The graphics window
        // the dimensions of the window is 500 by 400 pixels.
        GWindow window = new GWindow("Coastal landscape");
        window.setExitOnClose();

        // The ocean and the sky
        Rectangle ocean = new Rectangle(0, 0, window.getWindowWidth(), window
                .getWindowHeight(), Color.blue, true);
        window.add(ocean);

        // the sky covers the upper quarter of the window
        Rectangle sky = new Rectangle(0, 0, window.getWindowWidth(), window
                .getWindowHeight() / 4, Color.black, true);
        window.add(sky);

        // Draw the elements in the window
        // a star in the upper left corner
        new Star(10, 10, 0.8, window);
        // another one in the middle of the sky
        new Star(250, 50, 1.5, window);

        new SailBoat(200, 300, 300, window);

        new Fish(75, 150, 200, false, window);

        // Show the scene
        window.doRepaint();
    }

    /**
     * Starts the application
     */
    public static void main(String[] args) {
        new OceanScene();
    }
}