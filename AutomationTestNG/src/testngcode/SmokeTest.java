package testngcode;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SmokeTest {
	@BeforeSuite
	public void beforesuite(){
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void start(){
		System.out.println("Before Test");
	}
	@BeforeMethod
	public void beforemethod(){
		System.out.println("Before Method");
	}
	@BeforeClass
	public void beforeclass(){
		System.out.println("Before Class");
	}
	@Test(groups={"gr1"})
	public void SmokeMethod() {

		System.out.println("Smoke test Method");
	}
	@Test(groups={"g1"})
	public void SmokeMethod2() {

		System.out.println("Running Smoke test Method2");
	}
	@AfterSuite
	public void aftersuite(){
		System.out.println("After Suite");
	}
	@AfterTest
	public void Aftertest(){
		System.out.println("After Test");
	}
	@AfterMethod
	public void aftermethod(){
		System.out.println("After Method");
	}
	@AfterClass
	public void afterclass(){
		System.out.println("After Class");
	}
}
