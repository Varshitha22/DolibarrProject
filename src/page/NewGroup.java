package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewGroup {
	
	@FindBy(xpath="//a[text()='Users & Groups']")
	private WebElement groupTB;
	
	@FindBy(xpath="//a[text()='New group']")
	private WebElement creategroupTB;
	
	@FindBy(name="nom")
	private WebElement nameTB;
	
	@FindBy(xpath="//input[@value='Create group']")
	private WebElement createBTN;
	
	public NewGroup(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	public void clickGroup(){
		groupTB.click();
	}
	public void clickCreateGroup(){
		creategroupTB.click();
	}
	
	public void setgroupName(String n){
		nameTB.sendKeys(n);
	}
	
	public void clickCreate(){
		createBTN.click();
	}

}
