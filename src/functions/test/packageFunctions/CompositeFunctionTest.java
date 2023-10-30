package packageFunctions;

import org.junit.jupiter.api.Test;
import packetFunctions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CompositeFunctionTest {
    //1) y=arcsin(sin(x))
    //2) y=cos(x)
    double[] xValuesArc = {0.0, Math.PI/6, Math.PI/4, Math.PI/3, Math.PI/2, 2*Math.PI/3, 3*Math.PI/4, 5*Math.PI/6, Math.PI};
    double[] yValuesArc = {0.0, Math.PI/6, Math.PI/4, Math.PI/3, Math.PI/2, 2*Math.PI/3, 3*Math.PI/4, 5*Math.PI/6, Math.PI};
    double[] xValuesCos = {0.0, Math.PI/6, Math.PI/4, Math.PI/3, Math.PI/2, 2*Math.PI/3, 3*Math.PI/4, 5*Math.PI/6, Math.PI};
    double[] yValuesCos = {1.0, 0.866025, 0.707107, 0.5, 0, -0.5, -0.707107, -0.866025, -1.0};

    MathFunction f = new CosinesFunction();
    MathFunction g = new ArcsinSinFunction();


}
