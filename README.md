# solution-homework-3
Aisabek Akzhol 

Hello teacher, I chose Assignment 1.

Dungeon Builder – Assignment 1
This project is an implementation of the Builder Pattern for creating a Dungeon with different rooms, NPCs, traps, and secret passages.

Project Structure

IDungeonBuilder.java – Interface defining the builder methods.
SimpleDungeonBuilder.java – Concrete builder for constructing a Dungeon step by step.
Dungeon.java – The product class representing the dungeon.
MUDBuilderDemo.java – Demonstration class that shows how to use the builder.
Features

✔ Step-by-step dungeon creation using Builder Pattern
✔ Supports adding rooms, NPCs, traps, and secret passages
✔ Demonstration of the builder in action

Extra Credit:
✅ Traps can be added to rooms
✅ Secret passages between rooms are supported

Output:
Dungeon: Dark Cavern
Rooms: [Entrance Hall, Treasure Room, Boos cavern]
NPCs: [Goblin King]
Traps: [Pitfall in Treasure Room]
Secret Passages: {Treasure Room=Hidden Chamber}

Scalability and Extensibility
This implementation allows for easy expansion by adding multiple rooms, NPCs, traps, and secret passages.

For example, if you want to add more rooms and NPCs, you can simply extend the builder:
Dungeon dungeon = builder.setDungeonName("Dark Cavern")
                .addRoom("Entrance Hall")
                .addRoom("Treasure Room")
                .addRoom("Boos cavern")
                .addNPC("Goblin King")
                .addTrap("Pitfall in Treasure Room")
                .addSecretPassage("Treasure Room", "Hidden Chamber")
                .build();                
                
This flexibility ensures that the Builder can adapt to more complex dungeon designs.
