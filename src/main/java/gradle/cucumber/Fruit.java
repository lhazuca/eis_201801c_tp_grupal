package gradle.cucumber;

public class Fruit extends Food{

    public Fruit(int points){
        this.points = points;
    }

    public void effect(Pacman pacman){
        pacman.addPoints(this.points);
    }
}
