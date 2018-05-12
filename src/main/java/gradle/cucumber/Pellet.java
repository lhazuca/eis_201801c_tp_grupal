package gradle.cucumber;

public class Pellet {
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
}
