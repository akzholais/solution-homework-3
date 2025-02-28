public class MUDBuilderDemo {
    public static void main(String[] args) {
        SimpleDungeonBuilder builder = new SimpleDungeonBuilder();
        Dungeon dungeon = builder.setDungeonName("Dark Cavern")
                .addRoom("Entrance Hall")
                .addRoom("Treasure Room")
                .addRoom("Boos cavern")
                .addNPC("Goblin King")
                .addTrap("Pitfall in Treasure Room")
                .addSecretPassage("Treasure Room", "Hidden Chamber")
                .build();

        dungeon.showDungeonInfo();
    }
}
