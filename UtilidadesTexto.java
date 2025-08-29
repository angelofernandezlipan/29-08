import java.util.Scanner;

public class UtilidadesTexto

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    verificarRevesDerecho();
                    break;
                case 2:
                    contarVocales();
                    break;
                case 3:
                    encriptarTexto();
                    break;
                case 4:
                    desencriptarTexto();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("\n--- Menú de Opciones ---");
        System.out.println("1. Opción 1");
        System.out.println("2. Opción 2");
        System.out.println("3. Opción 3");
        System.out.println("4. Opción 4");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public static void verificarRevesDerecho() {
        System.out.println("Ejecutando el Método 1...");
        sadfsdf
    }

    public static void contarVocales() {
        System.out.println("Ejecutando el Método 2...");
        asdfd
    }

    public static void encriptarTexto() {
        System.out.println("Ejecutando el Método 3...");
        asdf
    }

    public static void desencriptarTexto() {
        System.out.println("Ejecutando el Método 4...");
        gf
    }
}