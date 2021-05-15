import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeSuite;

public class SelenidRunner {
    @BeforeSuite
    static void setupAllureReports() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
}

/*
    @BeforeEach
    public void before() {

        String basicUrl = "https://www.yellowtailwine.com";
        DriverProvider.getDriver();
      //  System.setProperty( Constants.SYSTEM_PROPERTY_CHROME_DRIVER, Constants.PATH_TO_CHROME_DRIVER );
      //  driver = new ChromeDriver();
        DriverProvider.getDriver().get(basicUrl);
        DriverProvider.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    public void after() {
        DriverProvider.getDriver().quit();
    }

 */

