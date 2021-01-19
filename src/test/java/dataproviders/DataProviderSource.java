package dataproviders;

import org.testng.annotations.DataProvider;

public class DataProviderSource {

    @DataProvider(name = "client1")
    public Object[][] getClientData(){
        return new Object[][]{{4,5}};
    }
}
