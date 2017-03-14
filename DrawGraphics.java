import java.awt.Color;
import java.awt.Graphics;

public class DrawGraphics {
    BouncingBox box;
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBall(200, 50, 50);
        box.setMovementVector(1, 1);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        box.draw(surface);
    }
} 