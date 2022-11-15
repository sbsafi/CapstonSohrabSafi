package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {

	 public RetailHomePage() {
	        PageFactory.initElements(getDriver(), this);
	

}
	 	@FindBy(id ="signinLink")
	    public WebElement signIn;
	 
	 	@FindBy(id="email")
		public WebElement emailField;
		
		@FindBy(id="password")
		public WebElement passwrodField;
		
		@FindBy(xpath = "//button[@type='submit']")
		public WebElement logIn;
		
		@FindBy(id="accountLink")
		public WebElement account;
		
		@FindBy(id="newAccountBtn")
		public WebElement CreateAccount;
		
		@FindBy(xpath="//button[@id='hamburgerBtn']")
		public WebElement All;
			
		@FindBy(id="contentHeader")
		public WebElement ShopByDepartment;
		
		@FindBy(xpath="//span[text()='Electronics']")
		public WebElement Electronic;
		
		@FindBy(xpath="//span[text()='Computers']")
		public WebElement Computer;
		
		@FindBy(xpath="//span[text()='Smart Home']")
		public WebElement SmartHome;
		
		@FindBy(xpath="//span[text()='Sports']")
		public WebElement Sports;
		
		@FindBy(xpath="//span[text()='Automative']")
		public WebElement Automative;
		
		
		
		
	
	


}