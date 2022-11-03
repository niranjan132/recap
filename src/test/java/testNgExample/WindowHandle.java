package testNgExample;

import handleSync.BaseTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WindowHandle extends BaseTest {

	@Test
	public void windowSwitch() throws InterruptedException {

		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent window: " + parentWindow);
		
		
		Thread.sleep(5000);
        WebElement btn_OK = driver.findElement(By.xpath("//button[text()='OK']"));
        btn_OK.click();
        
        Thread.sleep(5000);
        
        WebElement lnkHotel = driver.findElement(By.linkText("HOTELS"));
        lnkHotel.click();
        Thread.sleep(2000);
        
        Set<String> allWindow = driver.getWindowHandles();
        System.out.println("how many window present " + allWindow.size());
        
        String mainWindow = (String) allWindow.toArray()[0];      
        System.out.println(mainWindow);
        
        
        
		
	}

}
