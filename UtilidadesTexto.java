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
        palindromo = palabraFrase.replaceAll("\\s+", "")
        palindromoMinuscula = palindromo.toLowerCase()
        palindromoInvertido = .palindromoMinuscula.reverse();
        if (palindromoInvertido == palabraFrase)
            return true;
        else
            return false;
    }

    public static void contarVocales() {
        System.out.println("Contaremos las vocales de una frase.");
        String frase = ingresarString();
        int contador = 0;
        String vocales = "aeiou";

        for (char caracter : frase.toLowerCase().toCharArray()) {
            if (vocales.indexOf(caracter) != -1) {
                contador++;
            }
        }
        System.out.println("La frase contiene " + contador + " vocales.");
    }

    public static String encriptarTexto() {
        System.out.println("Vamos a encriptar texto (las vocales se reemplazarán por símbolos especiales)");
        String texto = ingresarString();
        texto = texto.replace("@", "a").replace("&", "e").replace("->&", "i").replace("->*", "o").replace("->#", "u");
        System.out.println("Texto desencriptado: " + texto);
    }

    public static String desencriptarTexto() {
        System.out.println("Vamos a desencriptar texto (inverso de la opción 3)");
        String textoDesencriptar = ingresarString();
        texto = texto.replace("@", "a").replace("&", "e").replace("->&", "i").replace("->*", "o").replace("->#", "u");
        System.out.println("Texto desencriptado: " + texto);
    }

    public static String ingresarString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa texto: ");
        String entradaUsuario = scanner.nextLine();
        return entradaUsuario;
    }
}