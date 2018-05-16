package gradle.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gradle.cucumber.Ghost;
import gradle.cucumber.Pacman;
import org.junit.Assert;

public class PacamanCollidesWithGhostWeakenedStepsdefs {


    private Ghost ghost;
    private Pacman pacman;
    private int pacmanInitialPoints;

    @Given("^pacman with (\\d+) points and ghost weakened$")
    public void pacman_with_points_and_ghost_weakened(int pointsinitial) {
        pacmanInitialPoints = pointsinitial;
        pacman = new Pacman(pointsinitial);
        ghost = new Ghost(true);
        Assert.assertEquals(pointsinitial,pacman.getPoints());
        Assert.assertTrue(ghost.isWeakened());
    }

    @When("^pacman collides with ghost weakened$")
    public void pacman_collides_with_ghost_weakened() {
         pacman.eat(ghost);
    }

    @Then("^pacman not dies and ghost loses the body$")
    public void pacman_not_dies_and_ghost_loses_the_body() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(pacmanInitialPoints,pacman.getPoints());
        Assert.assertFalse(ghost.hasBody());
    }

}
