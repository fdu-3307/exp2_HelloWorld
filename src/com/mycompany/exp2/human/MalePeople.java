/**
 * 
 */
package com.mycompany.exp2.human;

import com.mycompany.exp2.mammal.MaleMammal;

/**
 * @author John
 *
 */
public class MalePeople extends People implements MaleMammal {
	private boolean protectsTerritory;

	public MalePeople() {
		// TODO Auto-generated constructor stub
	}
	public MalePeople(String name, float bodyTemperature, boolean protectsTerritory) {
		super(name, bodyTemperature);
		this.protectsTerritory = protectsTerritory;
	}
	
	/* (non-Javadoc)
	 * @see com.mycompany.exp2.mammal.MaleMammal#protectsTerritory()
	 */
	@Override
	public boolean protectsTerritory() {
		return protectsTerritory;
	}

}
