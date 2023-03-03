package week2activity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookclassactivity {

	public static void main(String[] args) throws InterruptedException {
		

			ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("arsau");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("ram");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9999999999");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("123@123");
		WebElement element = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select ammu=new Select(element);
		ammu.selectByIndex(18);
		WebElement element1 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select ammu1=new Select(element1);
		ammu1.selectByValue("3");
		WebElement element2 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select ammu2=new Select(element2);
		ammu2.selectByValue("2010");		
		driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.close();
		
		
		
				
		
	}

}
