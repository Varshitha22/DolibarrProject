package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersAndGroups {
	//@FindBy(linkText="//a[href='/dolibarr-3.3.1/htdocs/user/home.php?leftmenu=users']")
	@FindBy(xpath="//a[text()='Users & Groups']")
	private WebElement userTB;
	
	//@FindBy(linkText="//a[href='/dolibarr-3.3.1/htdocs/user/fiche.php?action=create']")
	@FindBy(xpath="//a[text()='New user']")
	private WebElement createuserTB;
	
	@FindBy(name="nom")
	private WebElement lastnameTB;
	
	@FindBy(name="prenom")
	private WebElement firstnameTB;
	
	@FindBy(name="login")
	private WebElement loginTB;
	
	@FindBy(name="password")
	private WebElement passwordTB;
	
//	@FindBy(id="admin")
	//private WebElement adminTB;
	
	@FindBy(xpath="//input[@value='Create user']")
	private WebElement CreateBTN;
	
	public UsersAndGroups(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	public void clickUser(){
		userTB.click();
	}
	public void clickCreateUser(){
		createuserTB.click();
	}
	public void setLastName(String ln){
		lastnameTB.sendKeys(ln);
	}
	
	public void setFirstName(String fn){
			firstnameTB.sendKeys(fn);
	}
	public void setLogin(String l){
		loginTB.sendKeys(l);
	}
	
	public void setpassword(String p){
		passwordTB.sendKeys(p);
	}
	//public void admin(){
	//	adminTB.click();
	//}
	public void clickCreate(){
		CreateBTN.click();
		
	}
	
}
