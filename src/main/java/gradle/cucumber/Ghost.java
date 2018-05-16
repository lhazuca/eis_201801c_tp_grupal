package gradle.cucumber;

//TODO: Mejorar la forma de instanciar fantasmas.
public class Ghost {

    private int lifePoints;
    private boolean weakened = false;
    private boolean body = true;


    public Ghost(boolean b) {
        weakened = b;
    }

    public Ghost(int ghostLife) {
        lifePoints  = ghostLife;
    }

    public Ghost() {}

    public boolean isWeakened() {
        return weakened;
    }


    public boolean hasBody() {
        return body;
    }

    public void body(boolean state){
        body = state;
    }
  
    public int getLifePoints() {
        return lifePoints;
    }

    public void damageBy(int damagePoints) {
        lifePoints -= damagePoints;
        weakened    = true;
    }
}
