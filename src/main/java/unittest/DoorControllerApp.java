package main.java.unittest;

public class DoorControllerApp {
    public static void main(String[] args) {
        Controller controller = new Controller();
        DoorInjector doorInjector = new FrontDoorInjector();
        IDoor door = doorInjector.provideDoor(); // inject door
        controller.setDoor(door); // set door to controller
        System.out.println(door.getDoorStateStringType()); // default door state
        controller.openDoor();
        System.out.println(door.getDoorStateStringType());
        controller.closeDoor();
        System.out.println(door.getDoorStateStringType());
        controller.closeDoor();
        System.out.println(door.getDoorStateStringType());
        controller.openDoor();
        System.out.println(door.getDoorStateStringType());
    }
}
