package testngcode;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FunctionTest {
	@BeforeTest
	public void start(){
		System.out.println("Before the Function Method");
	}
  @Test(groups={"gr2"})
  public void FuncMethod() {
	  System.out.println("Running Function test Method");
  }
  @AfterTest
  public void stop(){
	  System.out.println("After Function Test Method");
  }

}
