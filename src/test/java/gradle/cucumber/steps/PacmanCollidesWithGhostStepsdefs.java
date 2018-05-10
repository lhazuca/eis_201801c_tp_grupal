package gradle.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gradle.cucumber.Ghost;
import gradle.cucumber.Pacman;
import org.junit.Assert;
import sun.security.util.PendingException;

public class PacmanCollidesWithGhostStepsdefs {

    private Ghost ghost;
    private Pacman pacman;

    @Given("^the pacman with (\\d+) points and ghost unweakened$")
    public void the_pacman_with_points_and_ghost_unweakened(int pointsinitial) {
        pacman = new Pacman(pointsinitial);
        ghost = new Ghost(false);
        Assert.assertEquals(pointsinitial,pacman.getPoints());
        Assert.assertFalse(ghost.isWeakened());
    }

    @When("^the pacman collides with ghost$")
    public void the_pacman_collides_with_ghost() {
       pacman.eat(ghost);
    }

    @Then("^the pacman dies and his points become zero$")
    public void the_pacman_dies_and_his_points_become_zero() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(0,pacman.getPoints());    }


}
