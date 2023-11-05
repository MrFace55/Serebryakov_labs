package packageFunctions;

import org.junit.jupiter.api.Test;
import packetFunctions.ArcsinSinFunction;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ArcsinSinFunctionTest {

    @Test
    public void testApply() {
        // Создание объекта CosineFunction
        ArcsinSinFunction arcsinsinFunction = new ArcsinSinFunction();

        // Проверка для различных входных параметров
        assertEquals(1.0, arcsinsinFunction.apply(1.0), 1e-10);  // arcsin(sin(1)) = 1
        assertEquals(Math.PI / 2, arcsinsinFunction.apply(Math.PI / 2), 1e-10);  // arcsin(sin(pi/2)) = pi/2
        assertEquals(0, arcsinsinFunction.apply(Math.PI), 1e-10);  // arcsin(sin(pi)) = 0
        assertEquals(Math.PI / 3, arcsinsinFunction.apply(Math.PI / 3), 1e-10);  // arcsin(sin(pi/3)) = pi/3
    }
}
