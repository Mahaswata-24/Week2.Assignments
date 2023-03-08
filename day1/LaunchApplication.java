package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class LaunchApplication {
public static void main(String[] args) {
	// to launch in Chrome browser
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	
	// to launch in Edge Browser
     EdgeDriver driver1 = new EdgeDriver();
      driver1.get("https://www.facebook.com/");
    
    ChromeDriver driver3 = new ChromeDriver();
     driver3.get("https://login.salesforce.com/");
    
    EdgeDriver driver4 = new EdgeDriver();
    driver4.get("https://login.salesforce.com/");
    
    //to launch in FireFox Browser
	FirefoxDriver driver5 = new FirefoxDriver();
	 driver5.get("https://login.salesforce.com/");
    
 
}
	
}
