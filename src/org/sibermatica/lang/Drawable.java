package org.sibermatica.lang;

import java.awt.*;


/**
 * <h1>Drawable</h1>
 * This interface is used to implement on drawable objects such as
 * {@code Buttons}, {@code TextBoxes}, {@code TextFields}, {@code Labels}, etc.
 *
 * @see java.awt
 * @see javax.swing
 * @author <a href="mailtocirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * @since 1.0
 * @version 1.0
 */
public interface Drawable {

     /**
      * Sets the size of the Drawable object
      * @param size the size in pixels of the Drawable object, represented on {@code Dimension} class.
      * @see java.awt.Dimension
      * */
     void setSize(Dimension size);

     /**
      * Sets the size of the Drawable object
      * @param width the width of the Drawable object
      * @param height the height of the Drawable object
      * */
     void setSize(int width, int height);

     /**
      * Hides the Drawable object
      * */
     void hide();

     /**
      * Shows the Drawable object
      * */
     void show();

     /**
      * Sets the x position of the Drawable object
      * @param x the x position of the Drawable object
      * */
     void setX(int x);

     /**
      * Sets the y position of the Drawable object
      * @param y the y position of the Drawable object
      * */
     void setY(int y);

     /**
      * @return true if the Drawable object is visible
      * */
     boolean isVisible();

     /**
      * Returns the x position of the Drawable object
      * @return the x position of the Drawable object
      * */
     int getX();

     /**
      * Returns the y position of the Drawable object
      * @return the y position of the Drawable object
      * */
     int getY();

     /**
      * Returns the width of the Drawable object
      * @return the width of the Drawable object
      * */
     int getWidth();

     /**
      * Returns the height of the Drawable object
      * @return the height of the Drawable object
      * */
     int getHeight();

}
