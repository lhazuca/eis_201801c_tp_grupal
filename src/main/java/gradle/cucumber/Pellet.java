package gradle.cucumber;

public class Pellet extends Food {
    @Override
    public Integer getPoints() {
        return 0;
    }

    @Override
    public void eatenBy(Pacman pacman) {
        pacman.weakenGhosts();
    }
}
