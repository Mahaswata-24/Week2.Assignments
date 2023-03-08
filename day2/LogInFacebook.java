package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LogInFacebook {
public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://en-gb.facebook.com/");
    
    driver.manage().window().maximize();
    // implicit duration showing error
   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); 
   
    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Swe");
    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ghosh");
    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567860");
    driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("testing");
     
    
    
    //TO add birth date 
      WebElement birthDate =  driver.findElement(By.id("day"));
      Select dd = new Select(birthDate);
      dd.selectByVisibleText("22");
    
      //to add birth month
      WebElement birthMonth = driver.findElement(By.id("month"));
      Select dd1 = new Select (birthMonth);
      dd1.deselectByVisibleText ("Feb");
      
      //to print birth year
      WebElement birthYear=  driver.findElement(By.id("year"));
      Select dd2 = new Select(birthYear);
      dd2.deselectByVisibleText("2010");
      
      // to select female option
      driver.findElement(By.xpath("//label[text()='Female']")).click();
}
}
