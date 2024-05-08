import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa:");
        String input = scanner.nextLine();
        
        System.out.println("Stringa in kebab-case: " + toKebabCase(input));
        System.out.println("Stringa in snake_case: " + toSnakeCase(input));
        System.out.println("Stringa in CamelCase: " + toCamelCase(input));
        System.out.println("Stringa in PascalCase: " + toPascalCase(input));
        
        scanner.close();
    }
    
    public static String toKebabCase(String input) {
        return input.replaceAll("\\s+", "-").toLowerCase();
    }
    
    public static String toSnakeCase(String input) {
        return input.replaceAll("\\s+", "_").toLowerCase();
    }
    
    public static String toCamelCase(String input) {
        StringBuilder result = new StringBuilder();
        String[] words = input.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if (i == 0) {
                result.append(words[i].toLowerCase());
            } else {
                result.append(Character.toUpperCase(words[i].charAt(0))) // metodo che restituisce il carattere nell'indice specificato in una stringa.
                      .append(words[i].substring(1).toLowerCase());
            }
        }
        return result.toString();
    }
    
    public static String toPascalCase(String input) {
        StringBuilder result = new StringBuilder();
        String[] words = input.split("\\s+");
        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0))) // metodo che restituisce il carattere nell'indice specificato in una stringa.
                  .append(word.substring(1).toLowerCase());
        }
        return result.toString();
    }
}

