package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageFormulaire {

	WebDriver driver;
	
	//Creation de constructeur
	
		public PageFormulaire(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
	
	// identification des élements
	
	@FindBy(how = How.ID , using = "id_gender1")
	public static WebElement title;
	
	@FindBy(how = How.ID , using = "password")
	public static WebElement password;
	
	@FindBy(how = How.XPATH, using = "//select[@name='days']")
	public static WebElement day;
	
	@FindBy(how = How.XPATH, using =  "//select[@id='months']")
	public static WebElement month;
	
	@FindBy(how = How.XPATH, using = "//select[@name='years']")
	public static WebElement year;
	
	@FindBy(how = How.ID, using = "newsletter")
	public static WebElement newsletter;
	
	@FindBy(how = How.ID, using = "optin")
	public static WebElement receive_special;
	
	@FindBy(how = How.ID, using = "first_name")
	public static WebElement first_name;
	
	@FindBy(how = How.ID, using = "last_name")
	public static WebElement last_name;
	
	@FindBy(how = How.ID, using = "company")
	public static WebElement company;
	
	@FindBy(how = How.ID, using = "address1")
	public static WebElement adress1;
	
	@FindBy(how = How.ID, using = "address2")
	public static WebElement adress2;
	
	@FindBy(how = How.ID, using = "country")
	public static WebElement country;
	
	@FindBy(how = How.ID, using = "state")
	public static WebElement state;
	
	@FindBy(how = How.ID, using = "city")
	public static WebElement city;
	
	@FindBy(how = How.ID, using = "zipcode")
	public static WebElement zipcode;
	
	@FindBy(how = How.ID, using = "mobile_number")
	public static WebElement phone;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Create Account']")
	public static WebElement BT_CreateAccunt;
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-sm-9 col-sm-offset-1']")
	public static WebElement message_confirmationCreation;
	
	//Création des méthodes
	
	public void cliqueTitle () {
		title.click();
	}
	
	public void cliqueNewsletter () {
		newsletter.click();
	}
	
	public void cliqueReceiveSpecial () {
		receive_special.click();
	}
	
	public void cliqueBT_CreateAccunt () {
		BT_CreateAccunt.click();
	}
	
	public void saisir_password(String text) {
		password.sendKeys(text);
	}
	
	public void saisir_firstName(String text) {
		first_name.sendKeys(text);
	}
	
	public void saisir_lastName(String text) {
		last_name.sendKeys(text);
	}
	
	public void saisir_company(String text) {
		company.sendKeys(text);
	}
	
	public void saisir_adress1(String text) {
		adress1.sendKeys(text);
	}
	
	public void saisir_adress2(String text) {
		adress2.sendKeys(text);
	}
	
	public void saisir_state(String text) {
		state.sendKeys(text);
	}
	
	public void saisir_city(String text) {
		city.sendKeys(text);
	}
	
	public void saisir_zipcode(String text) {
		zipcode.sendKeys(text);
	}
	
	public void saisir_phone(String text) {
		phone.sendKeys(text);
	}
	
	public void select_day(String text) {
		Select select = new Select(day);
		select.selectByValue(text);
	}
	
	public void select_month(String text) {
		Select select = new Select(month);
		select.selectByValue(text);
	}
	
	public void select_year(String text) {
		Select select = new Select(year);
		select.selectByValue(text);
	}
	
	public void select_country(String text) {
		Select select = new Select(country);
		select.selectByValue(text);
	}
	
	public String resultat_obtenu() {
		String t;
		t=message_confirmationCreation.getText();
		//System.out.println("resultat_obtenu1111111111"+t);
		return t;
	}
}
