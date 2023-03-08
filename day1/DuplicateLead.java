package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	//to maximize the windows
	driver.manage().window().maximize();
	// to enter username
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("AZ");
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mic");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("T");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Maaa");
	driver.findElement(By.name("departmentName")).sendKeys("DUPE");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("Lead");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test123@gmail.com");
	WebElement stateDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	
			Select dd = new Select(stateDropdown);
	          dd.selectByVisibleText("New York");
	driver.findElement(By.name("submitButton")).click();  
	
	driver.findElement(By.linkText("Duplicate Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).clear();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("MOB");
	driver.findElement(By.id("createLeadForm_firstName")).clear();
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sweety");
	driver.findElement(By.className("smallSubmit")).click();
	
	
	String title = driver.getTitle();
	System.out.println(title);
}
}
