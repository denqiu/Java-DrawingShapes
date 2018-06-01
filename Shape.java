package assignment5;

import java.awt.Graphics;
import java.util.Random;
import java.awt.Color;

/**
 * An abstract class that models a Shape object.
 * @author DennisQiu
 */
public abstract class Shape {
	/**
	 * Tells each shape to draw itself.
	 * @param g the shape object to be drawn
	 */
	public abstract void draw(Graphics g); //specification
	
	/**
	 * Gets the string representation of each shape object.
	 * @return the string representation of the shape object
	 */
    public abstract String getShape();
    
    /**
     * Gets the string representation of the characteristics of each shape object.
     */
    public abstract String toString();
    
    /**
     * Gets the starting X coordinate of each shape object.
     * @return the starting X coordinate of the shape object
     */
    public abstract int getStartX();
    
    /**
     * Gets the starting Y coordinate of each shape object.
     * @return the starting Y coordinate of the shape object 
     */
    public abstract int getStartY();
    
    /**
     * Gets the ending X coordinate of each shape object.
     * @return the ending X coordinate of the shape object
     */
    public abstract int getEndX();
    
   /**
     * Gets the ending Y coordinate of each shape object.
     * @return the ending Y coordinate of the shape object
     */
    public abstract int getEndY();
    
	private Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.MAGENTA};
    Color myColor = colors[new Random().nextInt(colors.length)];
    String rgbValue;
	
    /**
     * Gets the color of the shape object.
     * @return the color of the shape object.
     */
	public Color getMyColor() {
		return myColor;
	}
}