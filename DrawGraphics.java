import java.awt.Color;
import java.awt.Graphics;

public class DrawGraphics {
    BouncingBox box;
    
    // Array of points that we will use to draw graphs
    int[] x;
    int[] y;
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBox(200, 50, Color.RED);
        box.setMovementVector(1, 1);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        box.draw(surface);
    }
} 