Feature: Parallel4 Group2

  Scenario Outline: Scenario1 in - Parallel4 Group2
    Given The following given data
    When I sleep for the following time <TimeInMillis>
    Then test should be returning '<Result>'

    Examples:
      | TimeInMillis | Result |
      | 4000         | true   |
      | 100          | true   |
      | 200          | true   |
      | 40           | true   |

