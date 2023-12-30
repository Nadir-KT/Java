package Applets;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.net.URL;

public class IMG extends Applet {
	
	Image pic;
	public void init() //Called by the browser or applet viewer to inform this applet that it has been loaded into the system. It is always called before the first time that the start method is called. 
	{
		pic=getImage(getDocumentBase(), "nature.jpg");//public Image getImage(URL url, String name) // name: the location of the image, relative to the url argument.
                //image should be inside project build path
	}
	
	public void paint(Graphics g) {
		//public abstract boolean drawImage(Image img, int x, int y, ImageObserver observer);
		g.drawImage(pic, 50, 50, this);
		/*for (int i=0;i<=500;i++) {
			g.drawImage(pic, i, 120, this);
		}
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			// TODO: handle exception
		}*/
	}
}
