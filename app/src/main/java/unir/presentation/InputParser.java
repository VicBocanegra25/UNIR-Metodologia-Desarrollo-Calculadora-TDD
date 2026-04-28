package unir.presentation;

import unir.domain.ParsedCommand;

public class InputParser {
    public ParsedCommand parse(String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException("La entrada no puede estar vacía.");
        }

        String[] parts = input.trim().split("\\s+");

        if (parts.length < 2) {
            throw new IllegalArgumentException("Formato inválido. Use: <operacion> <num1> [num2]");
        }

        String operator = parts[0].toLowerCase();

        // Validación de operación soportada
        if (!esOperacionValida(operator)) {
            throw new IllegalArgumentException("Operación no reconocida: " + operator);
        }

        try {
            double op1 = Double.parseDouble(parts[1]);
            double op2 = (parts.length > 2) ? Double.parseDouble(parts[2]) : 0.0;
            return new ParsedCommand(operator, op1, op2);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Los operandos deben ser números válidos.");
        }
    }

    private boolean esOperacionValida(String operator) {
        return switch (operator) {
            case "sumar", "restar", "multiplicar", "dividir", "raiz", "exp" -> true;
            default -> false;
        };
    }
}
