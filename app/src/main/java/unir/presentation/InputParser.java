package unir.presentation;

import unir.domain.ParsedCommand;

public class InputParser {
    public ParsedCommand parse(String input) {
        String[] args = input.split(" ");
        String operator = args[0];
        double operand1 = Double.parseDouble(args[1]);
        double operand2 = (args.length > 2) ? Double.parseDouble(args[2]) : 0;
        return new ParsedCommand(operator, operand1, operand2);
    }
}
