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
    public void newPacmanWithPoints(int arg) throws Throwable{
        pacman = new Pacman();
        pacman.setPoints(arg);
        assertThat(pacman.getPoints()).isEqualTo(arg);
    }

    @Given("^a new fruit with (\\d+) point$")
    public void newFruitWithPoints(int arg) throws Throwable{
        fruit = new Fruit(arg);
    }

    @When("^Pacman eats a fruit$")
    public void pacmanEatsAFruit() {
        pacman.eat(fruit);
    }

    @Then("^Pacman has (\\d+) point$")
    public void pacmanHasPoints(int arg) {
        assertThat(pacman.getPoints()).isEqualTo(arg);
    }

}
