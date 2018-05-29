package model.elements;

import model.graphics.Sprite;

/**
 * <h1>The Class DemonSud represents a collectable item.</h1>
 *
 * @author Matthieu CARTERON matthieu.carteron@viacesi.fr
 * @version 1.0
 */
public abstract class DemonSud extends Object implements IMobile {

	/**
     * Instantiates a new DemonSud.
     */
	public DemonSud(int x, int y, final Sprite sprite) {
		super(x, y, false, sprite);
	}
}
