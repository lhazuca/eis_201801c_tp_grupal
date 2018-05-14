package gradle.cucumber;

import java.util.ArrayList;

public class Pacman {

    private Integer points;
    private ArrayList<Ghost> recognizedGhosts;

    public Pacman() {
        points = 0;
    }

    public Pacman(int pointsInitial) {
        this.points = pointsInitial;
    }

    public Pacman(int pointsInitial, ArrayList<Ghost> recognizedGhosts) {
        this.points = pointsInitial;
        this.recognizedGhosts = recognizedGhosts;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void eat(Biscuit biscuit) {
        points += biscuit.getPoints();
    }

    public void eat(Food food) {
        points += food.getPoints();
    }

    public void collide(Ghost ghost) {
        if (!ghost.isWeakened()) {
            this.points = 0;
        }
    }

    public void eat(Pellet pellet) {
        recognizedGhosts.forEach(ghost -> ghost.damageBy(pellet.getDamagePoints()));
    }
}
