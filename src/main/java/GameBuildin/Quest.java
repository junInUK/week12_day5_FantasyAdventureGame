package GameBuildin;

import java.util.ArrayList;

public class Quest {
    private ArrayList<Room> rooms;

    public Quest(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void removeRoom(Room room){
        this.rooms.remove(room);
    }
}
