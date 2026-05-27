import java.util.Scanner;

public class CalculadoraCli {
    private final Calculadora calculadora;

    public CalculadoraCli() {
        this.calculadora = new Calculadora();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Calculadora CLI ===");
        System.out.print("Ingresa el primer número: ");
        double numeroUno = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double numeroDos = scanner.nextDouble();
        double resultado = calculadora.sumar(numeroUno, numeroDos);
        System.out.println("El resultado: " + resultado);
        scanner.close();
    }
}