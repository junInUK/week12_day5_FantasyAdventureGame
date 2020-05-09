package Player;

import GameBuildin.Treasure;

import java.util.ArrayList;

public abstract class Player {
    private String name;
    private int healthPoint;
    private ArrayList<Treasure> Inventory;
    private int carryWeight;

    public Player(String name, int healthPoint) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.Inventory = new ArrayList<Treasure>();
        this.carryWeight = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public ArrayList<Treasure> getInventory() {
        return Inventory;
    }

    public int getCarryWeight() {
        return carryWeight;
    }

    public boolean isDead(){
        return 0 == this.healthPoint? true:false;
    }

    public void collectTreasures(ArrayList<Treasure> treasures){
        for(Treasure treasure : treasures){
            this.Inventory.add(treasure);
        }
    }
}
