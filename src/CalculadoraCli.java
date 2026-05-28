import java.util.Scanner;

public class CalculadoraCli {
    private final Calculadora calculadora;

    public CalculadoraCli() {
        this.calculadora = new Calculadora();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Calculadora  ===");
        System.out.print("Ingresa el primer número: ");
        double numeroUno = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double numeroDos = scanner.nextDouble();

        System.out.println("Selecciona la operación:");
        System.out.println("1: Sumar");
        System.out.println("2: Restar");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        double resultado;
        switch (opcion) {
            case 1:
                resultado = calculadora.sumar(numeroUno, numeroDos);
                System.out.println("El resultado es: " + resultado);
                break;
            case 2:
                resultado = calculadora.restar(numeroUno, numeroDos);
                System.out.println("El resultado es: " + resultado);
                break;
            default:
                System.out.println("Opción inválida.");
        }
        scanner.close();
    }
}