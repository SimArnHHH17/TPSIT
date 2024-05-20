import java.util.Scanner;

public class Main {

    // Metodo per convertire una stringa in Kebab-case
    // Kebab-case: le parole sono separate da trattini e tutte le lettere sono minuscole.
    public static String toKebabCase(String input) {
        // Converte l'intera stringa in minuscolo e sostituisce gli spazi con trattini.
        return input.toLowerCase().replaceAll("\\s+", "-");
    }

    // Metodo per convertire una stringa in Snake_case
    // Snake_case: le parole sono separate da trattini bassi e tutte le lettere sono minuscole.
    public static String toSnakeCase(String input) {
        // Converte l'intera stringa in minuscolo e sostituisce gli spazi con trattini bassi.
        return input.toLowerCase().replaceAll("\\s+", "_");
    }

    // Metodo per convertire una stringa in CamelCase
    // CamelCase: le parole sono concatenate senza spazi, con la prima lettera di ogni parola (tranne la prima) maiuscola.
    public static String toCamelCase(String input) {
        // Suddivide la stringa in parole utilizzando gli spazi come delimitatori.
        String[] words = input.split("\\s+");
        // Inizializza una StringBuilder con la prima parola in minuscolo.
        StringBuilder camelCaseString = new StringBuilder(words[0].toLowerCase());
        // Itera attraverso le parole dalla seconda in poi.
        for (int i = 1; i < words.length; i++) {
            // Aggiunge la prima lettera maiuscola della parola corrente e il resto della parola in minuscolo.
            camelCaseString.append(words[i].substring(0, 1).toUpperCase())
                            .append(words[i].substring(1).toLowerCase());
        }
        return camelCaseString.toString();
    }

    // Metodo per convertire una stringa in PascalCase
    // PascalCase: le parole sono concatenate senza spazi, con la prima lettera di ogni parola maiuscola.
    public static String toPascalCase(String input) {
        // Suddivide la stringa in parole utilizzando gli spazi come delimitatori.
        String[] words = input.split("\\s+");
        // Inizializza una StringBuilder vuota.
        StringBuilder pascalCaseString = new StringBuilder();
        // Itera attraverso tutte le parole.
        for (String word : words) {
            // Aggiunge la prima lettera maiuscola della parola corrente e il resto della parola in minuscolo.
            pascalCaseString.append(word.substring(0, 1).toUpperCase())
                            .append(word.substring(1).toLowerCase());
        }
        return pascalCaseString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crea un oggetto Scanner per leggere l'input dell'utente.
        System.out.print("Inserisci una stringa: ");
        String input = scanner.nextLine(); // Legge la stringa inserita dall'utente.

        // Stampa le varie conversioni della stringa inserita nei diversi formati.
        System.out.println("Kebab-case: " + toKebabCase(input));
        System.out.println("Snake_case: " + toSnakeCase(input));
        System.out.println("CamelCase: " + toCamelCase(input));
        System.out.println("PascalCase: " + toPascalCase(input));
    }
}
