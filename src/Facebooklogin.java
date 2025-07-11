import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebooklogin {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();  // This handles downloading & setting up ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        System.out.println("Title: " + driver.getTitle());
        driver.findElement(By.id("email")).sendKeys("pragatibs7869@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("gravity$456#firse@vahi");
        driver.findElement(By.name("login")).click();
        
        Thread.sleep(3000);
        driver.quit();  // Close the browser
    }
}
