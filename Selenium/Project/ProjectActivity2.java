import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProjectActivity2 {
	public static void main(String[] args) {
	//	System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");
      //  WebDriver driver = new FirefoxDriver();
 
        //driver.get("http://alchemy.hguy.co/orangehrm");
        WebDriver driver = new FirefoxDriver();

	      
        driver.get("http://alchemy.hguy.co/orangehrm");
        
       // String headerImage = driver.findElement(By.xpath("//div[@id=divLogo"));
        
      //  String headerImageUrl = headerImage.getDomAttribute("src");
        
      //  System.out.println("Header Image URL: " + headerImageUrl);
        WebElement element = driver.findElement(By.xpath("//div[@id='divLogo']/img"));
		 System.out.println(element.getDomAttribute("src")); 
        
        driver.quit();    
    
    }

}
