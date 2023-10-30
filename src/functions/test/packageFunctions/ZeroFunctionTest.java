package packageFunctions;

import org.junit.jupiter.api.Test;
import packetFunctions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ZeroFunctionTest {

    private final ZeroFunction ZeroFunction = new ZeroFunction();
    @Test
    public void testApply(){
        assertEquals(0.0, ZeroFunction.apply(10.0), 0.000001);
    }
}