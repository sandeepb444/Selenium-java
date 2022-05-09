package Abce.Abce;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;



public class SendKeys {
WebDriver driver;

@BeforeClass
public void PreCondition() {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
}
@Test
public void test() throws InterruptedException {
JavascriptExecutor j = (JavascriptExecutor)driver;
Thread.sleep(2000);
driver.findElement(By.id("txtUsername")).click();
Thread.sleep(2000);
j.executeScript("document.getElementById('txtUsername').value='Selenium'");
Thread.sleep(2000);
WebElement l = driver.findElement(By.id("txtUsername"));
String s = l.getAttribute("value");
System.out.println("Value enterd is: " + s);
Thread.sleep(2000);
}
@AfterClass
public void tearDown() {
driver.close();
}
}