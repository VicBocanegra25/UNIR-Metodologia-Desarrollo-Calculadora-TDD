package unir.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AdvancedMathEngineTest {
    final MathEngine engine = new StandardMathEngine();
    final double TOLERANCIA = 0.003;

    // Pruebas unitarias correspondientes a la raíz cuadrada.
    @Test
    @DisplayName("La raíz cuadrada de un número positivo debe ser correcta.")
    void testRaizCuadradaNumero() {
        double resultado = engine.calcularRaiz(16);

        assertEquals(4, resultado, TOLERANCIA,"La raíz cuadrada de 16 debe ser 4");
    }

    @Test
    @DisplayName("La raíz cuadrada de 1 es 1.")
    void testRaizCuadradaUno() {
        double resultado = engine.calcularRaiz(1);

        assertEquals(1, resultado, "La raíz cuadrada de 1 debe ser 1");
    }

    @Test
    @DisplayName("No se admiten números negativos por resultar en números imaginarios.")
    void testRaizCuadradaNumeroNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            engine.calcularRaiz(-4);
        }, "La raíz cuadrada de un número negativo debe lanzar IllegalArgumentException");

    }

    @Test
    @DisplayName("La raíz cuadrada de 2 debe tener una precisión superior a 10^-3.")
    void testRaizCuadradaDosPrecision() {
        double resultado = engine.calcularRaiz(2);

        assertEquals(1.414, resultado, 0.001, "La raíz de 2 debe ser aprox 1.414");
    }

    @Test
    @DisplayName("La raíz cuadrada de un número entre 0 y 1.")
    void testRaizCuadradaDecimal() {
        double resultado = engine.calcularRaiz(0.25);

        assertEquals(0.5, resultado, 0.001, "La raíz de 0.25 debe ser 0.5");
    }


    @Test
    @DisplayName("La raíz cuadrada de 0 debe ser 0.")
    void testRaizCuadradaCero() {
        double resultado = engine.calcularRaiz(0);

        assertEquals(0, resultado, 0.001, "La raíz cuadrada de 0 debe ser 0");
    }

    // Probando la función auxiliar para obtener valores absolutos.
    @Test
    @DisplayName("El valor absoluto de un número negativo es el mismo número pero positivo.")
    void testValorAbsoluto() {
        double resultado = engine.obtenerValorAbsoluto(-5);
        assertEquals(5, resultado, "El valor absoluto de -5 debe ser 5");
    }

    // Pruebas unitarias correspondientes a la exponenciación de e^x.
    @Test
    @DisplayName("La función exponencial e^x debe ser correcta y precisa.")
    void testExponencial() {
        // e^0 = 1
        assertEquals(1.0, engine.exponenciar(0), 0.001);
        // e^1 ≈ 2.718
        assertEquals(2.718, engine.exponenciar(1), 0.001);
        // e^2 ≈ 7.389
        assertEquals(7.389, engine.exponenciar(2), 0.001);
    }


}