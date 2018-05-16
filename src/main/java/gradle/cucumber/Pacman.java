package gradle.cucumber;

import java.util.ArrayList;

public class Pacman {

    private Integer points;
    private boolean floating;
    private ArrayList<Ghost> recognizedGhosts;

    public Pacman() {
        this.points = 0;
        this.floating = false;
    }

    public Pacman(int pointsInitial) {
        this.points = pointsInitial;
        this.floating = false;
    }

    public Pacman(int pointsInitial, ArrayList<Ghost> recognizedGhosts) {
        this.points = pointsInitial;
        this.floating = false;
        this.recognizedGhosts = recognizedGhosts;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void eat(Food food) {
        food.effect(this);
    }


    //TODO: Change this method to collide
    public void eat(Ghost ghost) {
        if(ghost.isWeakened() && !this.floating) {
            ghost.body(false);
        }
        else{}
    }

          
    public void collide(Ghost ghost) {
        if (ghost.hasBody() && !ghost.isWeakened() && !this.floating) {
            this.points = 0;
        }
    }

    public void addPoints(int points){
        this.points = this.points + points;
    }

    public void weakenGhosts(Pellet pellet){
        this.recognizedGhosts.forEach(ghost -> ghost.damageBy(pellet.getDamagePoints()));
    }

    public void fly(){
        this.floating = true; }
}
