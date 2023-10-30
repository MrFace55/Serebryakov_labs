package packageFunctions;

import org.junit.jupiter.api.Test;
import packetFunctions.CosinesFunction;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CosinesFunctionTest {

    @Test
    public void testApply() {
        // Создание объекта CosineFunction
        CosinesFunction cosineFunction = new CosinesFunction();

        // Проверка для различных входных параметров
        assertEquals(1.0, cosineFunction.apply(0.0), 1e-10);  // cos(0) = 1
        assertEquals(0.0, cosineFunction.apply(Math.PI / 2), 1e-10);  // cos(pi/2) = 0
        assertEquals(-1.0, cosineFunction.apply(Math.PI), 1e-10);  // cos(pi) = -1
        assertEquals(0.5, cosineFunction.apply(Math.PI / 3), 1e-10);  // cos(pi/3) = 0.5
    }
}