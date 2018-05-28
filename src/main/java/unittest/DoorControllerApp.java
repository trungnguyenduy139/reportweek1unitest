package main.java.unittest;

public class DoorControllerApp {
    public static void main(String[] args) {
        Controller controller = new Controller();
        DoorInjector doorInjector = new FrontDoorInjector();
        IDoor frontDoor1 = doorInjector.provideDoor(1); // inject door 1
        IDoor frontDoor2 = doorInjector.provideDoor(2); // inject door 2
        controller.openDoor(frontDoor1);
        System.out.println(frontDoor1.getDoorStateStringType());
        controller.closeDoor(frontDoor1);
        System.out.println(frontDoor1.getDoorStateStringType());
        controller.openDoor(frontDoor2);
        System.out.println(frontDoor2.getDoorStateStringType());
        controller.closeDoor(frontDoor2);
        System.out.println(frontDoor2.getDoorStateStringType());
        controller.openDoor(frontDoor2);
        System.out.println(frontDoor2.getDoorStateStringType());
    }
}
