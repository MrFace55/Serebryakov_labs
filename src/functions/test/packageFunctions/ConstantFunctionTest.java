package packageFunctions;

import org.junit.jupiter.api.Test;
import packetFunctions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ConstantFunctionTest {
    private final ConstantFunction ConstantFunction = new ConstantFunction(5);

    @Test
    public void testApply(){
        assertEquals(5.0, ConstantFunction.apply(-10.0), 0.000001);
        assertEquals(5.0, ConstantFunction.apply(11.0), 0.000001);
    }
}
