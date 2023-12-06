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
package appletdemo;//9:00

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {

    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    
    public void paint(Graphics g)//Paints the container.
    {
        g.drawString("Applet", 150, 150);//Draws the text given by the specified string, using this graphics context's current font and color.
    }

}
