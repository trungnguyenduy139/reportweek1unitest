package main.java.unittest;

public class DoorControllerApp {
    public static void main(String[] args) {
        IController controllerBackDoor = new ControllerBackDoor();
        ControllerManager manager = new ControllerManager(controllerBackDoor);
        manager.openDoor();
        manager.setController(controllerBackDoor);
        manager.closeDoor();
        IDoor door2 = new DoorInjectorImp().provideDoor(2);
        manager.setDoor(door2);
        manager.openDoor();

        IController controllerFrontDoor = new ControllerFrontDoor();
        manager.setController(controllerFrontDoor);
        manager.openDoor();
    }
}
