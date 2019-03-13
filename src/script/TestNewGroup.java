package script;

import org.testng.annotations.Test;

import page.LoginPage;
import page.NewGroup;
import generic.BaseTest;
import generic.FWUtil;

public class TestNewGroup extends BaseTest{
	
	@Test
	public void testNewGroup() throws InterruptedException{
		
		String un = FWUtil.getXLData(INPUT_PATH, "ValidLogin", 1,0);
		String pw = FWUtil.getXLData(INPUT_PATH,"ValidLogin", 1,1);
		String n = FWUtil.getXLData(INPUT_PATH, "CreateGroup", 1,0);
		
		LoginPage s = new LoginPage(driver);
		s.setUserName(un);
		s.setPassword(pw);
		s.ClickLogin();
		Thread.sleep(2000);
		
		NewGroup group = new NewGroup(driver);
		
		group.clickGroup();
		group.clickCreateGroup();
		group.setgroupName(n);
		group.clickCreate();
		
		
	}

}
