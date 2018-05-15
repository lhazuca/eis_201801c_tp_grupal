package gradle.cucumber;


public class Pellet extends Food {
  
  private int damagePoints;
  
  public Pellet(int damagePoints) {
      this.damagePoints = damagePoints;
  }
  
    @Override
    public Integer getPoints() {
        return 0;
    }

    @Override
    public void eatenBy(Pacman pacman) {
        pacman.weakenGhosts();
    }


    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;

    }
}
