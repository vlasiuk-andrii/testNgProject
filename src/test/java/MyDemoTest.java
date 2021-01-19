import dataproviders.DataProviderSource;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyDemoTest {

    @Test(dataProvider = "getData")
    public void test1(int p1, String p2){
        System.out.println("p1=" + p1 + "p2=" + p2);
    }

//    @DataProvider
//    public Object[][] getData(){
//        return new Object[][]{
//                {5, "five"},
//                {6, "six"}
//        };
//    }

    @Test(dataProvider = "client1", dataProviderClass = DataProviderSource.class)
    public void test3(Integer p){
        System.out.println("p=" + p);
    }

}