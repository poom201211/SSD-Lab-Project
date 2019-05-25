Feature: As a election commissioner
  I want to calculate the total votes

  Background:
    Given a group A with votes 7900000 and 97 members exist
    And a group B with votes 7400000 and 137 members exist
    And a group C with votes 5900000 and 30 members exist
    And a group D with votes 3700000 and 33 members exist
    And a group E with votes 3500000 and 39 members exist

  Scenario:
    Then total vote for all group should be 28400000