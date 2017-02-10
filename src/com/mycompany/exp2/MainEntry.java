/**
 * 
 */
package com.mycompany.exp2;

import com.mycompany.exp2.human.FemalePeople;
import com.mycompany.exp2.human.Human;
import com.mycompany.exp2.human.MalePeople;
import com.mycompany.exp2.human.People;
import com.mycompany.exp2.mammal.Mammal;

/**
 * @author ilker
 *
 */
public class MainEntry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World ilker");
		
		// Anthony's block - he is interested in Human
		// GOOD block - using polymorphism
		Human human1 = new People("Alfred", 95f);
		human1.talk();
		human1.walk();
		Human human2 = new MalePeople("Bobby", 96f, true);
		human2.getBodyTemperature();
/*		
		// BAD block - NOT using polymorphism
		People people1 = new People("Alfred2", 95f);
		people1.talk();
		people1.walk();
		MalePeople people2 = new MalePeople("Bobby2", 96f, true);
		people2.getBodyTemperature();
*/		
		
		// Alex's block - he is interested in Mammal
		Mammal mammal1 = new People("Anonymous", 97f);
		mammal1.canBreastfeed();
		Mammal mammal2 = new MalePeople("Bill", 98f, false);
		mammal2.canBreastfeed();
		Mammal mammal3 = new FemalePeople("Barbara", 95f, true);
		mammal3.canBreastfeed();

	}

}
