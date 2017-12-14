/** 
 *  
 *  
 */

public class UserOfRPGv2 {

    /** 
     *  
     *  
     */
	
    public static void main(String[] commandLine) {
		/*
		Character[] agents = { new Protagonist("zero")
							 , new Hero("one")
							 , new Mage("two")
							 , new Warrior("three")
							 , new Monster()
							 , new Cyclops()
							 , new Hellhound()
							 , new Hydra()
							 };
		*/					 
		// Prediciting that it will fail during compilation
		// Error of incompatible types; Protagonist and Protagonist subclasses cannot be converted to Monster
		Monster[] agents = { // new Protagonist("zero")
						   // , new Hero("one")
						   // , new Mage("two")
						   // , new Warrior("three")
						     new Monster()
						   , new Cyclops()
						   , new Hellhound()
						   , new Hydra()
						   };
		
		for( Character agent: agents) {
			System.out.println(agent + "\n");
		}
		
		// Predicting that it will fail during compilation
		// Error: cannot find ymbol getName()
		/* for( Monster agent: agents) {
			System.out.println(getName());
		} */
    }
}
