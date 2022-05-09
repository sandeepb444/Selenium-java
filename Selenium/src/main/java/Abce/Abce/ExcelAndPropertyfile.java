package Abce.Abce;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ExcelAndPropertyfile {



public static void main(String[] args) throws IOException {



WebDriver d; // Driver Object for Interface
// Read properties file
Properties prop = new Properties();
FileInputStream ip = new FileInputStream(
		"C:\\Users\\s.balla\\eclipse-workspace\\Abce\\src\\main\\java\\Abce\\Abce\\configurefile");
prop.load(ip);



System.out.println(prop.getProperty("browser"));
String browserName = prop.getProperty("browser");



if (browserName.equals("chrome")) {



System.setProperty("webdriver.chrome.driver",
		"D:\\SoftwareCenterApplications\\ChromeDriver 100\\chromedriver_win32\\chromedriver.exe"); // Setting the browser name,Setting
// the path of the webdriver
d = new ChromeDriver();


}}
}