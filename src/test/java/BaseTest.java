import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import utils.PropertiesReaderClassLoader;

public class BaseTest {

    @BeforeSuite
    public void beforeSuiteMethod(){
//        if ( PropertiesReaderClassLoader.getInstance().getValueFromProperty( "browser").equals("chrome")){
//            WebDriver webDriver = new ChromeDriver();
//        } else if ( PropertiesReaderClassLoader.getInstance().getValueFromProperty( "browser").equals("firefox")){
//            WebDriver webDriver = new FirefoxDriver();
//        }
    }

    @AfterSuite
    public void afterSuiteMethod(){
        System.out.println("After suite");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After method");
    }
}
