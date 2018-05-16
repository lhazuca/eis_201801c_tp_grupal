package gradle.cucumber;

public class Pellet extends Food {
    private int damagePoints;

    public Pellet(int damagePoints) {
        this.damagePoints = damagePoints;
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }

    public void effect(Pacman pacman){
        pacman.weakenGhosts(this);
    }
}
