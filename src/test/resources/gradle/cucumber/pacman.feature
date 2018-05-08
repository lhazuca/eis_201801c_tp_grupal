Feature: Pacman

  Scenario: Pacman eats a fruit
    Given a new Pacman with zero points
    Given a new fruit with one point
    When Pacman eats a fruit
    Then Pacman has one point