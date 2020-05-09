package Weapon;

import Behavior.IWeapon;

public class Club implements IWeapon {

    public Club() {
    }

    public int getDamageValue() {
        return EWeapon.CLUB.getValue();
    }
}
