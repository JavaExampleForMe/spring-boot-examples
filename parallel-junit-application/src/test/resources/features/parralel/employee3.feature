Feature: Parallel3 Group1

  Scenario Outline: Scenario1 in - Parallel3 Group1
    Given The following given data
    When I sleep for the following time <TimeInMillis>
    Then test should be returning '<Result>'

    Examples:
      | TimeInMillis | Result |
      | 900          | true   |
      | 500          | true   |
      | 800          | true   |
      | 100          | true   |
