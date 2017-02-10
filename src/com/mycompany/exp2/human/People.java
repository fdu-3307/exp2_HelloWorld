/**
 * 
 */
package com.mycompany.exp2.human;

import com.mycompany.exp2.mammal.Mammal;

/**
 * @author ilker
 *
 */
public class People extends PeopleBase implements Mammal {
	private Float bodyTemperature;
	
	public People() {
		this.bodyTemperature = 0f;
	}
	public People(String name, float bodyTemperature) {
		super(name);
		this.bodyTemperature = bodyTemperature;
	}
	
	/* (non-Javadoc)
	 * @see com.mycompany.exp2.human.Human#walk()
	 */
	@Override
	public void walk() {
		System.out.println("IN walk() of People");
	}

	/* (non-Javadoc)
	 * @see com.mycompany.exp2.human.Human#talk()
	 */
	@Override
	public void talk() {
		System.out.println("IN talk() of People");
	}

	/* (non-Javadoc)
	 * @see com.mycompany.exp2.human.Human#getBodyTemperature()
	 */
	@Override
	public float getBodyTemperature() {
		return bodyTemperature;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.exp2.mammal.Mammal#canBreastfeed()
	 */
	@Override
	public boolean canBreastfeed() {
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.exp2.mammal.Mammal#canGiveBirth()
	 */
	@Override
	public Boolean canGiveBirth() {
//		return false;	// NOTE technically wrong and in earlier Java would not compile. But due to "autoboxing" introduced later on, this line is automagically replaced with basically below one, so it compiles. But suggesting to use below line instead of this.
		return new Boolean(false);
	}

}
