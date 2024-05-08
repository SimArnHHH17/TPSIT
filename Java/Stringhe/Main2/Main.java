import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Verifica se due stringhe sono uguali ignorando maiuscole/minuscole
        System.out.println("Inserisci la prima stringa:");
        String str1 = scanner.nextLine();
        System.out.println("Inserisci la seconda stringa:");
        String str2 = scanner.nextLine();
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Le due stringhe sono uguali.");
        } else {
            System.out.println("Le due stringhe non sono uguali.");
        }

        // Converte una stringa in un numero intero
        System.out.println("Inserisci una stringa per convertirla in un numero intero:");
        String intStr = scanner.nextLine();
        try {
            int number = Integer.parseInt(intStr);
            System.out.println("Il numero intero ottenuto è: " + number);
        } catch (NumberFormatException e) {
            System.out.println("La stringa inserita non è un numero intero valido.");
        }

        // Converte una stringa in un numero decimale
        System.out.println("Inserisci una stringa per convertirla in un numero decimale:");
        String doubleStr = scanner.nextLine();
        try {
            double decimalNumber = Double.parseDouble(doubleStr);
            System.out.println("Il numero decimale ottenuto è: " + decimalNumber);
        } catch (NumberFormatException e) {
            System.out.println("La stringa inserita non è un numero decimale valido.");
        }

        // Dividi una stringa in parole e stampa ciascuna parola su una riga separata
        System.out.println("Inserisci una frase:");
        String sentence = scanner.nextLine();
        String[] words = sentence.split("\\s+");
        System.out.println("Le parole della frase sono:");
        for (String word : words) {
            System.out.println(word);
        }

        // Stampa i primi 5 caratteri di una stringa
        System.out.println("Inserisci una stringa per stamparne i primi 5 caratteri:");
        String first5 = scanner.nextLine();
        if (first5.length() >= 5) {
            System.out.println("I primi 5 caratteri sono: " + first5.substring(0, 5));
        } else {
            System.out.println("La stringa inserita è troppo corta per avere 5 caratteri.");
        }

        // Stampa gli ultimi 5 caratteri di una stringa
        System.out.println("Inserisci una stringa per stamparne gli ultimi 5 caratteri:");
        String last5 = scanner.nextLine();
        if (last5.length() >= 5) {
            System.out.println("Gli ultimi 5 caratteri sono: " + last5.substring(last5.length() - 5));
        } else {
            System.out.println("La stringa inserita è troppo corta per avere 5 caratteri.");
        }

        // Stampa la parola più lunga di una stringa
        System.out.println("Inserisci una frase per trovare la parola più lunga:");
        String longestWordSentence = scanner.nextLine();
        String[] wordsInSentence = longestWordSentence.split("\\s+");
        String longestWord = "";
        for (String word : wordsInSentence) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("La parola più lunga nella frase è: " + longestWord);
        
        scanner.close();
    }
}
