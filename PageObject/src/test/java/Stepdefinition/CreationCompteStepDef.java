package Stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import PageObject.PageAcceuil;
import PageObject.PageFormulaire;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreationCompteStepDef {
	
	WebDriver driver = SetUp.driver;
	
	// initialisation des pages objects
	
	PageAcceuil acceuil = new PageAcceuil(driver);
	PageFormulaire formulaire = new PageFormulaire(driver);
	
	@Given("saisir l URL du site: {string}")
	public void saisir_l_url_du_site(String string) {
		acceuil.saisirURL(string);
	    
	}

	@When("Cliquer sur SignUp pour creer un compte")
	public void cliquer_sur_sign_up_pour_creer_un_compte() {
		acceuil.cliqueBT_signUp_login();
	 
	}

	@When("saisir le nom {string}")
	public void saisir_le_nom(String string) {
		acceuil.saisirName(string);
	    
	}

	@When("Saisir mail {string}")
	public void saisir_mail(String string) {
		acceuil.saisirMail(string);
	    
	}

	@When("Cliquer sur le bouton signup")
	public void cliquer_sur_le_bouton_signup() {
		acceuil.CliqueBT_signUp();
	    
	}

	@Then("Vérifier l affichage de la page d inscription")
	public void vérifier_l_affichage_de_la_page_d_inscription() {
	    
	}

	@When("selectionner le Titre")
	public void selectionner_le_titre() {
		formulaire.cliqueTitle();
	    
	}

	@When("Saisir le mot de passe {string}")
	public void saisir_le_mot_de_passe(String string) {
		formulaire.saisir_password(string);
	    
	}

	@When("Selectionner le jour : {string}")
	public void selectionner_le_jour(String string) {
		formulaire.select_day(string);
	    
	}

	@When("Selectionner le mois: {string}")
	public void selectionner_le_mois(String string) {
		formulaire.select_month(string);
	    
	}

	@When("Selectionner l année: {string}")
	public void selectionner_l_année(String string) {
		formulaire.select_year(string);
	    
	}

	@When("Selectionner Sign up for our newsletter")
	public void selectionner_sign_up_for_our_newsletter() {
		formulaire.cliqueNewsletter();
	    
	}

	@When("Selectionner Receive special offers from our partners")
	public void selectionner_receive_special_offers_from_our_partners() {
		formulaire.cliqueReceiveSpecial();
	    
	}

	@When("Saisir Firt name {string} , Last name {string} , Company {string} , Adress {string} , Adress2 {string}")
	public void saisir_firt_name_last_name_company_adress_adress2(String string1, String string2, String string3, String string4, String string5) {
		formulaire.saisir_firstName(string1);
		formulaire.saisir_lastName(string2);
		formulaire.saisir_company(string3);
		formulaire.saisir_adress1(string4);
		formulaire.saisir_adress2(string5);
	   
	}

	@When("Selectionner Country {string}")
	public void selectionner_country(String string) {
		formulaire.select_country(string);
	   
	}

	@When("Saisir State {string}, City {string}, ZipCode {string}, Mobile Number {string}")
	public void saisir_state_city_zip_code_mobile_number(String string1, String string2, String string3, String string4) {
		formulaire.saisir_state(string1);
		formulaire.saisir_city(string2);
		formulaire.saisir_zipcode(string3);
		formulaire.saisir_phone(string4);
	    
	}

	@When("Cliquer sur le bouton create account")
	public void cliquer_sur_le_bouton_create_account() {
		formulaire.cliqueBT_CreateAccunt();
	  
	}
	
	@Then("vérifier la création du compte {string}")
	public void vérifier_la_création_du_compte(String res) {
		Assert.assertTrue(formulaire.resultat_obtenu().contains(res));
	}
	    


}
