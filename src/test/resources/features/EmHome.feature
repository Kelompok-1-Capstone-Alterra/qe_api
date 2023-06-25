@EmHome
Feature: Explore&Monitoring Home

  As a user
  I want to grow plants
  So that I should access Explore&Monitoring

  Scenario: GET - Get Weather with valid endpoint and data
    Given I set GET api endpoints EmHome
    When I send GET HTTP request EmHome
    Then I receive valid HTTP response code 200

  Scenario: GET - Get weather article with valid label_id
    Given I set GET api endpoints EmHome2
    When I send GET HTTP request EmHome2
    Then I receive valid HTTP response code 200

  Scenario: GET - Get weather article with invalid label id
    Given I set GET api endpoints EmHome3
    When I send GET HTTP request EmHome3
    Then I receive valid HTTP response code 404

  Scenario: GET - Get available plant list with a valid endpoint
    Given I set GET api endpoints EmHome4
    When I send GET HTTP request EmHome4
    Then I receive valid HTTP response code 200

  Scenario: GET - Search available plants with valid name
    Given I set GET api endpoints EmHome5
    When I send GET HTTP request EmHome
    Then I receive valid HTTP response code 200

  Scenario: GET - Get plant detail with valid plant id
    Given I set GET api endpoints EmHome6
    When I send GET HTTP request EmHome6
    Then I receive valid HTTP response code 200

  Scenario: GET - Get plant detail with valid endpoint and invalid id
    Given I set GET api endpoints EmHome7
    When I send GET HTTP request EmHome7
    Then I receive valid HTTP response code 404

  Scenario: GET - Get planting locationl with valid endpoint and plant_id
    Given I set GET api endpoints EmHome8
    When I send GET HTTP request EmHome8
    Then I receive valid HTTP response code 200

  Scenario: GET - Get planting article with valid endpoint
    Given I set GET api endpoints EmHome9
    When I send GET HTTP request EmHome9
    Then I receive valid HTTP response code 200

  Scenario: GET - Get planting article with valid endpoint and invalid id
    Given I set GET api endpoints EmHome10
    When I send GET HTTP request EmHome10
    Then I receive valid HTTP response code 404

  Scenario: GET - Get planting article with valid endpoint and invalid location
    Given I set GET api endpoints EmHome11
    When I send GET HTTP request EmHome11
    Then I receive valid HTTP response code 400

  Scenario: GET - Get fertilizing article with valid endpoint and param
    Given I set GET api endpoints EmHome12
    When I send GET HTTP request EmHome12
    Then I receive valid HTTP response code 200

  Scenario: GET - Get fertilizing article with valid endpoint and invalid id
    Given I set GET api endpoints EmHome13
    When I send GET HTTP request EmHome13
    Then I receive valid HTTP response code 404

  Scenario: GET - Get watering article with valid endpoint and param
    Given I set GET api endpoints EmHome14
    When I send GET HTTP request EmHome14
    Then I receive valid HTTP response code 200

  Scenario: GET - Get watering articlewith valid endpoint and invalid id
    Given I set GET api endpoints EmHome15
    When I send GET HTTP request EmHome15
    Then I receive valid HTTP response code 404

  Scenario: GET - Get temperature article with valid endpoint and param
    Given I set GET api endpoints EmHome16
    When I send GET HTTP request EmHome16
    Then I receive valid HTTP response code 200

  Scenario: GET - Get temperature article with valid endpoint and invalid id
    Given I set GET api endpoints EmHome17
    When I send GET HTTP request EmHome17
    Then I receive valid HTTP response code 404

  Scenario: GET - Get my plant name with valid endpoint and param
    Given I set GET api endpoints EmHome18
    When I send GET HTTP request EmHome18
    Then I receive valid HTTP response code 200

  Scenario: GET - Get my plant name with valid endpoint and invalid id
    Given I set GET api endpoints EmHome19
    When I send GET HTTP request EmHome19
    Then I receive valid HTTP response code 400

  Scenario: POST - Start planting with valid endpoint and invalid id
    Given I set POST api endpoints EmHome20
    When I send POST HTTP request EmHome20
    Then I receive valid HTTP response code 404

  Scenario: GET - Get my plant overviewwith valid endpoint and param
    Given I set GET api endpoints EmHome21
    When I send GET HTTP request EmHome21
    Then I receive valid HTTP response code 404

  Scenario: GET - Get my plant overview with valid endpoint and invalid id
    Given I set GET api endpoints EmHome22
    When I send GET HTTP request EmHome22
    Then I receive valid HTTP response code 404

  Scenario: POST - Add watering with valid endpoint and param
    Given I set POST api endpoints EmHome23
    When I send POST HTTP request EmHome23
    Then I receive valid HTTP response code 404

  Scenario: POST - Add watering with valid endpoint and invalid id
    Given I set POST api endpoints EmHome24
    When I send POST HTTP request EmHome24
    Then I receive valid HTTP response code 404

  Scenario: POST - Add fertilizing with valid endpoint and invalid id
    Given I set POST api endpoints EmHome25
    When I send POST HTTP request EmHome25
    Then I receive valid HTTP response code 404

  Scenario: POST - Add weekly progress with valid endpoint and invalid body
    Given I set POST api endpoints EmHome26
    When I send POST HTTP request EmHome26
    Then I receive valid HTTP response code 404