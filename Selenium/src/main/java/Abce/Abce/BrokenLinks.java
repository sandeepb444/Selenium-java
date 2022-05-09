package Abce.Abce;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;





public class BrokenLinks {
@Test
public static void links() {
System.setProperty("webdriver.chrome.driver", "D:\\SoftwareCenterApplications\\ChromeDriver 100\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.zlti.com");





// Storing the links in a list and traversing through the links
List<WebElement> links = driver.findElements(By.tagName("a"));





// This line will print the number of links and the count of links.
System.out.println("No of links are " + links.size());





// checking the links fetched.for(int i=0;i<links.size();i++)
{
WebElement E1 = links.get(1);
String url = E1.getAttribute("href");
verifyLinks(url);
}





driver.quit();
}
public static void verifyLinks(String linkUrl) {
try {
URL url = new URL(linkUrl);





// Now we will be creating url connection and getting the response code
HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
httpURLConnect.setConnectTimeout(5000);
httpURLConnect.connect();
if (httpURLConnect.getResponseCode() >= 400) {
System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + "is a broken link");
}





// Fetching and Printing the response code obtainedelse{
System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());





} catch (Exception e) {
}
}





}
