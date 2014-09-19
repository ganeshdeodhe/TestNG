package testngcode;

import org.testng.annotations.Test;

public class GrpCls {
  @Test(groups={"g1"})
  public void f() {
	  System.out.println("Test Group");
  }
  @Test(groups={"g1"})
  public void f1() {
	  System.out.println("Test Group1");
  }
}
