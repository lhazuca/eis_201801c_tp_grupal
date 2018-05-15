package gradle.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gradle.cucumber.Ghost;
import gradle.cucumber.Pacman;
import gradle.cucumber.Pellet;
import org.junit.Assert;

import java.util.Arrays;
import java.util.List;

public class PacmanEatsPelletStepsDefs {
    public Pacman pacman;
    public Pellet pellet;
    public Ghost ghost1;
    public Ghost ghost2;
    public Ghost ghost3;
    public Ghost ghost4;
    private List<Ghost> ghostsList;

    @Given("^the pacman whit (\\d+) points and unweakened ghosts$")
    public void the_pacman_whit_points_and_unweakened_ghosts(int arg1) {
        pacman = new Pacman(0);
        pellet = new Pellet();
        ghost1 = new Ghost(false);
        ghost2 = new Ghost(false);
        ghost3 = new Ghost(false);
        ghost4 = new Ghost(false);
        ghostsList = Arrays.asList(ghost1, ghost2, ghost3, ghost4);
        pacman.addGhosts(ghostsList);
    }

    @When("^the pacman eats a pellet$")
    public void the_pacman_eats_a_pellet() {
        pacman.eat(pellet);
    }

    @Then("^all ghosts get weakened$")
    public void all_ghosts_get_weakened() {
        Assert.assertTrue(ghost1.isWeakened());
        Assert.assertTrue(ghost2.isWeakened());
        Assert.assertTrue(ghost3.isWeakened());
        Assert.assertTrue(ghost4.isWeakened());
    }
}
