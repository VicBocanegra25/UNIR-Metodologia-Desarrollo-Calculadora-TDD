package unir;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class StandardMathEngineTest {

    final MathEngine engine = new StandardMathEngine();

    // Pruebas unitarias correspondientes al método de suma.

    @Test
    @DisplayName("La suma de dos números positivos debe ser correcta y el resultado positivo.")
    void testSumarNumerosPositivos() {
        double resultado = engine.sumar(2.5, 3);

        assertEquals(5.5, resultado, "La suma de 2.5 y 3 debe ser 5.5");
    }

    @Test
    @DisplayName("La suma de dos números negativos debe ser correcta y el resultado negativo.")
    void testSumarNumerosNegativos() {
        double resultado = engine.sumar(-2.5, -3);

        assertEquals(-5.5, resultado, "La suma de -2.5 y -3 debe ser -5.5");
    }

    @Test
    @DisplayName("La suma de un sumando y el 0 debe ser igual al mismo sumando.")
    void testSumarUnSumandoYCero() {
        double resultado = engine.sumar(5, 0);

        assertEquals(5, resultado, "La suma de 5 y 0 debe ser 5");
    }

    @Test
    @DisplayName("La suma de un número positivo con uno negativo debe ser correcta y el resultado positivo.")
    void testSumarNumeroPositivoConUnoNegativo() {
        double resultado = engine.sumar(5, -3);

        assertEquals(2, resultado, "La suma de 5 y -3 debe ser 2");
    }

    @Test
    @DisplayName("La suma de un número positivo con uno negativo debe ser correcta y el resultado negativo.")
    void testSumarNumeroNegativoConUnoPositivo() {
        double resultado = engine.sumar(-5, 3);

        assertEquals(-2, resultado, "La suma de -5 y 3 debe ser -2");
    }

    @Test
    @DisplayName("La suma de a + b debe ser igual que b + a.")
    void testPropiedadSumaConmutativa() {
        double resultado = engine.sumar(5, 3);
        double resultado2 = engine.sumar(3, 5);

        assertEquals(resultado, resultado2, "La suma de 5 y 3 debe ser igual que la suma de 3 y 5");
    }

    // Pruebas unitarias correspondientes al método de resta
    @Test
    @DisplayName("La resta de dos números positivos debe ser correcta y positiva.")
    void testRestarNumerosPositivos() {
        double resultado = engine.restar(5, 3);

        assertEquals(2, resultado, "La resta de 5 y 3 debe ser 2");
    }

    @Test
    @DisplayName("La resta de dos números (positivo y positivo) debe ser correcta y negativa.")
    void testRestarNumerosPositivoYNegativo() {
        double resultado = engine.restar(5, 8);

        assertEquals(-3, resultado, "La resta de 5 y 8 debe ser -3");
    }

    @Test
    @DisplayName("La resta de un número positivo y el mismo número debe ser 0.")
    void testRestarNumeroPositivoYIgual() {
        double resultado = engine.restar(5, 5);

        assertEquals(0, resultado, "La resta de 5 y 5 debe ser 0");
    }

    @Test
    @DisplayName("La resta de dos números negativos debe ser correcta y el resultado positivo.")
    void testRestarNumerosNegativos() {
        double resultado = engine.restar(-5, -8);

        assertEquals(-2, resultado, "La resta de -5 y -8 debe ser 3");
    }

    @Test
    @DisplayName("La resta de dos números negativos debe ser correcta y el resultado negativo.")
    void testRestarNumerosNegativos2() {
        double resultado = engine.restar(-5, -3);

        assertEquals(2, resultado, "La resta de -5 y -3 debe ser -2");
    }

    @Test
    @DisplayName("La resta de a - b no es lo mismo que b - a")
    void testRestarPropiedadAsimetria() {
        double resultado = engine.restar(5, 3);
        double resultado2 = engine.restar(3, 5);

        assertNotEquals(resultado, resultado2, "La resta de 5 y 3 no es lo mismo que la resta de 3 y 5.");
    }


}
