package gradle.cucumber;

import java.util.ArrayList;
import java.util.List;

public class Pacman {

    private Integer points;
    private List<Ghost> ghosts = new ArrayList<Ghost>();

    public Pacman(){
        points = 0;
    }

    public Pacman(int pointsInitial) {
        this.points = pointsInitial;
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
        food.eatenBy(this);
    }

    //TODO: Change this method to collide
    public void eat(Ghost ghost) {
        if(!ghost.isWeakened()) {
            this.points = 0;
        }
    }

    public void addGhosts(List<Ghost> ghostsList) {
        this.ghosts = ghostsList;
    }

    public void weakenGhosts() {
        this.ghosts.forEach(ghost -> ghost.weaken());
    }
}
