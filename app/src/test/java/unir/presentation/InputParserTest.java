package unir.presentation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import unir.domain.ParsedCommand;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
