Feature: Parallel2 Group2

  Scenario Outline: Scenario1 in - Parallel2 Group2
    Given The following given data
    When I sleep for the following time <TimeInMillis>
    Then test should be returning '<Result>'

    Examples:
      | TimeInMillis | Result |
      | 500          | true   |
      | 100          | true   |
      | 300          | true   |
      | 10           | true   |

