package Player;

import Behavior.IWeapon;
import GameBuildin.Enemy;

public abstract class Fighter extends Player{

    private IWeapon weapon;

    public Fighter(String name, int healthPoint,IWeapon weapon) {
        super(name, healthPoint);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public abstract void changeWeapon(IWeapon weapon);

    public abstract void attack(Enemy enemy);
}
