package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeaf {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver ();
	driver.get("https://www.leafground.com/input.xhtml");
	driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']")).sendKeys("Maha");
	driver.findElement(By.xpath("//input[@value='Chennai']")).getAttribute("Chennai");
	driver.findElement(By.xpath("//input[@value='Chennai']")).clear();
	
}
}
