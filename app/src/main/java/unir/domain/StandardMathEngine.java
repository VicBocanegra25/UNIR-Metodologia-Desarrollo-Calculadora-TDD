package unir.domain;

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
        double suma = 1.0;
        double termino = 1.0;
        int n = 1;

        while (obtenerValorAbsoluto(termino) > TOLERANCIA) {
            // Se calcula el siguiente término de la serie: Tn = T{n-1} * (x / n)
            double division = dividir(exponente, n);
            termino = multiplicar(termino, division);

            suma = sumar(suma, termino);
            n++;

            // Si se rebasan las 100 iteraciónes, significa que no hubo convergencia y se detiene el loop
            if (n > 100) {
                break;
            }
        }
        return suma;
    }

    // Función auxiliar para obtener el valor absoluto
    @Override
    public double obtenerValorAbsoluto(double numero) {
        return numero < 0 ? multiplicar(numero, -1) : numero;
    }

}
