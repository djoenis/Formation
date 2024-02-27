@PageCreation
Feature: Creation compte
  je veux creer un compte en tant que utilisateur

  @Creation
  Scenario: Creation compte homme
    Given saisir l URL du site: "https://automationexercise.com/api_list"
    When Cliquer sur SignUp pour creer un compte
    And saisir le nom "Jamel OTH"
    And Saisir mail "jameltesttraining1@gmail.com"
    And Cliquer sur le bouton signup
    Then Vérifier l affichage de la page d inscription
    When selectionner le Titre
    And Saisir le mot de passe "jamel123"
    And Selectionner le jour : "1"
    And Selectionner le mois: "5"
    And Selectionner l année: "1990"
    And Selectionner Sign up for our newsletter
    And Selectionner Receive special offers from our partners
    And Saisir Firt name "djo" , Last name "jamel" , Company "enis" , Adress "mourouj" , Adress2 "benarous"
    And Selectionner Country "Canada"
    And Saisir State "test", City "testing", ZipCode "2000", Mobile Number "23232323"
    And Cliquer sur le bouton create account
    Then vérifier la création du compte "ACCOUNT CREATED!" 
    
    
