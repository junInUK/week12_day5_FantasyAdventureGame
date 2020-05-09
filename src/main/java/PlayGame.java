import GameBuildin.Enemy;
import GameBuildin.GameHall;
import GameBuildin.Room;
import GameBuildin.Treasure;
import Player.Fighter;
import Player.Player;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class PlayGame {

    public static void main(String[] args) {
        Fighter myCharacter;
        Room selectedRomm;
        Enemy enemyInRoom;
        System.out.println("Welcome to Jun's Fantasy Adventure Game Hall!");
        GameHall myGameHall = new GameHall();
        System.out.println("Please choose a character!");
        for(int i = 0; i<myGameHall.getFighters().size(); i++){
            Fighter fighter = myGameHall.getFighters().get(i);
            System.out.println(i+1 + ":"+fighter.getName()+ " " + fighter.getClass());
        }
        Scanner sc = new Scanner(System.in);
        int playerIndex = sc.nextInt();
        myCharacter = myGameHall.getFighters().get(playerIndex-1);
        System.out.println("Congratulation! Your character is: "+ myCharacter.getName() + " "+ myCharacter.getClass());
        System.out.println("Your health point is: "+myCharacter.getHealthPoint());
        System.out.println("Your attack point is: "+ myCharacter.getWeapon().getDamageValue());
        System.out.println("Please choose a room!");
        for(int i=0;i<myGameHall.getQuest().getRooms().size();i++){
            Room room = myGameHall.getQuest().getRooms().get(i);
            System.out.println(i+1 + ":"+room.getName());
        }
        int roomIndex = sc.nextInt();
        selectedRomm = myGameHall.getQuest().getRooms().get(roomIndex-1);
        System.out.println("Congratulation! The room you selected is: "+ selectedRomm.getName());
        System.out.println("Do you wish to enter? Please choose 1: yes/ 0: no");
        int choice = sc.nextInt();
        if(1 == choice){
            System.out.println("You are lucky! You found treasures below!");
            for(int i=0;i<selectedRomm.getTreasures().size();i++){
                Treasure treasure = selectedRomm.getTreasures().get(i);
                System.out.println(i+1 + " " + treasure.getName() + " value:"+ treasure.getValue() + " weight:" + treasure.getWeight());
            }
            System.out.println("Don't forget! Beat your enemy before you collect the treasures!");
            enemyInRoom = selectedRomm.getEnemy();
            System.out.println("Your enemy class: "+ enemyInRoom.getClass() + " health point: " + enemyInRoom.getHealthPoint() + " attack power:" + enemyInRoom.getDamagePointFromPlayer());
            while(!myCharacter.isDead()&&!enemyInRoom.isDead()){
                myCharacter.attack(enemyInRoom);
            }
            if(enemyInRoom.isDead()){
                myCharacter.collectTreasures(selectedRomm.getTreasures());
            }
            System.out.println("After battle, your health point is:"+myCharacter.getHealthPoint());
            System.out.println("You got treasures below:");
            for(Treasure treasure : myCharacter.getInventory()){
                System.out.println(treasure.getName() + " value:"+treasure.getValue()+ " weight:"+treasure.getWeight());
            }
        }
    }
}
