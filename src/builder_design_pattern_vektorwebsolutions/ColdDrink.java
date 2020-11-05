/**
 * Copyright (c) 2020 by fluxmeister. All rights reserved. 
 * vektorwebsolutions.com/determinator
 * 
 */
package builder_design_pattern_vektorwebsolutions;

/**
 * @author fluxmeister
 *
 */
public abstract class ColdDrink implements Item {


	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
