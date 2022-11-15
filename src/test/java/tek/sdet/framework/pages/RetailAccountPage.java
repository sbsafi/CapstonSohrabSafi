package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	
	}
	
	@FindBy(id="nameInput")
	public WebElement NameField;
	
	@FindBy(id="phoneNumberInput")
	public WebElement PhoneField;
	
	@FindBy(id="personalUpdateBtn")
	public WebElement Updatebtn;
	
	@FindBy(id="accountLink")
	public WebElement Account;
	
	@FindBy(id="previousPasswordInput")
	public WebElement PrevPassInput;
	
	@FindBy(id="newPasswordInput")
	public WebElement NewPassInput;
	
	@FindBy(id="confirmPasswordInput")
	public WebElement ConfirmPassInput;
	
	@FindBy(id="credentialsSubmitBtn")
	public WebElement ChangePassBtn;
	
	
	
	
	@FindBy(xpath="//p[text()='Add a payment method']")
	public WebElement AddaPaymentMethod;
	
	@FindBy(id="cardNumberInput")
	public WebElement CardInput;
	
	@FindBy(id="nameOnCardInput")
	public WebElement NameInput;
	
	@FindBy(id="expirationMonthInput")
	public WebElement MonthInput;
	
	@FindBy(id="expirationYearInput")
	public WebElement YearInput;
	
	@FindBy(id="securityCodeInput")
	public WebElement SecurityInput;
	
	@FindBy(id="paymentSubmitBtn")
	public WebElement AddYourCardbtn;
	
	@FindBy(css="p.account__payment__sub-text")
	public WebElement SelectedpaymentCard;
	
	@FindBy(xpath="//button[text()='Edit']")
	public WebElement Edit;
	
	@FindBy(xpath="//input[@name='cardNumber']")
	public WebElement CardNumber;
	
	@FindBy(xpath="//input[@name='nameOnCard']")
	public WebElement NameOnCard;
	
	@FindBy(xpath="//input[@name='securityCode']")
	public WebElement SecurityCode;
	
	@FindBy(xpath="//button[text()='Update Your Card']")
	public WebElement UpdateCardBtn;
	
	
	@FindBy(xpath="//button[text()='remove']")
	public WebElement Remove;
	
	@FindBy(xpath="//p[text()='Add Address']")
	public WebElement AddAddress;
	
	
	@FindBy(id="countryDropdown")
	public WebElement Country;
	
	@FindBy(id="fullNameInput")
	public WebElement FullName;
	
	@FindBy(xpath="/html/body/div/div[3]/div[2]/div/div/form/div[3]/input")
	public WebElement PhoneNumber;
	
	@FindBy(id="streetInput")
	public WebElement StreetAddress;
	
	@FindBy(id="apartmentInput")
	public WebElement ApartmentInput;
	
	@FindBy(id="cityInput")
	public WebElement CityInput;
	
	@FindBy(name ="state")
	public WebElement State;
	
	@FindBy(id="zipCodeInput")
	public WebElement ZipCode;
	
	@FindBy(id="addressBtn")
	public WebElement Addaddress;
	
	
	@FindBy(xpath="//button[text()='Edit']")
	public WebElement EditAddress;
	
	@FindBy(id="addressBtn")
	public WebElement UpdateYourAddress;
	
	
	
	@FindBy(xpath="//button[text()='Remove']")
	public WebElement RemoveAddress;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}