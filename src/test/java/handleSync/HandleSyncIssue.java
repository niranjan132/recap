package handleSync;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandleSyncIssue extends  BaseTest{
	
	
	@Test
	public void verifyTextBox() {
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("text3")));
		
		driver.findElement(By.id("text3")).sendKeys("entering value here");
		
	}

}
