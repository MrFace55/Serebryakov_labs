package packageFunctions;

import org.junit.jupiter.api.Test;
import packetFunctions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AndThenTest {
    @Test
    public void testApply() {
        MathFunction f = x -> x * 2;
        MathFunction g = x -> x + 3;
        MathFunction h = x -> Math.pow(x, 2);

        MathFunction complexFunction1 = f.AndThen(g).AndThen(h);
        assertEquals(14.0, complexFunction1.apply(2), 0.0001);

        MathFunction complexFunction2 = g.AndThen(h).AndThen(f);
        assertEquals(19.0, complexFunction2.apply(2), 0.0001);

        MathFunction complexFunction3 = h.AndThen(f).AndThen(g);
        assertEquals(100.0, complexFunction3.apply(2), 0.0001);
    }
}