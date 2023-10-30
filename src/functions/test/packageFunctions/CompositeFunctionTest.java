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


//    @Test
//    public void testCompositeFunction() {
//
//        CompositeFunction h = new CompositeFunction(f,g); // Создаем сложную функцию h(x) = g(f(x))
//        assertEquals(-0.1833, h.apply(0.5), 0.0001); // Тестируем применение сложной функции
//        // В этом тесте мы ожидаем, что результат h(0.5) будет приближенно равен cos(cos(0.5) + cos(0.5))
//
//        CompositeFunction h1 = new CompositeFunction(testFunction1,testFunction2); // Создаем сложную функцию h(x) = g(f(x)) (список)
//        assertEquals(1.0, h1.apply(Math.PI/2), 0.0001);
//        // В этом тесте мы ожидаем, что результат h1(PI/2) будет приближенно равен cos(cos(PI/2) + cos(PI/2))
//    }
}
