package A;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class MyTest {
    
    @Test
    public void google(){
        WebDriverManager.chromedriver().setup();

//        System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\92\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://google.pl");
        webDriver.close();
    }
    
}
