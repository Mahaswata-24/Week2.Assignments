package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class EditLead {

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
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sweta");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ghh");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Maha");
			driver.findElement(By.name("departmentName")).sendKeys("Automation");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing123");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test1@gmail.com");
			WebElement stateDropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
             
			
			Select dd = new Select(stateDropdown);
	          dd.selectByVisibleText("New York");
	driver.findElement(By.name("submitButton")).click();
		
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateLeadForm_description")).clear();
	driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Test");
	driver.findElement(By.name("submitButton")).click();
	
		//driver.findElement(By.className("subMenuButton")).click();
		//driver.findElement(By.id("updateLeadForm_description")).clear();
		//driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Test");
		//driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	}

	

