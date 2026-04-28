package unir.presentation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import unir.StandardMathEngine;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorCLITest {
    private CalculatorCLI cli;

    @BeforeEach
    void setUp() {
        cli = new CalculatorCLI(new StandardMathEngine(), new InputParser());
    }

    @Test
    @DisplayName("Debe procesar una entrada correctamente")
    void testProcesarInputCorrecto() {
        String resultado = cli.procesarInput("sumar 10 5");

        assertTrue(resultado.contains("15.0"), "El resultado debe ser 15.0");
    }

    @Test
    @DisplayName("Debe rechazar la división por 0.")
    void testProcesarInputInvalidoPorDivisionPorCero() {
        String resultado = cli.procesarInput("dividir 10 0");
        assertTrue(resultado.contains("No se puede dividir por cero"), "El resultado debe contener el mensaje de error");
    }


}
