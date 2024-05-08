import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input della stringa da verificare come acronimo
        System.out.println("Inserisci una stringa per verificare se è un acronimo:");
        String inputAcronym = scanner.nextLine().trim();
        
        // Verifica se la stringa è un acronimo
        if(isAcronym(inputAcronym)) {
            System.out.println(inputAcronym + " è un acronimo.");
        } else {
            System.out.println(inputAcronym + " non è un acronimo.");
        }
        
        // Input delle due stringhe da verificare come anagrammi
        System.out.println("\nInserisci la prima stringa:");
        String inputStr1 = scanner.nextLine().trim();
        
        System.out.println("Inserisci la seconda stringa:");
        String inputStr2 = scanner.nextLine().trim();
        
        // Verifica se le due stringhe sono anagrammi
        if(areAnagrams(inputStr1, inputStr2)) {
            System.out.println("Le due stringhe sono anagrammi.");
        } else {
            System.out.println("Le due stringhe non sono anagrammi.");
        }
        
        scanner.close();
    }
    
    // Funzione per verificare se una stringa è un acronimo
    public static boolean isAcronym(String input) {
        return input.matches("[A-Z]+");
    }
    
    // Funzione per verificare se due stringhe sono anagrammi
    public static boolean areAnagrams(String str1, String str2) {
        // Rimuove spazi e converti le stringhe in array di caratteri
        char[] arr1 = str1.replaceAll("\\s", "").toCharArray();
        char[] arr2 = str2.replaceAll("\\s", "").toCharArray();
        
        // Verifica se le lunghezze degli array sono diverse
        if(arr1.length != arr2.length) {
            return false;
        }
        
        // Ordina gli array
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        // Confronta i due array
        return Arrays.equals(arr1, arr2);

    }
}
