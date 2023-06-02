package com.example.ice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("oni");
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("hebi");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("onihebidrifters@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Oni#drifters98");
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/fieldset[3]/div/div/div[1]/label")).click();
        
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("Window.scrollby(0,1500)","");
        
        //WebDriverManager.edgedriver().setup();
		//WebDriver driver= new EdgeDriver();
		String url="https://demo.opencart.com/";
		//Launching the url
		driver.navigate().to(url);
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("search"));
		search.sendKeys("mobiles");
		Thread.sleep(3000);
		//to scroll down
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3800)", "");
		//returns 
		WebElement returns =driver.findElement(By.linkText("Returns"));
		returns.click();
		driver.navigate().back();
		driver.quit();
    }
}
