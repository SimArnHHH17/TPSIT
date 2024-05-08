package Main1; 

import java.util.Scanner; 

public class Main { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Inserisci una stringa: "); // Stampiamo un messaggio per chiedere all'utente di inserire una stringa
        String input = scanner.nextLine(); // Leggiamo la stringa inserita dall'utente e la salviamo nella variabile 'input'

        // Lunghezza della stringa
        int lunghezza = input.length(); // Calcoliamo la lunghezza della stringa e la salviamo nella variabile 'lunghezza'
        System.out.println("Lunghezza della stringa: " + lunghezza); // Stampiamo la lunghezza della stringa

        // Carattere in posizione centrale
        char carattereCentrale = input.charAt(lunghezza / 2); // Troviamo il carattere centrale della stringa e lo salviamo nella variabile 'carattereCentrale'
        System.out.println("Carattere in posizione centrale: " + carattereCentrale); // Stampiamo il carattere centrale

        // Convertiamo in maiuscolo l'iniziale della stringa
        // Convertiamo il primo carattere della stringa in maiuscolo 
        //e lo salviamo nella variabile 'primaMaiuscola' commento per riga 22
        String primaMaiuscola = input.substring(0, 1).toUpperCase() + input.substring(1);
        System.out.println("Stringa con iniziale maiuscola: " + primaMaiuscola); // Stampiamo la stringa con l'iniziale maiuscola

        // Numero di occorrenze del carattere 'a'
        int conteggioA = 0; // Inizializziamo il conteggio delle occorrenze del carattere 'a' a 0
        for (int i = 0; i < lunghezza; i++) { // Iteriamo attraverso tutti i caratteri della stringa
            if (input.charAt(i) == 'a' || input.charAt(i) == 'A') { // Se il carattere corrente è 'a' o 'A'
                conteggioA++; // Incrementiamo il conteggio delle occorrenze
            }
        }
        System.out.println("Numero di occorrenze del carattere 'a': " + conteggioA); // Stampiamo il numero di occorrenze del carattere 'a'

        // Sottostringa dal primo al quarto carattere
        String sottostringa = input.substring(0, 4); // Estraiamo una sottostringa dal primo al quarto carattere della stringa e la salviamo nella variabile 'sottostringa'
        System.out.println("Sottostringa dal primo al quarto carattere: " + sottostringa); // Stampiamo la sottostringa

        // Stringa in maiuscolo
        String maiuscolo = input.toUpperCase(); // Convertiamo la stringa in maiuscolo e la salviamo nella variabile 'maiuscolo'
        System.out.println("Stringa in maiuscolo: " + maiuscolo); // Stampiamo la stringa in maiuscolo

        // Stringa in minuscolo
        String minuscolo = input.toLowerCase(); // Convertiamo la stringa in minuscolo e la salviamo nella variabile 'minuscolo'
        System.out.println("Stringa in minuscolo: " + minuscolo); // Stampiamo la stringa in minuscolo

        // Controllo se la stringa è un palindromo
        boolean palindromo = true; // Inizializziamo la variabile 'palindromo' a true
        for (int i = 0; i < lunghezza / 2; i++) { // Iteriamo attraverso la metà dei caratteri della stringa
            if (minuscolo.charAt(i) != minuscolo.charAt(lunghezza - i - 1)) { // Se i caratteri corrispondenti non sono uguali //metodo che restituisce il carattere nell'indice specificato in una stringa.
                palindromo = false; // La stringa non è un palindromo
                break; // Usciamo dal ciclo
            }
        }
        System.out.println("La stringa è un palindromo? " + palindromo); // Stampiamo se la stringa è un palindromo o no
        scanner.close(); // Chiudiamo lo scanner per liberare le risorse
    } // Fine del metodo main
} // Fine della classe Main
