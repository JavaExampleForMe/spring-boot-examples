Feature: Parallel18 Group1

  Scenario Outline: Scenario18 in - Parallel18 Group1
    Given The following given data
    When I sleep for the following time <TimeInMillis>
    Then test should be returning '<Result>'

    Examples:
      | TimeInMillis | Result |
      | 1200          | true   |
      | 30           | true   |

