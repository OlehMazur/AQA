package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Администратор on 29.05.2017.
 */
public class Google
{
    private WebDriver driver ;
    private String baseUrl;

    public Google (WebDriver driver)
    {
        this.driver = driver;
        baseUrl ="http://www.google.com.ua";

        driver.get(baseUrl + "/");

        if (!driver.getTitle().equals("Google"))
            throw new WrongWebPage("Incorrect page for Google !");
    }

    //navigate to Search Page
    public GoogleSearch navigateToGoogleSearch()
    {
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lst-ib")));
        driver.findElement(By.id("lst-ib")).sendKeys("Mastering Selenium Testing Tools");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnG")));
        driver.findElement(By.name("btnG")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultStats")));
        return new GoogleSearch(driver);
    }
}
