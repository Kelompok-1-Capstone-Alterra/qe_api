@Settings
Feature: Settings

  As an admin
  I want to change my profpict
  So that I can access Settings

  Scenario: GET - Get profile with valid endpoint
    Given I set GET api endpoints settings
    When I send GET HTTP request settings
    Then I receive valid HTTP response code 200

  Scenario: GET - Get username with valid endpoint
    Given I set GET api endpoints settings2
    When I send GET HTTP request settings2
    Then I receive valid HTTP response code 200

  Scenario: PUT - Update user name with valid endpoint
    Given I set PUT api endpoints settings3
    When I send PUT HTTP request settings3
    Then I receive valid HTTP response code 400

  Scenario: PUT - Update user name with empty name
    Given I set PUT api endpoints settings4
    When I send PUT HTTP request settings4
    Then I receive valid HTTP response code 400

  Scenario: PUT - Update user password with valid endpoint
    Given I set PUT api endpoints settings5
    When I send PUT HTTP request settings5
    Then I receive valid HTTP response code 400

  Scenario: PUT - Update user password with empty password
    Given I set PUT api endpoints settings6
    When I send PUT HTTP request settings6
    Then I receive valid HTTP response code 400

  Scenario: PUT - Update User Password with password lessthan 8 characters
    Given I set PUT api endpoints settings7
    When I send PUT HTTP request settings7
    Then I receive valid HTTP response code 400

  Scenario: GET - Get my plants stats with valid stats
    Given I set GET api endpoints settings8
    When I send GET HTTP request settings8
    Then I receive valid HTTP response code 200

  Scenario: GET - Get my plants stats with invalid stats
    Given I set GET api endpoints settings9
    When I send GET HTTP request settings9
    Then I receive valid HTTP response code 400

  Scenario: POST - Send complaint email without entering complete data
    Given I set POST api endpoints settings11
    When I send POST HTTP request settings11
    Then I receive valid HTTP response code 400

  Scenario: POST - Send complaint email with empty message
    Given I set POST api endpoints settings12
    When I send POST HTTP request settings12
    Then I receive valid HTTP response code 400

  Scenario: POST - Send suggestion with empty message
    Given I set POST api endpoints settings14
    When I send POST HTTP request settings14
    Then I receive valid HTTP response code 400

  Scenario: PUT - Update profile picture with valid url
    Given I set PUT api endpoints settings15
    When I send PUT HTTP request settings15
    Then I receive valid HTTP response code 400

  Scenario: PUT - Update profile picture with invalid req body
    Given I set PUT api endpoints settings16
    When I send PUT HTTP request settings16
    Then I receive valid HTTP response code 400

