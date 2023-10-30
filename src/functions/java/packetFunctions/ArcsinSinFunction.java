package packetFunctions;

public class ArcsinSinFunction implements MathFunction{
    public double apply(double x) {
        return Math.asin(Math.sin(x));
    }
}
