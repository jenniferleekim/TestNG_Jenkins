package techCircle_OrangeHRM.testbase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG_Annotations {

	@BeforeSuite(alwaysRun = true)
	public void beforeSuite() {
		System.out.println("Printing before SUITE");
	}

	// The annotated method will be run only once before all tests in this suite
	// have run.
	@AfterSuite(alwaysRun = true)
	public void AfterSuite() {
		System.out.println("Printing after SUITE");
	}

//	The annotated method will be run only once after all tests in this suite have run.
	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
		System.out.println("Printing before class");
	}

//	The annotated method will be run only once before the first test method in the current class is invoked.
	@AfterClass(alwaysRun = true)
	public void afterClass() {
		System.out.println("Printing after class");
	}

//	The annotated method will be run only once after all the test methods in the current class have run.
	@BeforeTest(alwaysRun = true)
	public void beforeTest() {
		System.out.println("Printing before test");
	}

//	The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.
	@AfterTest(alwaysRun = true)
	public void afterTest() {
		System.out.println("Printing after test");
	}

//	The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.
	@BeforeGroups(groups = "integration testing")
	public void beforeGroups() {
		System.out.println("Printing before  IT groups");
	}

	@BeforeGroups(groups = "YELLO")
	public void beforeGroups2() {
		System.out.println("Printing before YELLO groups");
	}

//	The list of groups that this configuration method will run before. This method is guaranteed to run 
	// shortly before the first test method that belongs to any of these groups is
	// invoked.
	@AfterGroups
	public void afterGroups() {
		System.out.println("Printing after groups");
	}

//	The list of groups that this configuration method will run after. This method is guaranteed to run shortly after the last test method that belongs to any of these groups is invoked.
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Printing before method");
	}

//	The annotated method will be run before each test method.
	@AfterMethod
	public void afterMethod() {
		System.out.println("Printing after method");
	}

//	The annotated method will be run after each test method.
//	@DataProvider
//	Marks a method as supplying data for a test method. The annotated method must return an Object[ ][ ], 
	// where each Object[ ] can be assigned the parameter list of the test method.
	// The @Test method that wants to
	// receive data
	// from this DataProvider needs to use a dataProvider name equals to the name of
	// this annotation.
//	@Factory
//	Marks a method as a factory that returns objects that will be used by TestNG as Test classes. 
	// The method must return Object[ ].
//	@Listeners
//	Defines listeners on a test class.
//	@Parameters
//	Describes how to pass parameters to a @Test method.
//	@Test
//	Marks a class or a method as a part of the test.
	// helpers
//	description
//	timeOut
//	priority
//	dependsOnMethods
//	enabled
//	groups
//	@Test(groups = "integration testing", priority=-1)
//	public void sampleMethod() {
//		System.out.println("Sample Test");
//	}
//	
//	@Test(groups = "YELLO",priority=1)
//	public void sampleMethod2() {
//		System.out.println("Sample Test 2");
//	}
//	
//	
//	@Test(groups = "YELLO", dependsOnMethods="sampleMethod4")
//	public void sampleMethod3() {
//		System.out.println("Sample Test 3");
//	}
//	
	@Test(groups = "YELLO", enabled = true, timeOut = 4000)
	public void sampleMethod4() {
		System.out.println("Sample Test 4");
		AssertJUnit.assertTrue(true);
	}
//	
//	@Test(dataProvider = "getNames",groups = "YELLO",priority=0, description = "As a user, i was able to remote star the car successfully")
//	public void sampleMethod5(String names) {
//		System.out.println(names);
//	}
////	
//	
//	@Test(dataProvider = "getData")
//	public void timerTesting(String username, String password) {
//		System.out.println("Hello i am Smoke Method");
//
//		System.out.println(username);
//		System.out.println(password);
//
//		// this will run 3 times, since there are 3 sets of data in the DataProvider
//		// method
//	}
//	
//	@DataProvider
//	public Object[][] getData() {
//		System.out.println("DataProvider");
//
//		Object[][] data = new Object[3][2];
//
//		// first set
//		data[0][0] = "firstUserName";
//		data[0][1] = "firstPassword";
//
//		// second set
//		data[1][0] = "secondUserName";
//		data[1][1] = "secondPassword";
//
//		// third set
//		data[2][0] = "ThirdUserName";
//		data[2][1] = "ThirdPassword";
//
//		return data;
//
//	}
//	
//	@DataProvider
//	public Object[] getNames() {
//		
//		Object[] names = {"hello"};
//		
//		
//		
//		
//		return names;
//		
//	}

}
