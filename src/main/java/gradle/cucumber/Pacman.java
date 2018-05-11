package gradle.cucumber;

public class Pacman {

    private Integer points;
  
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
        points += food.getPoints();
    }

    //TODO: Change this method to collide
    public void eat(Ghost ghost) {
        if(!ghost.isWeakened()) {
            this.points = 0;
        }
    }
}
