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

    public int getDamagePointFromPlayer() {
        return damagePointFromPlayer;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void loseHealthPoint(int damageValue){
        if(this.healthPoint >= damageValue){    //  can afford this damage
            this.healthPoint -= damageValue;
        }else{  //  cannot afford this damage, will die
            this.healthPoint = 0;
            System.out.println("Enemy died!");
        }
    };

    public boolean isDead(){
        if(0 == this.healthPoint){
            System.out.println("Enemy died!");
            return true;
        }else{
            return false;
        }
    }
}
