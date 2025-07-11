package sjbit.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    
    driver.get("https://www.saucedemo.com/");
    WebElement ele=driver.findElement(By.id("user-name"));
    WebElement ele1=driver.findElement(By.id("password"));
    ele.sendKeys("standard_user");
    ele1.sendKeys("secret_sauce");
    WebElement btn=driver.findElement(By.name("login_button"));
    btn.submit();
    
    }
}
