package compositionAggregAndAssociation.composition;

//    Composition is a “belongs-to” type of relationship. It means that one of the objects is a logically larger structure, which contains the other object.
//    In other words, it's part or member of the other object.
//we often call it a “has-a” relationship (as opposed to an “is-a” relationship, which is inheritance).


//Example = Room, Building

//the objects' lifecycles are tied. It means that if we destroy the owner object, its members also will be destroyed with it

//Note that doesn't mean, that the containing object can't exist without any of its parts. For example, we can tear down all the walls inside a building, hence destroy the rooms. But the building will still exist
//
// Represented via a diamond as opposed to an arrow-head in UML diagrams.


//Note, that it's essential, that our inner class should be non-static since it binds all of its instances to the containing class.
//
//Usually, the containing object wants to access its members. Therefore, we should store their references:

import java.util.List;

public class Building {

    private String address;
    private List<Room> rooms;

    public class Room {

        public String getBuildingAddress() {
            return Building.this.address;
        }

    }

}

class BuildingWithDefinitionRoomInMethod {

    public Room createAnonymousRoom() {
        return new Room() {
            @Override
            public void doInRoom() {}
        };
    }

    public Room createInlineRoom() {
        class InlineRoom implements Room {
            @Override
            public void doInRoom() {}
        }
        return new InlineRoom();
    }

    public Room createLambdaRoom() {
        return () -> {};
    }

    public interface Room {
        void doInRoom();
    }

}