package script;

import generic.BaseTest;
import generic.FWUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import page.LoginPage;
import page.UsersAndGroups;

public class TestUsersAndGroups extends BaseTest {
	@Test
	public void testUserAndGroups() throws InterruptedException{
		String un = FWUtil.getXLData(INPUT_PATH, "ValidLogin", 1,0);
		String pw = FWUtil.getXLData(INPUT_PATH,"ValidLogin", 1,1);
		String ln = FWUtil.getXLData(INPUT_PATH, "CreateLogin", 1,0);
		String fn = FWUtil.getXLData(INPUT_PATH, "CreateLogin", 1,1);
		String l = FWUtil.getXLData(INPUT_PATH, "CreateLogin", 1,2);
		String p = FWUtil.getXLData(INPUT_PATH, "CreateLogin", 1,3);
		
		LoginPage s = new LoginPage(driver);
		s.setUserName(un);
		s.setPassword(pw);
		s.ClickLogin();
		Thread.sleep(2000);
		
		UsersAndGroups login = new UsersAndGroups(driver);
		login.clickUser();
		login.clickCreateUser();
		login.setLastName(ln);
		login.setFirstName(fn);
		login.setLogin(l);
		login.setpassword(p);
		Select ad=new Select(driver.findElement(By.id("admin")));
		ad.selectByVisibleText("Yes");
		login.clickCreate();
		Thread.sleep(2000);
	
	}

}
