import java.awt.Color;
import uwcse.graphics.*;


// A star in a graphics window


public class Star {

    //The graphics window the star belongs to
    private GWindow window;

    //The location of the center of the star
    private int x;

    private int y;

    //Scale of the drawing of the star
    private double scale;


    //Draws a star in a graphics window

    /**
     * @param x the x coordinate of the center of the star
     * @param y the y coordinate of the center of the star
     * @param scale the scale of the drawing of the star
     * @param window the graphics window the star belongs to
     */


    public Star(int x, int y, double scale, GWindow window) {
        //Initialize the instance fields
        this.x = x;
        this.y = y;
        this.window = window;
        this.scale = scale;

        //Draw the star
        this.draw();
    }


    //Draws this star (complete this method to make a better star)

    public void draw() {
       // color of the star
        Color starColor = Color.WHITE;
        //Size of the star
        int starSize = (int) (this.scale);
        //Draw the lines making up the star
        Line line1 = new Line(this.x, this.y - starSize, this.x, this.y
                + starSize, starColor);
        Line line2 = new Line(this.x - starSize, this.y, this.x + starSize, this.y, starColor);
        this.window.add(line1);
        this.window.add(line2);
    }
}