package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel {
    public DogfightModel() {
    }
    public IArea getArea() {
        return null;
    }

    public void buildArea(Dimension dimension) {

    }

    public void addMobile(IMobile Mobile) {

    }

    public void removeMobile(IMobile Mobile) {

    }

    public ArrayList<IMobile> getMobiles() {
        return null;

    }

    public IMobile getMobileByPlayer(int player) {
        return null;

    }

    public void setMobilesHavesMoved() {

    }
}

