package main.java.unittest;

public class ControllerBackDoor extends ControllerImp {

    @Override
    public void closeDoor() {
        super.closeDoor();
        System.out.println("Back Door " + getDoor().getDoorId() +" Closed");
    }


    @Override
    public void openDoor() {
        super.openDoor();
        System.out.println("Back Door " + getDoor().getDoorId() +" Opened");
    }
}
