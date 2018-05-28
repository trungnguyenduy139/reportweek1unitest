package main.java.unittest;

public class DoorControllerApp {
    public static void main(String[] args) {
        Controller controller = new Controller();
        DoorInjector doorInjector = new FrontDoorInjector();
        IDoor door = doorInjector.provideDoor();
        controller.setDoor(door);
        controller.openDoor();
        System.out.println(door.getState() == State.OPENED? "OPEN" : "CLOSE");
        controller.closeDoor();
        System.out.println(door.getState() == State.OPENED? "OPEN" : "CLOSE");
        controller.closeDoor();
        System.out.println(door.getState() == State.OPENED? "OPEN" : "CLOSE");
        controller.openDoor();
        System.out.println(door.getState() == State.OPENED? "OPEN" : "CLOSE");
    }
}
