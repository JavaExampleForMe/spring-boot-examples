Feature: Serial1

  Scenario Outline: Scenario1 in - Serial1 feature1
    Given The following given data
    When I sleep for the following time <TimeInMillis>
    Then test should be returning '<Result>'

    Examples:
      | TimeInMillis | Result |
      | 10           | true   |
      | 1000         | true   |
      | 800          | true   |
      | 400          | true   |
