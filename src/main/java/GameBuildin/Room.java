package GameBuildin;

import java.util.ArrayList;

public class Room {
    private String name;
    private Exit exit;
    private ArrayList<Treasure> treasures;
    private Enemy enemy;

    public Room(String name, Exit exit, ArrayList<Treasure> treasures, Enemy enemy) {
        this.name = name;
        this.exit = exit;
        this.treasures = treasures;
        this.enemy = enemy;
    }

    public String getName() {
        return name;
    }

    public Exit getExit() {
        return exit;
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public Enemy getEnemy() {
        return enemy;
    }
}
