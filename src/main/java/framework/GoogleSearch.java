package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Администратор on 29.05.2017.
 */
public class GoogleSearch
{
    private WebDriver driver;

    public GoogleSearch (WebDriver driver)
    {
        this.driver = driver;

        WebDriverWait wait = new WebDriverWait(driver, 20);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultStats")));

        if (!driver.getTitle().equals("Mastering Selenium Testing Tools - Пошук Google"))
            throw new WrongWebPage("Incorrect page for Search");
    }

    public String getNumberOfResults ()
    {
        String result =  driver.findElement(By.id("resultStats")).getText();
        System.out.println(result);
        return result;
    }
}
