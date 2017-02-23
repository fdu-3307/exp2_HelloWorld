/**
 * 
 */
package com.mycompany.exp2.human;

/**
 * @author ilker
 *
 */
public abstract class PeopleBase implements Human {
	private String name;

	// NOTE the 2 constructors - default constructor and one that takes in String input
	protected PeopleBase() {
	}
	protected PeopleBase(String _name) {
//		this.name = _name;
		name = _name;
	}
	
	// NOTE if this was a normal class, I could not have below block commented. Since abstract class do not have to implement all methods, it is OK here 
//	@Override
//	public void walk() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void talk() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public float getBodyTemperature() {
//		return 0;
//	}

	@Override
	public String getName() {
		return name;
	}
	
}
