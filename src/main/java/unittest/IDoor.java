package main.java.unittest;

public interface IDoor {
    State getState();
    int getDoorId();
    String getDoorName();
    void setDoorState(State state);
    String getDoorStateStringType();
}
