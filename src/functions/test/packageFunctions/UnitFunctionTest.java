package packageFunctions;

import org.junit.jupiter.api.Test;
import packetFunctions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitFunctionTest {
    private final UnitFunction UnitFunction = new UnitFunction();

    @Test
    public void testApply(){
        assertEquals(1.0, UnitFunction.apply(10.0), 0.000001);
    }
}