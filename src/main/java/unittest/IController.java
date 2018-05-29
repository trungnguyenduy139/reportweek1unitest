package main.java.unittest;

public interface IController {
    IDoor getDoor();
    void setDoor(IDoor door);
    void closeDoor();
    void openDoor();
    State getCurrentState();
}
