package Weapon;

import Behavior.IWeapon;
import GameBuildin.Enemy;

public class Sword implements IWeapon {

    public Sword() {

    }

    public int getDamageValue() {
        return EWeapon.SWORD.getValue();
    }
}
