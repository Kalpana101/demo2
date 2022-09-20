package learningJava;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//https://www.youtube.com/watch?v=Ogo_t1c-TN4

//Simple alert, will have text and ok button.Provide some information or error to the user
//Confirmation alert, will give ok or cancel button. we can proceed or cancel
//prompt alert , will have two options ok and cancel. basically getting  some input test

public class Alerts {
	WebDriver driver;
@BeforeClass
@Parameters("browser")
public void alert(String browser) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    driver = new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	if(browser.equals("firefox")){
		System.out.println("Open Firefox Driver");
		}else if(browser.equals("chrome")){
		System.out.println("Open Chrome Driver");
		}
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
    driver = new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	
}
@Test(priority =0)
public void simpleAlert() throws InterruptedException
{
	driver.findElement(By.xpath("//button[@id='alertBox']")).click();
	Alert simpleAlert =driver.switchTo().alert();
	System.out.println(simpleAlert.getText());
	Thread.sleep(3000);
    simpleAlert.accept();
    Thread.sleep(3000);
}

@Test(priority =1)
public void confirmationAlert() throws InterruptedException
{
	driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
	Alert confirmationalert =driver.switchTo().alert();
	System.out.println(confirmationalert.getText());
	Thread.sleep(3000);
	confirmationalert.accept();
	Thread.sleep(3000);
	System.out.println(driver.findElement(By.id("output")).getText());
	
}
@Test(priority =2)
public void promptAlertDismis() throws InterruptedException
{
	driver.findElement(By.xpath("//button[@id='promptBox']")).click();
	Alert promptAlert = driver.switchTo().alert();
	System.out.println(promptAlert.getText());
	Thread.sleep(3000);
	promptAlert.dismiss();
	Thread.sleep(3000);
	
	
}
@Test(priority =3)
public void promptAlertAccept() throws InterruptedException
{
	driver.findElement(By.xpath("//button[@id='promptBox']")).click();
	Alert promptAlert = driver.switchTo().alert();
	System.out.println(promptAlert.getText());
	Thread.sleep(3000);
	promptAlert.accept();
	Thread.sleep(3000);

}
}
