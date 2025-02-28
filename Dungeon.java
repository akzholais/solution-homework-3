import java.util.List;
import java.util.Map;

public class Dungeon {
    private String name;
    private List<String> rooms;
    private List<String> npcs;
    private List<String> traps;
    private Map<String, String> secretPassages;

    public Dungeon(String name, List<String> rooms, List<String> npcs, List<String> traps, Map<String, String> secretPassages) {
        this.name = name;
        this.rooms = rooms;
        this.npcs = npcs;
        this.traps = traps;
        this.secretPassages = secretPassages;
    }

    public void showDungeonInfo() {
        System.out.println("Dungeon: " + name);
        System.out.println("Rooms: " + rooms);
        System.out.println("NPCs: " + npcs);
        System.out.println("Traps: " + traps);
        System.out.println("Secret Passages: " + secretPassages);
    }
}