/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/JApplet.java to edit this template
 */
package appletdemo;

import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author Administrator
 */
public class NewJApplet extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
    
    public void paint(Graphics g)//Paints the container.
    {
        g.drawString("Applet", 150, 150);//Draws the text given by the specified string, using this graphics context's current font and color.
    }
}
