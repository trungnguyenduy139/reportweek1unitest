package main.java.unittest;

public class ControllerFrontDoor extends ControllerImp {

    @Override
    public void closeDoor() {
        super.closeDoor();
        System.out.println("Front Door " + getDoor().getDoorId() +" Closed");
    }


    @Override
    public void openDoor() {
        super.openDoor();
        System.out.println("Front Door " + getDoor().getDoorId() +" Opened");
    }
}
