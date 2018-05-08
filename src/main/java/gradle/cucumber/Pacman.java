package gradle.cucumber;

public class Pacman {

    Integer points;

    public Pacman(){
        points = 0;
    }

    public void eat(Fruit fruit) {
        points += fruit.value;
    }
}
