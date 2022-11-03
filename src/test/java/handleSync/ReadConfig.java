package handleSync;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	
	public ReadConfig() throws IOException {
		
	FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\globalParameters.properties");
	   prop = new Properties();
		prop.load(fis);
		
	}
	
	public String getAppURL() {
		return prop.getProperty("app_url_QA");
		
	}
	
	public String getBrowserName() {
		
		return prop.getProperty("browser");
	}
	
	public String getDropDownURL() {
		return prop.getProperty("dropdownURl");
	}
	
	public String getUserName() {
		return prop.getProperty("adminUserName");
	}

	public String getPassword() {
		
		return prop.getProperty("adminPassword");
	}
}
