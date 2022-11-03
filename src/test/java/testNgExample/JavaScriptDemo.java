package testNgExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import handleSync.BaseTest;

public class JavaScriptDemo extends BaseTest {

	
	@Test
	public void exeuteJS () {
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		 //WebElement returnPolicy = driver.findElement(By.xpath("//strong[contains(text(),'30days')]"));
		//js.executeScript("arguments[0].scrollIntoView()", returnPolicy);
		
        JS.executeScript("alert('hello team, happy learning');");
        
       // JS.executeScript("arguments[0].click();", btnLogin);
        
        
//      for (int i = 0; i < 10; i++) {
//          
//          JS.executeScript("arguments[0].setAttribute('style', arguments[1]);" ,     btnLogin,     "color: pink; border: 4px solid pink;");
//          JS.executeScript("arguments[0].setAttribute('style', arguments[1]);" ,     pass,     "color: green; border: 4px solid green;");
//      }
		
		
	}
}
