import io.cucumber.cienvironment.internal.com.eclipsesource.json.ParseException;
import org.testng.annotations.Test;

import java.io.IOException;

public class FBRegTC {
    FBReg FBReg;
    @Test
    public void FBRegisteration() throws IOException {
        FBReg = new FBReg();
        FBReg.FBRegister();
    }
}
