Feature: Is it Friday yet ?
  It's important to know if it's Friday

  Scenario Outline: Is today Friday
    Given today is "<day>"
    When I ask whether it's Friday yet
    Then I should be told "<answer>"

    Examples:
      | day            | answer |
      | Friday         | TGIF   |
      | Sunday         | no     |
      | anything else! | no     |
