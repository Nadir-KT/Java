/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/JApplet.java to edit this template
 */
package Applets;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author NDR
 */
public class NewJApplet extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void paint(Graphics g)
    {
    	g.setColor(Color.blue);
    	//public abstract void drawString(String str, int x, int y) //Draws the text given by the specified string, using this graphics context's current font and color. 
        g.drawString("Applet", 30, 30);
        //public void drawRect(int x, int y, int width, int height) //Draws the outline of the specified rectangle. 
        g.drawRect(70, 70, 150, 150);
        //public abstract void fillRect(int x, int y, int width, int height) //Fills the specified rectangle.
        g.fillRect(70, 270, 150, 150);
        //public abstract void drawOval(int x, int y, int width, int height) //Draws the outline of an oval.
        g.drawOval(270, 70, 150, 150);
        //public abstract void fillOval(int x, int y, int width, int height) //Fills an oval bounded by the specified rectangle with the current color.
        g.fillOval(270, 270, 150, 150);
        //public abstract void drawLine(int x1, int y1, int x2, int y2); //Draws a line, using the current color, between the points (x1, y1) and (x2, y2)in this graphics context's coordinate system.
        g.drawLine(10, 20, 10, 340);
        //public abstract void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle); //Draws the outline of a circular or elliptical arc covering the specified rectangle. 
        g.drawArc(70, 500, 50, 50, 50, 200);
        //public abstract void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle);//Fills a circular or elliptical arc covering the specified rectangle. 
        g.fillArc(270, 500, 50, 50, 50, 200);
        //public abstract void setColor(Color c); //Sets this graphics context's current color to the specified color. All subsequent graphics operations using this graphics context use this specified color.
        g.setColor(Color.blue);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
