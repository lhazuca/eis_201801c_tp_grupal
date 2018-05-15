package gradle.cucumber;

public class Fruit extends Food{

    public Fruit(int points){
        this.points = points;
    }

    @Override
    public void eatenBy(Pacman pacman) {
        pacman.setPoints(pacman.getPoints() + this.points);
    }
}
