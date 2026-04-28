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
        return 0;
    }

    @Override
    public double exponenciar(double exponente) {
        return 0;
    }


}
