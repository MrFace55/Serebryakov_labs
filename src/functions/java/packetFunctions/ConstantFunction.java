package packetFunctions;

public class ConstantFunction implements MathFunction {
    private final double constantNum;

    public ConstantFunction(double constNum) {
        this.constantNum = constNum;
    }

    public double apply(double x) {
        return constantNum;
    } // возвращает всегда одно и то же число
}