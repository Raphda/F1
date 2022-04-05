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
Feature: US_001 Ajouter une victoire
 En tant que : Organisateur
Je veux : pouvoir augmenter le nombre de victoire
Afin de : mettre à jour le nombre de victoire par écurie après chaque course.


  @tag1
  Scenario Outline: ajout d une victoire
    Given La création d une écurie avec un <nom>, un <nbvictoire>
    When l utilisateur ajoute une nouvelle victoire
    Then l utilisateur récupère le <nbvictoire> qui doit être incrémenté de 1

    Examples: 
      | nom       | nbvictoire |
      | "Ferrari" |          5 |
