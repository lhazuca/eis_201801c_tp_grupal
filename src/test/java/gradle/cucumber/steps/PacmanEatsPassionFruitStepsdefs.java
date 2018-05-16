package gradle.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gradle.cucumber.Ghost;
import gradle.cucumber.Pacman;
import gradle.cucumber.PassionFruit;
import gradle.cucumber.Pellet;
import org.junit.Assert;

import java.util.ArrayList;

public class PacmanEatsPassionFruitStepsdefs {

    private Ghost ghost;
    private Pacman pacman;

    @Given("^the pacman with (\\d+) points and ghost with (\\d+)$")
    public void the_pacman_with_points_and_ghost_with(int initialPoints, int ghostLife) {
        ghost   = new Ghost(ghostLife);
        ArrayList<Ghost> ghosts = new ArrayList<>();
        ghosts.add(ghost);
        pacman  = new Pacman(initialPoints,ghosts);

        Assert.assertEquals(initialPoints, pacman.getPoints());
        Assert.assertEquals(ghostLife, ghost.getLifePoints());
    }

    @When("^pacman eats a passion fruit and then collides with a gost$")
    public void pacman_eats_a_passion_fruit_and_then_collides_with_a_ghost() {
        PassionFruit passionFruit = new PassionFruit();
        pacman.eat(passionFruit);
        pacman.collide(ghost);
    }

    @Then("^the pacman has (\\d+) points and the ghost has (\\d+) points$")
    public void the_pacman_has_points_and_the_ghost_has_points(int initialPoints, int ghostLife) {
        Assert.assertEquals(initialPoints, pacman.getPoints());
        Assert.assertEquals(ghostLife, ghost.getLifePoints());
    }
}
