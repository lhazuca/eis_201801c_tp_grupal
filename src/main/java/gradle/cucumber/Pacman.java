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

    public void eat(Fruit fruit) {
        points += fruit.value;
    }

    public void eat(Ghost ghost) {
        this.points = 0;
    }
}
