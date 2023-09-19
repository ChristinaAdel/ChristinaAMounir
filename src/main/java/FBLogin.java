import io.cucumber.cienvironment.internal.com.eclipsesource.json.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class FBLogin {
    //System.setProperty("webdriver.chrome.driver","C:\\Users\\KARIN\\IdeaProjects\\E-commerce\\src\\main\\resources\\chromedriver.exe");
    WebDriver driver = new FirefoxDriver();

    private By EnterEmail = By.name("//input[@name='email']");

    //Open FB page
    public FBLogin OpenLoginPage() throws IOException, ParseException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\KARIN\\IdeaProjects\\E-commerce\\src\\main\\resources\\chromedriver.exe");
        driver.navigate().to("https://www.facebook.com/?stype=lo&jlou=Affu7A_YMusHZVNdx5by941FOSEuI6lCfkFmRRWWm8Ci31nJQPyk7gkhzAYEbjF5EuXppQey-JjOPrZPioP66LLMc8Wo-2HaXAIlkkk42oPl0w&smuh=25021&lh=Ac82RtWxGRL-4Nd4EHM");
        driver.findElement(By.id("email")).sendKeys("christina.mounir95@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("Chris@1995");
        driver.findElement(By.name("login")).click();
        return this;
    }

}
