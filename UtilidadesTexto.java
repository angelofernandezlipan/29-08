import java.util.Scanner;

public class UtilidadesTexto {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } else {
                opcion = 0;
                scanner.nextLine();
            }

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
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }
    }

    public static void mostrarMenu() {
        System.out.println("\nOpciones");
        System.out.println("1. Verificar si una palabra o frase se lee igual al revés y al derecho (Palíndromo)");
        System.out.println("2. Contar vocales de una frase");
        System.out.println("3. Encriptar texto");
        System.out.println("4. Desencriptar texto");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public static String ingresarString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa texto: ");
        return scanner.nextLine();
    }

    public static void verificarRevesDerecho() {
        System.out.println("Verificaremos si una palabra o frase se lee de la misma forma al revés y al derecho.");
        String palabraFrase = ingresarString();
        String normalizada = palabraFrase.replaceAll("\\s", "").toLowerCase();
        String invertida = new StringBuilder(normalizada).reverse().toString();

        if (normalizada.equals(invertida)) {
            System.out.println("'" + palabraFrase + "' es un palíndromo.");
        } else {
            System.out.println("'" + palabraFrase + "' no es un palíndromo.");
        }
    }

    public static void contarVocales() {
        System.out.println("Contaremos las vocales de una frase.");
        String frase = ingresarString();
        int contador = 0;
        String vocales = "aeiouáéíóú"; // Incluye vocales acentuadas

        for (char caracter : frase.toLowerCase().toCharArray()) {
            if (vocales.indexOf(caracter) != -1) {
                contador++;
            }
        }
        System.out.println("La frase contiene " + contador + " vocales.");
    }

    public static void encriptarTexto() {
        System.out.println("Vamos a encriptar texto (las vocales se reemplazarán por símbolos especiales)");
        String texto = ingresarString();
        texto = texto.replace("a", "@").replace("e", "&").replace("i", "->&").replace("o", "->*").replace("u", "->#");
        texto = texto.replace("A", "@").replace("E", "&").replace("I", "->&").replace("O", "->*").replace("U", "->#");
        System.out.println("Texto encriptado: " + texto);
    }

    public static void desencriptarTexto() {
        System.out.println("Vamos a desencriptar texto (inverso de la opción 3)");
        String texto = ingresarString();
        texto = texto.replace("@", "a").replace("&", "e").replace("->&", "i").replace("->*", "o").replace("->#", "u");
        System.out.println("Texto desencriptado: " + texto);
    }
}