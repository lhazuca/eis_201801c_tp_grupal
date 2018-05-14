package gradle.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gradle.cucumber.Ghost;
import gradle.cucumber.Pacman;
import gradle.cucumber.Pellet;
import org.junit.Assert;

import java.util.ArrayList;

public class PacmanEatsPelletStepsdefs {

    private Ghost ghost;
    private Pacman pacman;

    @Given("^the pacman with (\\d+) points and ghost unweakened with (\\d+)$")
    public void the_pacman_with_points_and_ghost_unweakened_with(int initialPoints, int ghostLife) {
        ghost   = new Ghost(ghostLife);
        ArrayList<Ghost> ghosts = new ArrayList<>();
        ghosts.add(ghost);
        pacman  = new Pacman(initialPoints,ghosts);

        Assert.assertEquals(initialPoints, pacman.getPoints());
        Assert.assertEquals(ghostLife, ghost.getLifePoints());
    }

    @When("^pacman eats a pellet$")
    public void pacman_eats_a_pellet() {
        Pellet pellet = new Pellet(1);
        Assert.assertEquals(1,pellet.getDamagePoints());
        pacman.eat(pellet);
    }

    @Then("^the ghost gets weakened$")
    public void the_ghost_gets_weakened() {
        Assert.assertEquals(9, ghost.getLifePoints());
    }

}
