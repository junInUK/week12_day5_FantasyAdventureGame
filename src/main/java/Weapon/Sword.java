package Weapon;

import Behavior.IWeapon;
import GameBuildin.Enemy;

public class Sword implements IWeapon {

    private int damageValue;

    public Sword(int damageValue) {
        this.damageValue = damageValue;
    }

    public void attack(int damageValue, Enemy enemy) {
        if(enemy.getHealthPoint() >= this.damageValue){
            enemy.setHealthPoint(enemy.getHealthPoint() - this.damageValue);
        }else{
            enemy.setHealthPoint(0);
            System.out.println("Enemy died!Contrulation!");
        }
    }
}
