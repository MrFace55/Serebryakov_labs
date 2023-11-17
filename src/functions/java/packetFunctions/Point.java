package packetFunctions;

public class Point {
    public final double x;
    public final double y;

    public Point(double newX, double newY) {
        this.x = newX;
        this.y = newY;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }
}