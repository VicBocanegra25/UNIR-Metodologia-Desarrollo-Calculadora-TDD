package unir.domain;

public interface MathEngine {
    double sumar(double sumandoUno, double sumandoDos);
    double restar(double minuendo, double sustraendo);
    double multiplicar(double multiplicando, double multiplicador);
    double dividir(double dividendo, double divisor);
    double calcularRaiz(double radicando);
    double exponenciar (double exponente);
    double obtenerValorAbsoluto(double numero);
}
