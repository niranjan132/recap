package testNgExample;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import handleSync.BaseTest;


public class Logger4jDemo extends BaseTest{
	
	
	@Test(priority=1, description = "lagin with valid data")
	public void verifylogin() {
		
		log.info("Clear text from userName field");
        driver.findElement(By.id("Email")).clear();
        log.info("enter username: "+ conf.getUserName());
        driver.findElement(By.id("Email")).sendKeys(conf.getUserName());
        
        
        log.info("Clear text from password field");
        driver.findElement(By.id("Password")).clear();
        log.info("enter username: " + conf.getPassword());
        driver.findElement(By.id("Password")).sendKeys(conf.getPassword());
        
        
        log.info("click on Login Button");
        driver.findElement(By.tagName("button")).click();
        
	}
	
	@Test(priority = 2)
	public void verifyApptitle() {
		
		log.info("app title is:"+driver.getTitle());
		
		Assert.assertTrue(driver.getTitle().contains("Dashboard"));
	}
	
	@Test(priority = 3)
	public void Logout() {
		
		log.info("Click on logout button.");
        driver.findElement(By.linkText("Logout")).click();
	}

}
