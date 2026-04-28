package unir.presentation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import unir.domain.ParsedCommand;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InputParserTest {

    @Test
    @DisplayName("Debe parsear correctamente una operación básica con dos operandos.")
    void testParseOperacionBasica() {
        InputParser parser = new InputParser();
        ParsedCommand cmd = parser.parse("sumar 10.5 5.5");

        assertEquals("sumar", cmd.operator());
        assertEquals(10.5, cmd.operand1());
        assertEquals(5.5, cmd.operand2());
    }

    @Test
    @DisplayName("Debe manejar operaciones de un solo operando como raíz o exp")
    void testParseUnSoloOperando() {
        InputParser parser = new InputParser();
        ParsedCommand cmd = parser.parse("raiz 16");

        assertEquals("raiz", cmd.operator());
        assertEquals(16.0, cmd.operand1());
        assertEquals(0.0, cmd.operand2());
    }


    @Test
    @DisplayName("Debe lanzar excepción si los operandos no son números")
    void testParseEntradaInvalida() {
        InputParser parser = new InputParser();

        assertThrows(IllegalArgumentException.class, () -> {
            parser.parse("sumar hola 5");
        }, "Debe fallar si el operando no es un número real");
    }

    @Test
    @DisplayName("Debe ser inmune a espacios extra en la entrada")
    void testParseEspaciosExtra() {
        InputParser parser = new InputParser();
        ParsedCommand cmd = parser.parse("   sumar    5    10   ");

        assertEquals("sumar", cmd.operator());
        assertEquals(5.0, cmd.operand1());
        assertEquals(10.0, cmd.operand2());
    }

    @Test
    @DisplayName("Debe lanzar una excepción si la operación no es reconocida")
    void testOperacionNoSoportada() {
        InputParser parser = new InputParser();

        // "porcentaje" no está en nuestra lista de operaciones permitidas
        assertThrows(IllegalArgumentException.class, () -> {
            parser.parse("porcentaje 5.0 6");
        }, "Debe fallar al recibir una operación no soportada");
    }
}
