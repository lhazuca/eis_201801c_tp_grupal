Feature: Pacman

  Scenario: Pacman eats a fruit
    Given a new Pacman with <pacmanPoints> points
    Given a new fruit with <fruitPoints> points
    When Pacman eats a fruit
    Then Pacman has <finalPoints> points

  Scenario Outline: the pacman sees a biscuit
    Given the pacman is created with <pointsInitial> points
    When the pacman eats a biscuit what sum <points> points
    Then the pacman at the end of the action of eating the biscuit is left with <endPoints> points

    Examples:
      |pointsInitial| points | endPoints |
      |   10        |   3    |    13     |