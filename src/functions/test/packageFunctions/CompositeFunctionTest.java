package packageFunctions;

import org.junit.jupiter.api.Test;
import packetFunctions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CompositeFunctionTest {
    @Test
    public void testCompositeFunction() {
        // Создаем сложные функции
        MathFunction f = new CosinesFunction();
        MathFunction g = new ArcsinSinFunction();

        // Создаем сложную функцию h(x) = g(f(x))
        CompositeFunction h = new CompositeFunction(f,g);

        // Тестируем применение сложной функции
        assertEquals(0.8660254037844386, h.apply(Math.PI/6), 1e-10);
        assertEquals(-1.0, h.apply(Math.PI), 1e-10);
        assertEquals(0.5, h.apply(Math.PI/3), 1e-10);
        assertEquals(0.0, h.apply(Math.PI/2), 1e-10);

    }
}
