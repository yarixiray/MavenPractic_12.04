import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTestMvn extends TestCase {
    private WebDriver driver = new FirefoxDriver();
    private By input = By.id("text");

    @BeforeClass
    public void setUp() throws Exception {
        this.driver.get("https://ya.ru");
    }
    @Test
    public void test() throws Exception {
        //System.out.println(this.driver.getCurrentUrl());
        WebElement yaSearchInput = driver.findElement(input);
        assertTrue(yaSearchInput.isDisplayed());

        yaSearchInput.sendKeys("Woof");
        yaSearchInput.submit();
        System.out.println("Page title is: " +driver.getTitle());
        //WebDriverWait wait = new WebDriverWait(driver, 15);

        //assertEquals("Wrong page",driver.getTitle().contains("Woof"));

    }

    public void testSecond() throws Exception {
        //System.out.println(this.driver.getCurrentUrl());
        WebElement yaSearchInput = driver.findElement(input);
        WebElement imgLink = driver.findElement()
        assertTrue(yaSearchInput.isDisplayed());
    }


    @AfterClass
    public void tearDown() throws Exception {
        this.driver.quit();
    }
}
