import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StringWorkerTest extends BaseTest {

    StringWorker stringWorker = new StringWorker();

    @Parameters({"param1", "param2"})
    @Test
    public void concatanate1Test(String s1, String s2){
        System.out.println(s1 + "  " + s2);
    }
}
