import org.testng.annotations.DataProvider;

public class badLogin {

        @DataProvider(name = "badLogin")
        public Object[][] getDataFromDataprovider() {
            return new Object[][]{
                    {"John Doe", "ThisIsNotAPasswor"},
                    {"John Doe", ""},
                    {"", "ThisIsNotAPassword"},
                    {"", ""},
            };
        }
    }




