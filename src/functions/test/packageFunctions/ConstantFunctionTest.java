package packageFunctions;

import org.junit.jupiter.api.Test;
import packetFunctions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ConstantFunctionTest {
    private final ConstantFunction ConstantFunction = new ConstantFunction(5);
    private final ZeroFunction ZeroFunction = new ZeroFunction();
    private final UnitFunction UnitFunction = new UnitFunction();

    @Test
    public void testApply(){
        assertEquals(5.0, ConstantFunction.apply(-10.0), 0.000001);
        assertEquals(5.0, ConstantFunction.apply(11.0), 0.000001);
        assertEquals(0.0, ZeroFunction.apply(10.0), 0.000001);
        assertEquals(1.0, UnitFunction.apply(111.0), 0.000001);

    }
}
