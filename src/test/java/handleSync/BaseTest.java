package handleSync;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {

    public WebDriver driver;
    public ReadConfig conf;
    public Logger log;
    
@BeforeTest
    public void launchApp() throws Exception {
	
	     log = Logger.getLogger("IBM_Login_Module");
	   PropertyConfigurator.configure(".\\src\\test\\resources\\log4j.properties");
	   
	   
         log.info("launching chrome browser....");
        //System.out.println("launching app....");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("https://www.amazon.in/");
        //driver.get("https://www.irctc.co.in/nget/train-search");


        
        //create an object
        conf = new ReadConfig();
        log.info("app url is:"+conf.getAppURL());
        driver.get(conf.getAppURL());

    }

    @AfterTest
    public void closingApp() throws Exception {

        Thread.sleep(5000);
        driver.close();
        log.info("closing browser");
        //System.out.println("closing app....");

    }

}


