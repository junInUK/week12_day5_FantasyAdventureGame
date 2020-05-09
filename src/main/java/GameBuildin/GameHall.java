package GameBuildin;

import Weapon.Club;
import Player.Player;
import Player.Fighter;
import Player.Barbarian;

import java.util.ArrayList;
import java.util.Random;

public class GameHall {
    private Quest quest;
    private ArrayList<Fighter> fighters;

    public GameHall() {
        int pick = new Random().nextInt(Exit.values().length);
        Exit exit = Exit.values()[pick];
        GoldCoin goldCoin = new GoldCoin("Gold Coin",5,5);
        ArrayList<Treasure> treasures = new ArrayList<Treasure>();
        treasures.add(goldCoin);
        Enemy troll = new Troll(10,2);
        Room lochness = new Room("Loch Ness",exit,treasures,troll);
        ArrayList<Room> rooms = new ArrayList<Room>();
        rooms.add(lochness);
        this.quest = new Quest(rooms);
        Club club = new Club();
        Barbarian barbarian = new Barbarian("barbarian",20,club);
        this.fighters = new ArrayList<Fighter>();
        fighters.add(barbarian);
    }

    public Quest getQuest() {
        return quest;
    }

    public ArrayList<Fighter> getFighters() {
        return fighters;
    }
}
