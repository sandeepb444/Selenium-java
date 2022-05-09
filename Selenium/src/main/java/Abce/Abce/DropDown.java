package Abce.Abce;





import java.util.List;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;



public class DropDown {
WebDriver driver;
@BeforeMethod



public void before() {

WebDriverManager.chromedriver().setup();
 driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("http://www.jquery-az.com/boots/demo.php?ex=63.0_2");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

}

@Test

public void test() throws InterruptedException  {
WebElement ddown = driver.findElement(By.xpath("//*[@id=\"option-droup-demo\"]"));
Select select = new Select(ddown);
Thread.sleep(3000);
select.selectByValue("Bootstrap");
Thread.sleep(3000);
select.selectByValue("Java");
Thread.sleep(3000);
select.selectByValue("MySQL");
Thread.sleep(3000);

List<WebElement> o =select.getAllSelectedOptions();
for(WebElement option : o) {
System.out.println(option.getText());
} 
}

@AfterMethod
public void after() {
driver.close();
}



}
