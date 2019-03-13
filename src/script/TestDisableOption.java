package script;

import generic.BaseTest;
import generic.FWUtil;

import org.testng.annotations.Test;

import page.DisableOption;
import page.LoginPage;

public class TestDisableOption extends BaseTest{
	@Test
	public void testDisableOption() throws InterruptedException{
		
		String un = FWUtil.getXLData(INPUT_PATH, "ValidLogin", 1,0);
		String pw = FWUtil.getXLData(INPUT_PATH,"ValidLogin", 1,1);
		
		LoginPage s = new LoginPage(driver);
		s.setUserName(un);
		s.setPassword(pw);
		s.ClickLogin();
		Thread.sleep(2000);
		
		DisableOption option = new DisableOption(driver);
		option.clickUsersandGroups();
		option.clickUsers();
		option.clickName();
	//	option.clickDisable();
	//	option.clickYes();
		option.clickReactivate();
		option.clickYes();
	//	option.clickNo();
	//	option.clickClose();
	}

}
