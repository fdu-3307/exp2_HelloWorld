/**
 * 
 */
package com.mycompany.exp2.human;

import com.mycompany.exp2.mammal.FemaleMammal;

/**
 * @author ilker
 *
 */
public class FemalePeople extends People implements FemaleMammal {
	private boolean doesSocialize = true;
	private boolean canBreastfeed = true;
	private boolean canGiveBirth = true;
	
	public FemalePeople() {
		
	}
	public FemalePeople(String name, float bodyTemperature, boolean doesSocialize) {
		this(name, bodyTemperature, doesSocialize, true, true);
	}
	public FemalePeople(String name, float bodyTemperature, boolean doesSocialize, boolean canBreastfeed, boolean canGiveBirth) {
		super(name, bodyTemperature);
		this.doesSocialize = doesSocialize;
		this.canBreastfeed = canBreastfeed;
		this.canGiveBirth= canGiveBirth;
	}

	// NOTE overriding the parent People's canBreastfeed() method here
	/* (non-Javadoc)
	 * @see com.mycompany.exp2.mammal.Mammal#canBreastfeed()
	 */
	@Override
	public boolean canBreastfeed() {
		return canBreastfeed;
	}

	// NOTE overriding the parent People's canGiveBirth() method here
	/* (non-Javadoc)
	 * @see com.mycompany.exp2.mammal.Mammal#canGiveBirth()
	 */
	@Override
	public Boolean canGiveBirth() {
		return canGiveBirth;
	}

	
	/* (non-Javadoc)
	 * @see com.mycompany.exp2.mammal.FemaleMammal#doesSocialize()
	 */
	@Override
	public boolean doesSocialize() {
		return doesSocialize;
	}

}
