package gradle.cucumber;

public class Biscuit extends Food{


    public Biscuit(int points) {
        this.points = points;
    }

    @Override
    public void eatenBy(Pacman pacman) {
        pacman.setPoints(pacman.getPoints() + this.points);
    }
}
