#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: US_002 Modification des enregistrements
  En tant que : Organisateur
  Je veux : pouvoir modifier l affectation pilote-écurie
  Afin de : mettre à jour les données à chaque transferts de pilote

  @tag1
  Scenario: Modification des enregistrements
    Given La création de deux écuries avec un pilote affecté à un écurie un
    When l utilisateur affecte le pilote à l écurie deux
    Then l utilisateur récupère la liste de l écurie un qui doit être vide et écurie deux contenir le pilote
