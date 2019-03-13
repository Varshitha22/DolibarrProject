package script;

import generic.BaseTest;
import generic.FWUtil;

import org.testng.annotations.Test;

import page.LoginPage;

public class TestLaunch extends BaseTest{
	@Test
	public void testLaunch() throws InterruptedException{
		String un = FWUtil.getXLData(INPUT_PATH, "ValidLogin", 1,0);
		String pw = FWUtil.getXLData(INPUT_PATH,"ValidLogin", 1,1);
		LoginPage s = new LoginPage(driver);
		s.setUserName(un);
		s.setPassword(pw);
		s.ClickLogin();
		Thread.sleep(2000);
		
	}

}
