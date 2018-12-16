import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {
    @Test
    public void verifyJaSearchPage(){
        System.setProperty("webdriver.chrome.driver","c:/chromedriver.exe");
        //System.out.println("Hello");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.bing.com");
        driver.get("https://www.justanswer.com/archives/elastic-search.aspx");
        driver.manage().window().maximize();


        WebElement searchField = driver.findElement(By.cssSelector(".JA_text.search-keywords"));
        searchField.sendKeys("Selenium");

        WebElement searchButton = driver.findElement(By.cssSelector(".search-button"));
        searchButton.click();

        WebElement searchResultSummary = driver.findElement(By.cssSelector(".search-results-heading"));String resultSummaryText = searchResultSummary.getText();
        System.out.print(resultSummaryText);

        Assert.assertEquals(resultSummaryText,"You searched for \"Selenium\". 3269 results found.");

        //driver.quit();

    }


}
