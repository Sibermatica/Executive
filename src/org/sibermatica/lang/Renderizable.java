package org.sibermatica.lang;

/**
 * <h1>Renderizable</h1>
 * This class is used to represent renderizable objects, such as:
 * <ul>
 *     <li>Cubes</li>
 *     <li>Rectangles</li>
 * </ul>
 * and more...
 *
 * @author <a href="mailto:cirodeveloper@sibermatica.org">Ciro Alejo Diaz</a>
 * @since 1.1
 * @see javax.swing
 * */
public interface Renderizable {

    /**
     * Renders the object.
     * */
    void render();

    /**
     * Sets the visibility of the object.
     * @param visible Visibility of the object
     * */
    void setVisibility(boolean visible);

    /**
     * Returns if the object is visible.
     * @return true if the object
     * */
    boolean isVisible();

    /**
     * Returns the width of the object.
     * @return the width of the object
     * */
    int getWidth();

    /**
     * Returns the height of the object.
     * @return the height of the object
     * */
    int getHeight();

    /**
     * Returns the coordinate x of the object.
     * @return the x coordinate of the object
     * */
    int getX();

    /**
     * Returns the coordinate y of the object.
     * @return the y coordinate of
     * */
    int getY();

    /**
     * Sets the coordinate x of the object.
     * @param x the x coordinate of the object
     * */
    void setX(int x);

    /**
     * Sets the coordinate y of the object.
     * @param y the y coordinate of the object
     * */
    void setY(int y);

    /**
     * Sets the width of the object.
     * @param width the width of the object
     * */
    void setWidth(int width);

    /**
     * Sets the height of the object.
     * @param height the height of the object
     * */
    void setHeight(int height);

}
