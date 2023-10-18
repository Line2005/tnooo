package jpu2016.dogfight.model;

public class Plane extends Mobile{
    private final static int SPEED = 2;
    private final int WIDTH = 100;
    private final int HEIGHT = 30;
    private final String IMAGE = "plane";
    private int player;
    public Plane(Direction direction, Position position, Dimension dimension, int speed, String image) {
        super(direction, position, dimension, speed, image);
    }
    public boolean isPlayer() {
        return false;

    }
    public boolean hit() {
        return false;

    }
}
