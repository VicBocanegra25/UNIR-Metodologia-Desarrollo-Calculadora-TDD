package unir;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

        assertEquals(3, resultado, "La resta de -5 y -8 debe ser 3");
    }

    @Test
    @DisplayName("La resta de dos números negativos debe ser correcta y el resultado negativo.")
    void testRestarNumerosNegativos2() {
        double resultado = engine.restar(-5, -3);

        assertEquals(-2, resultado, "La resta de -5 y -3 debe ser -2");
    }

    @Test
    @DisplayName("La resta de a - b no es lo mismo que b - a")
    void testRestarPropiedadAsimetria() {
        double resultado = engine.restar(5, 3);
        double resultado2 = engine.restar(3, 5);

        assertNotEquals(resultado, resultado2, "La resta de 5 y 3 no es lo mismo que la resta de 3 y 5.");
    }

    // Pruebas unitarias correspondientes a la multiplicación
    @Test
    @DisplayName("La multiplicación de dos números positivos debe ser correcta y positiva.")
    void testMultiplicarNumerosPositivos() {
        double resultado = engine.multiplicar(5, 3);

        assertEquals(15, resultado, "La multiplicación de 5 y 3 debe ser 15");
    }

    @Test
    @DisplayName("La multiplicación de un número positivo por uno negativo debe ser correcta y negativa.")
    void testMultiplicarNumeroPositivoPorNegativo() {
        double resultado = engine.multiplicar(5, -3);

        assertEquals(-15, resultado, "La multiplicación de 5 y -3 debe ser -15");
    }

    @Test
    @DisplayName("La multiplicación de dos números negativos debe ser positiva.")
    void testMultiplicarNumerosNegativos() {
        double resultado = engine.multiplicar(-5, -3);

        assertEquals(15, resultado, "La multiplicación de -5 y -3 debe ser 15");
    }

    @Test
    @DisplayName("La multiplicación de un número por 1 debe resultar el mismo número.")
    void testMultiplicarNumeroPorUno() {
        double resultado = engine.multiplicar(5, 1);

        assertEquals(5, resultado, "El resultado de multiplicar 5 por 1 debe ser 5");
    }

    @Test
    @DisplayName("La multiplicación de un número por 0 debe ser 0.")
    void testMultiplicarNumeroPorCero() {
        double resultado = engine.multiplicar(5, 0);

        assertEquals(0, resultado, "El resultado de multiplicar 5 por 0 debe ser 0");
    }

    // Pruebas unitarias correspondientes a la división
    @Test
    @DisplayName("La división de dos números positivos debe ser correcta y positiva.")
    void testDividirNumerosPositivos() {
        double resultado = engine.dividir(10, 2);

        assertEquals(5, resultado, "La división de 10 por 2 debe ser 5");
    }

    @Test
    @DisplayName("La división de un número positivo por uno negativo debe ser correcta y negativa.")
    void testDividirNumeroPositivoPorNegativo() {
        double resultado = engine.dividir(10, -2);

        assertEquals(-5, resultado, "La división de 10 por -2 debe ser -5");
    }

    @Test
    @DisplayName("La división de dos números negativos debe ser correcta y positiva.")
    void testDividirNumerosNegativos() {
        double resultado = engine.dividir(-10, -2);

        assertEquals(5, resultado, "La división de -10 por -2 debe ser 5");
    }

    @Test
    @DisplayName("La división de un número por 1 debe ser el mismo número.")
    void testDividirNumeroPorUno() {
        double resultado = engine.dividir(10, 1);

        assertEquals(10, resultado, "La división de 10 por 1 debe ser 10");
    }

    @Test
    @DisplayName("La división de un número por sí mismo da como resultado 1.")
    void testDividirNumeroPorMismoNumero() {
        double resultado = engine.dividir(10, 10);

        assertEquals(1, resultado, "La división de 10 por 10 debe ser 1");
    }

    @Test
    @DisplayName("La división de un número por 0 es indefinida y resulta en una excepción.")
    void testDividirNumeroPorZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> engine.dividir(10, 0));

        assertEquals("No se puede dividir por cero", exception.getMessage());
    }
}
