package gradle.cucumber;

public class Biscuit extends Food{


    public Biscuit(int points) {
        this.points = points;
    }

    public void effect(Pacman pacman){
        pacman.addPoints(this.points);
    }

}
