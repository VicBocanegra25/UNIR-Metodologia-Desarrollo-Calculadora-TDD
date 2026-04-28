package unir.presentation;

import unir.domain.MathEngine;
import unir.domain.StandardMathEngine;
import unir.domain.ParsedCommand;

import java.util.Scanner;

public class CalculatorCLI {
    private final MathEngine engine;
    private final InputParser inputParser;

    public CalculatorCLI(StandardMathEngine standardMathEngine, InputParser inputParser) {
        this.engine = standardMathEngine;
        this.inputParser = inputParser;
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Calculadora TDD (UNIR) ---");
        System.out.println("Uso: <operacion> <num1> <num2>. Escriba 'salir' para finalizar.");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("salir")) break;

            System.out.println(procesarInput(input));
        }
    }

    public String procesarInput(String input) {
        try {
            ParsedCommand cmd = inputParser.parse(input);
            double resultado = switch (cmd.operator()) {
                case "sumar" -> engine.sumar(cmd.operand1(), cmd.operand2());
                case "restar" -> engine.restar(cmd.operand1(), cmd.operand2());
                case "multiplicar" -> engine.multiplicar(cmd.operand1(), cmd.operand2());
                case "dividir" -> engine.dividir(cmd.operand1(), cmd.operand2());
                case "raiz" -> engine.calcularRaiz(cmd.operand1());
                case "exponenciar" -> engine.exponenciar(cmd.operand1());
                default -> throw new IllegalStateException("Operación no soportada: " + cmd.operator());
            };
            return "\nResultado: " + resultado + "\n";
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
