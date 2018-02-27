import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ElmamaTest {

    WebDriver driver;
    String recherche;

    @Before
    public void init()
    {
        driver = new ChromeDriver();
        driver.get("https://www.google.fr/");

    }

    @Test
    public void Test1()
    {
        recherche = System.getProperty("recherche");
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys ( recherche);
        driver.findElement(By.name("btnK")).click();

    }

    @Test
    public void Test2()
    {
        recherche = System.getProperty("recherche1");
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys ( recherche);
        driver.findElement(By.name("btnK")).click();
    }

    @After
    public void close()
    {
        driver.quit();
    }


}
