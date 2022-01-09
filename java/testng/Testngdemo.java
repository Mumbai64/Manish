package testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testngdemo {
@Test

public void testcase() {
	System.out.println("Ist TEST1 case");
	//Assert.assertEquals("A","B");//hard assertion
	SoftAssert sa=new SoftAssert();
	
	sa.assertEquals("A","B");
	sa.assertAll();
	
	
	System.out.println("Ist TEST2 case");
	System.out.println("Ist TEST2 case");
    System.out.println("Ist TEST4 case");
    System.out.println("Ist TEST5 case");
}
@BeforeTest
public void precondition() {
	System.out.println("Before TEST");
}
@AfterTest
public void postcondition() {
	System.out.println("After TEST");
}
@BeforeClass
public void utilties() {
	System.out.println("Before TEST");
}	
@AfterClass
public void utilties1() {
		System.out.println("AfterClass TEST");
}
@BeforeMethod 
public void runs() {
	System.out.println("Test");

	}
@AfterMethod
public void runs1() {
	System.out.println("after Test");
}
@BeforeSuite
public void runs2 () {
	System.out.println("Before Test");
}
@AfterSuite
public void runs3() {
	System.out.println("After TEST");
}
}