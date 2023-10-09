package testng.demo;

import org.testng.annotations.Test;

public class annotaionstest {

	public class firstclass {
		@Test
		void login()
		{
			System.out.println("my login");
		}
		
	void logout()
	{
		System.out.println("my logout");
	}
	}
}
