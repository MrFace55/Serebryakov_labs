package packageFunctions;

import org.junit.jupiter.api.Test;
import packetFunctions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class IdentityFunctionTest {
    @Test
    public void testApply() {
        MathFunction f = new IdentityFunction();
        assertEquals(0.0, f.apply(0.0), 0.0);
        assertEquals(1.0, f.apply(1.0), 0.0);
        assertEquals(-1.0, f.apply(-1.0), 0.0);
        assertEquals(42.42, f.apply(42.42), 0.0);
    }
}
