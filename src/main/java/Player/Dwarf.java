package Player;

import Behavior.IWeapon;
import GameBuildin.Enemy;

public class Dwarf extends Fighter{

    public Dwarf(String name, int healthPoint, IWeapon weapon) {
        super(name, healthPoint, weapon);
    }

    public void changeWeapon(IWeapon weapon) {
        this.changeWeapon(weapon);
    }

    public void attack(Enemy enemy) {

    }

}
