package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisableOption {
	@FindBy(xpath="//a[text()='Users & Groups']")
	private WebElement usersandgroupsTB;
	
	@FindBy(xpath="//a[text()='Users']")
	private WebElement usersTB;
	
	@FindBy(xpath="//a[@href='fiche.php?id=15']")
	private WebElement nameTB;
	
//	@FindBy(xpath="//a[text()='Disable']")
	//private WebElement disableBTN;
	
//	@FindBy(xpath="//span[text()='Yes']")
//	private WebElement yesBTN;
	
	@FindBy(xpath="//a[text()='Reactivate']")
	private WebElement activeBTN;
	
	@FindBy(xpath="//span[text()='Yes']")
	private WebElement yesBTN;
	
//	@FindBy(xpath="//span[text()='No']")
//	private WebElement noBTN;
	
//	@FindBy(xpath="//span[text()='close']")
//	private WebElement closeBTN;
	
	public DisableOption(WebDriver driver){
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
	
	//public void clickDisable(){
		//disableBTN.click();
//	}
	
	//public void clickYes(){
//		yesBTN.click();
	//}
	
	public void clickReactivate(){
		activeBTN.click();
	}
	
	public void clickYes(){
	yesBTN.click();
	}
	
//	public void clickNo(){
//		noBTN.click();
//	}
	
//	public void clickClose(){
//		closeBTN.click();
//	}

}
