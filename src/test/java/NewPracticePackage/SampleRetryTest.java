package NewPracticePackage;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners
public class SampleRetryTest 
{
	
	@Test(retryAnalyzer=GeneralUtilities.RetryImpl.class)
	public void retryTest()
	{
		Assert.assertEquals("a", "A");
	}
}
