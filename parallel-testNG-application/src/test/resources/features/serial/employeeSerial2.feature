Feature: Serial2

  Scenario Outline: Scenario1 in - Serial2 feature2
    Given The following given data
    When I sleep for the following time <TimeInMillis>
    Then test should be returning '<Result>'

    Examples:
      | TimeInMillis | Result |
      | 500          | true   |
      | 300          | true   |
