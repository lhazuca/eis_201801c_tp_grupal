package gradle.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gradle.cucumber.Ghost;
import gradle.cucumber.Pacman;
import org.junit.Assert;

public class PacmanCollidesWithBodylessGhost {
    private Pacman pacman;
    private Ghost bodylessGhost;
    private int initialPoints;

    @Given("^pacman with (\\d+) points and a bodyless ghost$")
    public void pacman_with_points_and_a_bodyless_ghost(int arg1) {
        this.pacman = new Pacman(arg1);
        this.bodylessGhost = new Ghost();
        bodylessGhost.body(false);
        this.initialPoints = arg1;
    }

    @When("^pacman collides with bodyless ghost$")
    public void pacman_collides_with_bodyless_ghost() {
        pacman.collide(bodylessGhost);
    }

    @Then("^pacman not dies$")
    public void pacman_not_dies() {
        Assert.assertEquals(initialPoints, pacman.getPoints());
    }
}
