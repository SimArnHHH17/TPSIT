package Main1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa: ");
        String input = scanner.nextLine();

        // Lunghezza della stringa
        int lunghezza = input.length();
        System.out.println("Lunghezza della stringa: " + lunghezza);

        // Carattere in posizione centrale
        char carattereCentrale = input.charAt(lunghezza / 2);
        System.out.println("Carattere in posizione centrale: " + carattereCentrale);

        // Convertiamo in maiuscolo l'iniziale della stringa
        String primaMaiuscola = input.substring(0, 1).toUpperCase() + input.substring(1);
        System.out.println("Stringa con iniziale maiuscola: " + primaMaiuscola);

        // Numero di occorrenze del carattere 'a'
        int conteggioA = 0;
        for (int i = 0; i < lunghezza; i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'A') {
                conteggioA++;
            }
        }
        System.out.println("Numero di occorrenze del carattere 'a': " + conteggioA);

        // Sottostringa dal primo al quarto carattere
        String sottostringa = input.substring(0, 4);
        System.out.println("Sottostringa dal primo al quarto carattere: " + sottostringa);

        // Stringa in maiuscolo
        String maiuscolo = input.toUpperCase();
        System.out.println("Stringa in maiuscolo: " + maiuscolo);

        // Stringa in minuscolo
        String minuscolo = input.toLowerCase();
        System.out.println("Stringa in minuscolo: " + minuscolo);

        // Controllo se la stringa è un palindromo
        boolean palindromo = true;
        for (int i = 0; i < lunghezza / 2; i++) {
            if (minuscolo.charAt(i) != minuscolo.charAt(lunghezza - i - 1)) {
                palindromo = false;
                break;
            }
        }
        System.out.println("La stringa è un palindromo? " + palindromo);
        scanner.close();
    }
    
}
