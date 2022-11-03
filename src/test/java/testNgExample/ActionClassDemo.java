package testNgExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import handleSync.BaseTest;

public class ActionClassDemo extends BaseTest {
	
	
	@Test
	public void performActions () {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'sign in')]")));
		
		WebElement signIn = driver.findElement(By.xpath("//span[contains(text(),'sign in')]"));
		
		
		Actions action = new Actions(driver);
		action.moveToElement(signIn).click(signIn).perform();
		
		//Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
		
	}

}
