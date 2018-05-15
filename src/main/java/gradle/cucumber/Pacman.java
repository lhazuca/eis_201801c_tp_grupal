package gradle.cucumber;

import java.util.ArrayList;
import java.util.List;

public class Pacman {

    private Integer points;
    private List<Ghost> recognizedGhosts = new ArrayList<Ghost>();

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
        food.eatenBy(this);
    }

    public void collide(Ghost ghost) {
        if (!ghost.isWeakened()) {
            this.points = 0;
        }
    }


    public void addGhosts(List<Ghost> ghostsList) {
        this.recognizedGhosts = ghostsList;
    }

    public void weakenGhosts() {
        this.recognizedGhosts.forEach(ghost -> ghost.weaken());
    }
  
    public void eat(Pellet pellet) {
        recognizedGhosts.forEach(ghost -> ghost.damageBy(pellet.getDamagePoints()));
    }
}
