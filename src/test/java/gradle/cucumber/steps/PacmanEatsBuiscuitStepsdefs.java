package gradle.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gradle.cucumber.Biscuit;
import gradle.cucumber.Pacman;
import org.junit.Assert;

public class PacmanEatsBuiscuitStepsdefs {

    Pacman pacman = new Pacman();
    @Given("^the pacman is created with (\\d+) points$")
    public void the_pacman_is_created_with_points(int arg1) {
        pacman.setPoints(arg1);
    }

    @When("^the pacman eats a biscuit that sum (\\d+) points$")
    public void the_pacman_eats_a_biscuit_that_sum_points(int arg1) {
        Biscuit biscuit = new Biscuit(arg1);
        pacman.eat(biscuit);
    }

    @Then("^the pacman at the end of the action of eating the biscuit is left with (\\d+) points$")
    public void the_pacman_at_the_end_of_the_action_of_eating_the_biscuit_is_left_with_points(int arg1) {
        Assert.assertEquals(arg1,pacman.getPoints());
    }
}
