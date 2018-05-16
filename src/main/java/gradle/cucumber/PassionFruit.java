package gradle.cucumber;

public class PassionFruit extends Food {

    public PassionFruit(){

    }

    public void effect(Pacman pacman){
        pacman.fly();
    }
}
