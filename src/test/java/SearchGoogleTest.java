import framework.Google;
import framework.GoogleSearch;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Администратор on 29.05.2017.
 */
public class SearchGoogleTest
{
    private WebDriver driver;
    Google startPage;
    GoogleSearch search;

    @Before
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumLib\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testSearchGoogleTest()
    {
        startPage = new Google(driver);
        search = startPage.navigateToGoogleSearch();
        search.getNumberOfResults();


    }

    @After
    public void tearDown()
    {
        driver.quit();
    }

}
