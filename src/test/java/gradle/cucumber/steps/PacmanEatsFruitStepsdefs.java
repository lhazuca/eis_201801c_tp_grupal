package gradle.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gradle.cucumber.Fruit;
import gradle.cucumber.Pacman;
import org.junit.Assert;

public class PacmanEatsFruitStepsdefs {

    Pacman pacman = new Pacman();
    @Given("^a pacman is created with (\\d+) points$")
    public void a_pacman_is_created_with_points(int arg1) {
        pacman.setPoints(arg1);
    }

    @When("^a pacman eats a fruit that sum (\\d+) points$")
    public void a_pacman_eats_a_fruit_that_sum_points(int arg1) {
        Fruit fruit = new Fruit(arg1);
        pacman.eat(fruit);
    }

    @Then("^a pacman at the end of the action of eating the fruit is left with (\\d+) points$")
    public void a_pacman_at_the_end_of_the_action_of_eating_the_fruit_is_left_with_points(int arg1) {
        Assert.assertEquals(arg1,pacman.getPoints());
    }
}
