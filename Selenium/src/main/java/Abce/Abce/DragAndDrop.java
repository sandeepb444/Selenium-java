package Abce.Abce;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;



public class DragAndDrop {
WebDriver driver;

@BeforeMethod
public void before() {
// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://jqueryui.com/droppable/");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

}
@Test
public void test() throws InterruptedException{
// TODO Auto-generated method stub
driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
WebElement a = driver.findElement(By.id("draggable"));
Thread.sleep(3000);
WebElement b = driver.findElement(By.id("droppable"));
Thread.sleep(3000);
Actions act=new Actions(driver);
Thread.sleep(3000);
act.dragAndDrop(a, b).perform();
Thread.sleep(3000);

}



@AfterClass



public void after() {
// TODO Auto-generated method stub
driver.close();




}



}