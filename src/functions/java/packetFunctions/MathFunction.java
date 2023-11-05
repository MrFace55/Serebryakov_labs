package packetFunctions;

public interface MathFunction {
    double apply(double x);

    default CompositeFunction AndThen(MathFunction afterFunction) {
        return new CompositeFunction(afterFunction, this);
    }
}
