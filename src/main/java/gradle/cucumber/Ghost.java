package gradle.cucumber;

public class Ghost {

    private int lifePoints;
    private boolean weakened;

    public Ghost() {
        weakened = false;
    }

    public Ghost(int ghostLife) {
        lifePoints  = ghostLife;
        weakened    = false;
    }

    public boolean isWeakened() {
        return weakened;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void damageBy(int damagePoints) {
        lifePoints -= damagePoints;
        weakened    = true;
    }
}
