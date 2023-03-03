package week2activity;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class w2d4 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//div[@id='username_container']/input)[1]")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("(//form[@name='login']//input)[20]")).sendKeys("Leaf@123");
		driver.findElement(By.xpath("(//label[@class='label']/following-sibling::input)[2]")).click();
		driver.findElement(By.xpath("(//div[@class='slds-icon-waffle']/div)[1]")).click();
		driver.findElement(By.xpath("//div[@class='slds-size_small']//p")).click();
			driver.close();
		
			
	}

}
