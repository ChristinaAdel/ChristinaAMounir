import io.cucumber.cienvironment.internal.com.eclipsesource.json.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class FBReg {
    WebDriver driver = new FirefoxDriver();

    //Open Firefox on FB page
    public FBReg FBRegister() throws IOException, ParseException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\KARIN\\IdeaProjects\\E-commerce\\src\\main\\resources\\chromedriver.exe");
        driver.navigate().to("https://www.facebook.com/?stype=lo&jlou=Affu7A_YMusHZVNdx5by941FOSEuI6lCfkFmRRWWm8Ci31nJQPyk7gkhzAYEbjF5EuXppQey-JjOPrZPioP66LLMc8Wo-2HaXAIlkkk42oPl0w&smuh=25021&lh=Ac82RtWxGRL-4Nd4EHM");
       // driver.findElement(By.id("u_0_0_8S")).click();
        driver.findElement(By.cssSelector("a[data-testid=\"open-registration-form-button\"]")).click();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(By.name("firstname")).sendKeys("Christinaa");
        driver.findElement(By.name("lastname")).sendKeys("Adel");
        driver.findElement(By.name("reg_email__")).sendKeys("01211432533");
        driver.findElement(By.id("password_step_input")).sendKeys("Chris@1234");

        WebElement Day=driver.findElement(By.id("day"));
        Select dropdown = new Select(Day);
        dropdown.selectByIndex(2);

        WebElement Month=driver.findElement(By.id("month"));
        Select dropdown2 = new Select(Month);
        dropdown2.selectByIndex(2);

        WebElement year_dropdown = driver.findElement(By.id("year"));
        Select year = new Select(year_dropdown);
        year.selectByVisibleText("1990");

        driver.findElement(By.xpath("//input[@name='sex'][1]")).click();
        driver.findElement(By.name("websubmit")).click();
        return this;
    }
}