package script;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import page.ListOfUsers;
import page.LoginPage;
import generic.BaseTest;
import generic.FWUtil;

public class TestListOfUsers extends BaseTest {
	@Test
	public void testListOfUsers() throws InterruptedException{
		
		String un = FWUtil.getXLData(INPUT_PATH, "ValidLogin", 1,0);
		String pw = FWUtil.getXLData(INPUT_PATH,"ValidLogin", 1,1);
		String newText = FWUtil.getXLData(INPUT_PATH, "ModifyLogin", 1,0);
		String fn = FWUtil.getXLData(INPUT_PATH, "ModifyLogin", 1,1);
		String l = FWUtil.getXLData(INPUT_PATH, "ModifyLogin", 1,2);
		String p = FWUtil.getXLData(INPUT_PATH, "ModifyLogin", 1,3);
		
		LoginPage s = new LoginPage(driver);
		s.setUserName(un);
		s.setPassword(pw);
		s.ClickLogin();
		Thread.sleep(2000);
		
		ListOfUsers list = new ListOfUsers(driver);
		list.clickUsersandGroups();
		list.clickUsers();
		list.clickName();
		list.clickModify();
		list.setLastName(newText);
		list.setFirstName(fn);
		list.setLogin(l);
		list.setpassword(p);
		Select ad=new Select(driver.findElement(By.id("admin")));
		ad.selectByValue("1");
		Select type=new Select(driver.findElement(By.id("contactid")));
		type.selectByValue("0");
		list.clickSave();	
	}
}
