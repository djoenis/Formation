package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageAcceuil {
	
	WebDriver driver;
	
	//Creation de constructeur
	
	public PageAcceuil(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	// identification des élements
	
	@FindBy(how = How.XPATH , using = "//a[normalize-space()='Signup / Login']" )
	public static WebElement BT_signUp_login;
	
	@FindBy(how = How.NAME , using = "name")
	public static WebElement Name;
	
	@FindBy(how = How.XPATH , using = "//input[@data-qa='signup-email']")
	public static WebElement Mail;
	
	@FindBy(how = How.XPATH , using = "//button[normalize-space()='Signup']")
	public static WebElement BT_signUp;
	
	// Création méthodes
	
	public void saisirURL(String URL) {
		driver.get(URL);
	}
	
	public void cliqueBT_signUp_login() {
		BT_signUp_login.click();
	}

	
	public void saisirName(String text) {
		Name.sendKeys(text);
	}
	
	public void saisirMail(String text) {
		Mail.sendKeys(text);
	}
	
	public void CliqueBT_signUp () {
		BT_signUp.click();
	}

	//public void saisirName(String text) {
		//ecrire(Name, text);
	//}
	
	//public void ecrire(WebElement element, String text) {
		//element.sendKeys(text);
	//}

}
