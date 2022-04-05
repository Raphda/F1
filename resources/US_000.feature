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
Feature: US_000 Enregistrer les écuries
  En tant que : Organisateur
  Je veux : pouvoir enregistrer des écuries, avec leur nom, leur nombre de victoire, ainsi que la liste des pilotes qui sont dans cette écurie
  Afin de : organiser les courses et avoir une vue sur le nombre de pilote par écurie

  @tag1
  Scenario Outline: Enregistrement d un écurie
    Given La création d une écurie avec un <nom>, un <nbvictoire> et une <liste_pilotes>
    When l utilisateur la valide
    Then l utilisateur récupère le <nom>, un <nbvictoire> et une <liste_pilotes> lorsqu il interoge l écurie

    Examples: 
      | nom       | nbvictoire | liste_pilotes       |
      | "Ferrari" |          5 | "Carlos", "Charles" |
