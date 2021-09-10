package A;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
public class MyTest {
    
    @Test
    public void google(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

//        System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\92\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver(options);
        webDriver.get("https://google.pl");
                System.out.println("google thread Id"+Thread.currentThread().getId());
        System.out.println("google thread Id"+Thread.currentThread().getId());
        System.out.println("google thread Id"+Thread.currentThread().getId());
        webDriver.close();
    }
    
       @Test
    public void twitter(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
//        System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\92\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver(options);
        webDriver.get("https://twitter.pl");
        System.out.println("google thread Id"+Thread.currentThread().getId());
        System.out.println("google thread Id"+Thread.currentThread().getId());
        System.out.println("google thread Id"+Thread.currentThread().getId());
        webDriver.close();
    }
    
}
