package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	
	@Before
	public void openbrowser(){
		
		System.out.println("*************this is before*************");
		
	}
	
	@After
	public void closebrowser(){
		System.out.println("*************this is after*************");
		
	}
}
