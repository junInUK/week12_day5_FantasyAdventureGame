package Player;

import Behavior.IWeapon;
import GameBuildin.Enemy;

public class Barbarian extends Fighter{

    public Barbarian(String name, int healthPoint, IWeapon weapon) {
        super(name, healthPoint, weapon);
    }

    public void changeWeapon(IWeapon weapon) {
        this.changeWeapon(weapon);
    }

    public void attack(Enemy enemy) {
        if(this.getHealthPoint() >= enemy.takeDamage()){
            this.setHealthPoint(this.getHealthPoint() - enemy.takeDamage());
        }else{
            this.setHealthPoint(0);
            System.out.println("You died!Game over!");
        }

    }
}
