import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest {

    // Test Data:
    //Browser: Chrome Browser 94.0
    //URL http://www.99-bottles-of-beer.net/
    //Expected Result: “http://www.99-bottles-of-beer.net/ ”
    //
    //Steps:
    //1. Open Browser
    //2. Go to URL
    //3. Actual result = Get  web Page URL
    //4. Assert  URL

    @Test
    public void testFirst() throws InterruptedException { // throws InterruptedException - was added by Thread.sleep
        // Test Data:

        String chromeDriver = "webdriver.chrome.driver";         // from here: "webdriver.chrome.driver", "C:\\Webdriver\\chromedriver.exe")
        String driverPath = "C:\\Webdriver\\chromedriver.exe";  // from here: "webdriver.chrome.driver", "C:\\Webdriver\\chromedriver.exe")
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "http://www.99-bottles-of-beer.net/";


        System.setProperty(chromeDriver, driverPath);
     //1. Open Browser:
        WebDriver driver = new ChromeDriver(); // это запуск драйвера
      // 2. Go to URL:
        driver.get(url);

        Thread.sleep(3000);  // browser will be opened during 3 seconds
// Thread.sleep need to be added with right click of mouth

        //3. Actual result = Get  web Page URL:
        String actualResult = driver.getCurrentUrl();  //URL after browser opening

        //4. Assert  URL:
        Assert.assertEquals(actualResult, expectedResult);

        driver.close();
        driver.quit();


    }

    }



