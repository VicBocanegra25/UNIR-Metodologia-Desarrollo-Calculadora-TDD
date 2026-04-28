package unir;

public class StandardMathEngine implements MathEngine {
    final double TOLERANCIA = 0.001;

    @Override
    public double sumar(double sumandoUno, double sumandoDos) {
        return sumandoUno + sumandoDos;
    }

    @Override
    public double restar(double minuendo, double sustraendo) {
        return minuendo - sustraendo;
    }

    @Override
    public double multiplicar(double multiplicando, double multiplicador) {
        return multiplicando * multiplicador;
    }

    @Override
    public double dividir(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return dividendo / divisor;
    }

    @Override
    public double calcularRaiz(double radicando) {
        if (radicando < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz de un número negativo.");
        }

        // Caso base: la raíz de 0 es 0
        if (radicando == 0) {
            return 0;
        }

        double aproximacionAnterior;

        double aproximacionActual = radicando;

        do {
            aproximacionAnterior = aproximacionActual;

            double division = dividir(radicando, aproximacionAnterior);
            double suma = sumar(aproximacionAnterior, division);
            aproximacionActual = multiplicar(0.5, suma);
        } while (obtenerValorAbsoluto(restar(aproximacionActual, aproximacionAnterior)) > TOLERANCIA);


        return aproximacionActual;
    }

    @Override
    public double exponenciar(double exponente) {
        return 0;
    }

    // Función auxiliar para obtener el valor absoluto
    @Override
    public double obtenerValorAbsoluto(double numero) {
        return numero < 0 ? multiplicar(numero, -1) : numero;
    }

}
