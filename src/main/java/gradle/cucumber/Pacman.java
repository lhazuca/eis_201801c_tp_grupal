package gradle.cucumber;

public class Pacman {

    private Integer points;

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    public void eat(Biscuit biscuit) {
        points += biscuit.getPoints();
    }
    public Pacman(){
        points = 0;
    }

    public void eat(Fruit fruit) {
        points += fruit.value;
    }
}
