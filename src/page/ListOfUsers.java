package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListOfUsers {
	@FindBy(xpath="//a[text()='Users & Groups']")
	private WebElement usersandgroupsTB;
	
	@FindBy(xpath="//a[text()='Users']")
	private WebElement usersTB;
	
	@FindBy(xpath="//a[@href='fiche.php?id=15']")
	private WebElement nameTB;
	
	@FindBy(xpath="//a[text()='Modify']")
	private WebElement modifyTB;
	
	@FindBy(name="nom")
	private WebElement lastnameTB;
	
	@FindBy(name="prenom")
	private WebElement firstnameTB;
	
	@FindBy(name="login")
	private WebElement loginTB;
	
	@FindBy(name="password")
	private WebElement passwordTB;
	
	@FindBy(xpath="//input[@value='Save']")
	private WebElement saveTB;
	
	public ListOfUsers(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void clickUsersandGroups(){
		usersandgroupsTB.click();
	}
	
	public void clickUsers(){
		usersTB.click();
	}
	
	public void clickName(){
		nameTB.click();
	}
	
	public void clickModify(){
		modifyTB.click();
	}
	
	public void setLastName(String newText){
	    lastnameTB.clear();
	    lastnameTB.sendKeys(newText);
	  }
	
	public void setFirstName(String fn){
			firstnameTB.clear();
			firstnameTB.sendKeys(fn);
	}
	public void setLogin(String l){
		loginTB.clear();
		loginTB.sendKeys(l);
	}
	
	public void setpassword(String p){
		passwordTB.clear();
		passwordTB.sendKeys(p);
	}
	
	public void clickSave(){
		saveTB.click();
	}

}
