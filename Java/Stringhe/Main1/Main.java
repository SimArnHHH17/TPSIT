import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creazione di uno scanner per leggere l'input da tastiera
        Scanner scanner = new Scanner(System.in);
        
        // Lettura della stringa in input
        System.out.print("Inserisci una stringa: ");
        String inputString = scanner.nextLine();
        
        // Stampa della lunghezza della stringa
        System.out.println("Lunghezza della stringa: " + inputString.length());
        
        // Calcolo e stampa del carattere in posizione centrale
        int middleIndex = inputString.length() / 2;
        char middleChar = inputString.charAt(middleIndex);
        System.out.println("Carattere in posizione centrale: " + middleChar);
        
        // Conversione in maiuscolo dell'iniziale della stringa e stampa
        String firstCharUpperCase = inputString.substring(0, 1).toUpperCase() + inputString.substring(1);
        System.out.println("Stringa con iniziale maiuscola: " + firstCharUpperCase);
        
        // Conteggio e stampa del numero di occorrenze del carattere 'a'
        int countA = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == 'a' || inputString.charAt(i) == 'A') {
                countA++;
            }
        }
        System.out.println("Numero di occorrenze di 'a': " + countA);
        
        // Estrazione e stampa della sottostringa dal primo al quarto carattere
        String subString = inputString.substring(0, Math.min(inputString.length(), 4));
        System.out.println("Sottostringa dal primo al quarto carattere: " + subString);
        
        // Conversione della stringa in maiuscolo e stampa
        String upperCaseString = inputString.toUpperCase();
        System.out.println("Stringa in maiuscolo: " + upperCaseString);
        
        // Conversione della stringa in minuscolo e stampa
        String lowerCaseString = inputString.toLowerCase();
        System.out.println("Stringa in minuscolo: " + lowerCaseString);
        
        // Controllo se la stringa è un palindromo
        boolean isPalindrome = true;
        for (int i = 0; i < inputString.length() / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("La stringa è un palindromo.");
        } else {
            System.out.println("La stringa non è un palindromo.");
        }
        
        // Chiudo lo scanner
        scanner.close();
    }
}