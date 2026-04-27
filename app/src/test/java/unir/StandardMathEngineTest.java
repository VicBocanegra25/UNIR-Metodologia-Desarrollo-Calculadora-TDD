package unir;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StandardMathEngineTest {

    @Test
    @DisplayName("La suma de dos números positivos debe ser correcta y el resultado positivo.")
    void testSumarNumerosPositivos() {
        MathEngine engine = new StandardMathEngine();
        double resultado = engine.sumar(2.5, 3);

        assertEquals(5.5, resultado, "La suma de 2.5 y 3 debe ser 5.5");
    }
}
