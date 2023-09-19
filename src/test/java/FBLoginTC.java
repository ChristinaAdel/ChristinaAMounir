import org.testng.annotations.Test;

import java.io.IOException;

    public class FBLoginTC {
        FBLogin FBLogin;

    @Test
    public void FBLoginTC() throws IOException, InterruptedException {
        FBLogin = new FBLogin();
        FBLogin.OpenLoginPage();
    }
}
