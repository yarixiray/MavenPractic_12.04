import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTestMvn extends TestCase {
    private WebDriver driver = new FirefoxDriver();
    private By input = By.id("text");
                
    @BeforeClass
    public void setUp() throws Exception {
        this.driver.get("https://ya.ru");
    }
    public void test() throws Exception {
        //System.out.println(this.driver.getCurrentUrl());
        WebElement yaSearchInput = driver.findElement(input);
        yaSearchInput.sendKeys("Woof");
        yaSearchInput.submit();
        System.out.println("Page title is: " +driver.getTitle());
        assertEquals("Woof");
    }

    @AfterClass
    public void tearDown() throws Exception {
        this.driver.quit();
    }
}
