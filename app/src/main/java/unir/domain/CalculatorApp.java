package unir.domain;

import unir.StandardMathEngine;
import unir.presentation.CalculatorCLI;
import unir.presentation.InputParser;

public class CalculatorApp {

    public static void main(String[] args) {
        StandardMathEngine engine = new StandardMathEngine();
        InputParser inputParser = new InputParser();
        CalculatorCLI cli = new CalculatorCLI(engine, inputParser);

        cli.iniciar();
    }
}
