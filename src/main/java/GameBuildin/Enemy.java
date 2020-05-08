package GameBuildin;

public abstract class Enemy {
    private int healthPoint;
    private int damagePointFromPlayer;

    public Enemy(int healthPoint, int damagePointFromPlayer) {
        this.healthPoint = healthPoint;
        this.damagePointFromPlayer = damagePointFromPlayer;
    }

    public int takeDamage(){
        return this.damagePointFromPlayer;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }
}
