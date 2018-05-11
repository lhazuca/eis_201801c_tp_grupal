Feature: Pacman

  Scenario Outline: the pacman sees a fruit
    Given a pacman is created with <pointsInitial> points
    When a pacman eats a fruit that sum <points> points
    Then a pacman at the end of the action of eating the fruit is left with <endPoints> points

    Examples:
      |pointsInitial| points | endPoints |
      |      6      |    4   |     10    |


  Scenario Outline: the pacman sees a biscuit
    Given the pacman is created with <pointsInitial> points
    When the pacman eats a biscuit that sum <points> points
    Then the pacman at the end of the action of eating the biscuit is left with <endPoints> points

    Examples:
      |pointsInitial| points | endPoints |
      |   10        |   3    |    13     |