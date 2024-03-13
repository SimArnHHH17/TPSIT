import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // crea un nuovo oggetto Scanner per leggere l'input dell'utente
        System.out.print("Inserisci una stringa: ");
        final String input = scanner.nextLine(); // legge l'intera riga di input come una stringa
        scanner.close(); // chiude lo Scanner per liberare risorse di sistema

        // stampa la lunghezza della stringa
        System.out.println("Lunghezza: " + input.length());

        // calcola l'indice del carattere centrale
        int midIndex = input.length() / 2;
        if (input.length() % 2 == 1) {
            // stampa il carattere centrale se la stringa ha un numero dispari di caratteri
            System.out.println("Carattere centrale: " + input.charAt(midIndex));
        } else {
            // stampa i caratteri centrali se la stringa ha un numero pari di caratteri
            System.out.println("Caratteri centrali: " + input.charAt(midIndex - 1) + ", " + input.charAt(midIndex));
        }

        // converte in maiuscolo l'iniziale della stringa
        String capitalized = input.substring(0, 1).toUpperCase() + input.substring(1);
        System.out.println("Iniziale maiuscola: " + capitalized);

        // conta il numero di occorrenze del carattere 'a' nella stringa
        int countA = 0;
        for (char c : input.toCharArray()) {
            if (c == 'a') {
                countA++;
            }
        }
        System.out.println("Occorrenze del carattere 'a': " + countA);

        // estrae la sottostringa dal primo al quarto carattere
        String substring = input.substring(0, Math.min(4, input.length()));
        System.out.println("Sottostringa: " + substring);

        // converte la stringa in maiuscolo
        String upperCase = input.toUpperCase();
        System.out.println("Stringa in maiuscolo: " + upperCase);

        // converte la stringa in minuscolo
        String lowerCase = input.toLowerCase();
        System.out.println("Stringa in minuscolo: " + lowerCase);

        // verifica se la stringa è un palindromo
        boolean isPalindrome = input.equals(new StringBuilder(input).reverse().toString());
        System.out.println("La stringa è un palindromo: " + isPalindrome);
    }
}