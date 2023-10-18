package jpu2016.dogfight.model;

public class Missile extends Mobile {

    private final static int SPEED = 4;
    private final int WIDTH = 30;
    private final int HEIGHT = 10;
    private final int MAX_DISTANCE_TREAVELED = 1400;
    private final static String IMAGE = "missile";
    private final int distanceTraveled = 0;

    public Missile(Direction direction, Position position, Dimension dimension, int speed, String image) {
        super(direction, position, dimension, speed, image);
    }

    public Missile(Direction direction, Dimension dimension) {
        super(direction, null, dimension, SPEED, IMAGE);
    }
    public final int getWidthWithADirection(Direction direction) {
        return WIDTH;

    }

    public final int getHeightWithADirection(Direction direction) {
        return HEIGHT;

    }

    public void move() {

    }

    public boolean isWeapon() {
        return false;

    }

}
