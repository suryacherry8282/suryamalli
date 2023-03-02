package generalPractice.com;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class LoginApplication {
	public static void main (String args[])throws Exception {
System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (5)\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.navigate().to("https://www.saucedemo.com/");
driver.findElement(By.id("user-name")).sendKeys("standard_user");
driver.findElement(By.id("password")).sendKeys("secret_sauce");
driver.findElement(By.id("login-button")).click();
driver.findElement(By.id("react-burger-menu-btn")).click();
Thread.sleep(3000);
driver.findElement(By.id("logout_sidebar_link")).click();
driver.quit(); 

	}

}
 