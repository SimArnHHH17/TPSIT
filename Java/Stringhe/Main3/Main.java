import java.util.regex.*; // utilizzo delle espressioni regolari

public class Main {
    public static void main(String[] args) {
        // Test delle funzioni di validazione
        String telefono = "+393331234567"; // Numero di telefono da verificare
        String email = "example@example.com"; // Indirizzo email da verificare
        String url = "https://www.example.com"; // URL da verificare
        String ip = "192.168.1.1"; // Indirizzo IP da verificare
        String codiceFiscale = "RSSMRA80A01H501Z"; // Codice fiscale da verificare
        String iban = "IT60X0542811101000000123456"; // IBAN da verificare
        String isbn13 = "9780134685991"; // ISBN-13 da verificare

        // Stampa dei risultati delle verifiche
        System.out.println("Telefono valido: " + isValidTelefono(telefono)); // Verifica e stampa se il numero di telefono è valido
        System.out.println("Email valida: " + isValidEmail(email)); // Verifica e stampa se l'email è valida
        System.out.println("URL valido: " + isValidURL(url)); // Verifica e stampa se l'URL è valido
        System.out.println("IP valido: " + isValidIP(ip)); // Verifica e stampa se l'indirizzo IP è valido
        System.out.println("Codice Fiscale valido: " + isValidCodiceFiscale(codiceFiscale)); // Verifica e stampa se il codice fiscale è valido
        System.out.println("IBAN valido: " + isValidIBAN(iban)); // Verifica e stampa se l'IBAN è valido
        System.out.println("ISBN-13 valido: " + isValidISBN13(isbn13)); // Verifica e stampa se l'ISBN-13 è valido
    }

    // Verifica se una stringa è un numero di telefono italiano valido
    public static boolean isValidTelefono(String telefono) {
        String regex = "^\\+(?:[0-9] ?){6,14}[0-9]$"; // Espressione regolare per il numero di telefono
        return telefono.matches(regex); // Verifica se il telefono corrisponde alla regex e restituisce il risultato
    }

    // Verifica se una stringa è un indirizzo email valido
    public static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"; // Espressione regolare per l'email
        return email.matches(regex); // Verifica se l'email corrisponde alla regex e restituisce il risultato
    }

    // Verifica se una stringa è un URL valido
    public static boolean isValidURL(String url) {
        String regex = "^(http(s)?://)?([\\w-]+\\.)+[\\w-]+(/[\\w- ;,./?%&=]*)?$"; // Espressione regolare per l'URL
        return url.matches(regex); // Verifica se l'URL corrisponde alla regex e restituisce il risultato
    }

    // Verifica se una stringa è un indirizzo IP valido
    public static boolean isValidIP(String ip) {
        String regex = "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$"; // Espressione regolare per l'indirizzo IP
        return ip.matches(regex); // Verifica se l'indirizzo IP corrisponde alla regex e restituisce il risultato
    }

    // Verifica se una stringa è un codice fiscale italiano valido
    public static boolean isValidCodiceFiscale(String codiceFiscale) {
        String regex = "^[A-Z]{6}\\d{2}[A-Z]\\d{2}[A-Z]\\d{3}[A-Z]$"; // Espressione regolare per il codice fiscale
        return codiceFiscale.matches(regex); // Verifica se il codice fiscale corrisponde alla regex e restituisce il risultato
    }

    // Verifica se una stringa è un codice IBAN italiano valido
    public static boolean isValidIBAN(String iban) {
        String regex = "^IT\\d{2}[A-Z]\\d{10}[0-9A-Z]{12}$"; // Espressione regolare per l'IBAN
        return iban.matches(regex); // Verifica se l'IBAN corrisponde alla regex e restituisce il risultato
    }

    // Verifica se una stringa è un codice ISBN-13 valido
    public static boolean isValidISBN13(String isbn13) {
        String regex = "^(?=(?:\\D*\\d){13}$)[\\d-]+$"; // Espressione regolare per l'ISBN-13
        return isbn13.matches(regex); // Verifica se l'ISBN-13 corrisponde alla regex e restituisce il risultato
    }
}
