/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */
/*Java Applet// https://www.javatpoint.com/java-applet
Applet is a special type of program that is embedded in the webpage to generate the dynamic content. It runs inside the browser and works at client side.

Browser Interpreter only supports .class files instead of .java files

Advantage of Applet
------------------
There are many advantages of applet. They are as follows:
It works at client side so less response time.
Secured
It can be executed by browsers running under many plateforms, including Linux, Windows, Mac Os etc.

Drawback of Applet
------------------
Plugin is required at client browser to execute applet.

Lifecycle of Java Applet
------------------------
Applet is initialized.
Applet is started.
Applet is painted.
Applet is stopped.
Applet is destroyed.

Lifecycle methods for Applet:
-----------------------------
The java.applet.Applet class 4 life cycle methods and java.awt.Component class provides 1 life cycle methods for an applet.

java.applet.Applet class
------------------------
For creating any applet java.applet.Applet class must be inherited. It provides 4 life cycle methods of applet.

public void init(): is used to initialized the Applet. It is invoked only once.
public void start(): is invoked after the init() method or browser is maximized. It is used to start the Applet.
public void stop(): is used to stop the Applet. It is invoked when Applet is stop or browser is minimized.
public void destroy(): is used to destroy the Applet. It is invoked only once.

java.awt.Component class
------------------------
The Component class provides 1 life cycle method of applet.

public void paint(Graphics g): is used to paint the Applet. It provides Graphics class object that can be used for drawing oval, rectangle, arc etc.
*/
package Applets;
//javac Applets.java
//appletviewer Applets.java
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author NDR
 */
public class NewApplet extends Applet {

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
/*<html>
<body>
<applet code="Applets.class" width="300" height="300">
</applet>
</body>
</html>*/