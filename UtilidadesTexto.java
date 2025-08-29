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
        System.out.println("1. Verificar si una palabra o frase se lee igual tanto al revés como al derecho (Palíndromo)");
        System.out.println("2. Contar vocales de una frase");
        System.out.println("3. Encriptar texto");
        System.out.println("4. Desencriptar texto");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public static boolean verificarRevesDerecho(String frase) {
        System.out.println("Verificaremos si una palabra o frase se lee de la misma forma al revés y al derecho, ingresa la palabra ");
        String palabraFrase = ingresarString();
        palindromo = palabraFrase.replaceAll("\\s+", "").toLowerCase().StringBuilder.reverse();
        if (palindromo == palabraFrase)
            return true;
        else
            return false;
    }

    public static int contarVocales() {
        System.out.println("Ejecutando el Método 2...");
        String palabraVocales = ingresarString();
        ...
    }

    public static String encriptarTexto() {
        System.out.println("Ejecutando el Método 3...");
        String textoEncriptar = ingresarString();
        ...
    }

    public static String desencriptarTexto() {
        System.out.println("Ejecutando el Método 4...");
        String textoDesencriptar = ingresarString();
        ...
        return te
    }

    public static String ingresarString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la palabra o frase: ");
        String entradaUsuario = scanner.nextLine();
        return entradaUsuario;
    }
}