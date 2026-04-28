package unir.presentation;

import unir.domain.ParsedCommand;

public class InputParser {
    public ParsedCommand parse(String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException("La entrada no puede estar vacía.");
        }

        // trim() quita espacios al inicio/final
        // split("\\s+") divide por uno o más espacios en blanco
        String[] parts = input.trim().split("\\s+");

        if (parts.length < 2) {
            throw new IllegalArgumentException("Formato inválido. Use: <operacion> <num1> [num2]");
        }

        try {
            String operator = parts[0].toLowerCase();
            double op1 = Double.parseDouble(parts[1]);
            double op2 = (parts.length > 2) ? Double.parseDouble(parts[2]) : 0.0;

            return new ParsedCommand(operator, op1, op2);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Los operandos deben ser números válidos.");
        }
    }
}
