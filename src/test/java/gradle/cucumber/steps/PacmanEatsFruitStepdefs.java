package gradle.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gradle.cucumber.Fruit;
import gradle.cucumber.Pacman;

import static org.assertj.core.api.Assertions.assertThat;

public class PacmanEatsFruitStepdefs {

    private Pacman pacman;
    private Fruit fruit;

    @Given("^a new Pacman with (\\d+) points$")
    public void newPacmanWithZeroPoints() throws Throwable{
        pacman = new Pacman();
        assertThat(pacman.getPoints()).isEqualTo(0);
    }

    @Given("^a new fruit with (\\d+) point$")
    public void newFruitWithOnePoint() throws Throwable{
        fruit = new Fruit(1);
    }

    @When("^Pacman eats a fruit$")
    public void pacmanEatsAFruit() {
        pacman.eat(fruit);
    }

    @Then("^Pacman has (\\d+) point$")
    public void pacmanHasOnePoint() {
        assertThat(pacman.getPoints()).isEqualTo(1);
    }

}
