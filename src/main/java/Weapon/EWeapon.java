package Weapon;

public enum EWeapon {
    SWORD(4),
    AXE(3),
    CLUB(2);

    private final int value;

    EWeapon(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
