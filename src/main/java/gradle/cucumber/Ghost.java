package gradle.cucumber;

public class Ghost {

    private int lifePoints;
    private boolean weakened;
    private boolean body;


    public Ghost(boolean b) {
        weakened = b;
        body = true;
    }
  
    public Ghost() {
        weakened = false;
    }

    public Ghost(int ghostLife) {
        lifePoints  = ghostLife;
        weakened    = false;
    }

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
