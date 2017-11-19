package importantSelenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*Hard Assert:
	Execution Will Halt if Test Fail.
	No Test Case will Execute.

	Soft Assert:
	Execution Will Not Halt in Case of Test Case Fail.*/

public class AssertTest {

	@Test
	public void hardAssertTest() {
		Assert.assertEquals(12, 13, "Month count should be 13 including default value Select Month!!!");
		System.out.println("Testing Hard Assert");
	}

	@Test
	public void hardAssert1Test() {
		Assert.assertEquals(13, 13, "Month count should be 13 including default value Select Month!!!");
		System.out.println("Testing Hard Assert 1");
	}

	@Test
	public void softAssertTest() {

		SoftAssert assert_soft = new SoftAssert();

		System.out.println("Soft assertion Started");
		assert_soft.assertEquals(12, 13);
		System.out.println("Soft Assert Completed!!!");
		assert_soft.assertAll();
	}

	@Test
	public void assertTrueTest() {
		String str = "Mohammad Saif";
		Assert.assertTrue(str.contains("Saif"), "Pass");
	}

	@Test
	public void assertFalseTest() {
		String str = "Mohammad Saif";
		Assert.assertFalse(str.contains("Harun"), "Pass");
	}
}