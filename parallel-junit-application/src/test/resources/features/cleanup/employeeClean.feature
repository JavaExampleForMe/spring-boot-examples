Feature: cleanup the database

  Scenario Outline: clean all database
    Given The following given data
    When I sleep for the following time <TimeInMillis>
    Then test should be returning '<Result>'

    Examples:
      | TimeInMillis | Result |
      | 10           | true   |
