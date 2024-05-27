import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

// Definizione della classe SalaLettura
class SalaLettura {
    // Dichiarazione di un semaforo per gestire i posti disponibili
    private Semaphore semaforo;

    // Costruttore della classe SalaLettura che inizializza il semaforo con il numero di posti disponibili
    public SalaLettura(int postiDisponibili) {
        this.semaforo = new Semaphore(postiDisponibili);
    }

    // Metodo per entrare nella sala di lettura
    public void entra() {
        try {
            // Acquisisce un permesso dal semaforo (decrementa il conteggio dei posti disponibili)
            semaforo.acquire();
            // Stampa un messaggio per indicare che il thread corrente è entrato nella sala di lettura
            System.out.println(Thread.currentThread().getName() + " è entrato nella sala di lettura.");
        } catch (InterruptedException e) {
            // Gestisce le eventuali eccezioni di tipo InterruptedException
            e.printStackTrace();
        }
    }

    // Metodo per uscire dalla sala di lettura
    public void esci() {
        // Stampa un messaggio per indicare che il thread corrente ha lasciato la sala di lettura
        System.out.println(Thread.currentThread().getName() + " ha lasciato la sala di lettura.");
        // Rilascia un permesso al semaforo (incrementa il conteggio dei posti disponibili)
        semaforo.release();
    }
}

// Definizione della classe Studente che estende Thread
class Studente extends Thread {
    // Riferimento alla sala di lettura
    private SalaLettura sala;

    // Costruttore della classe Studente che accetta un'istanza di SalaLettura
    public Studente(SalaLettura sala) {
        this.sala = sala;
    }

    // Metodo run che definisce il comportamento del thread
    public void run() {
        // Chiamata al metodo entra per entrare nella sala di lettura
        sala.entra();
        try {
            // Genera un tempo di lettura casuale tra 1 e 5 secondi
            int tempoLettura = ThreadLocalRandom.current().nextInt(1, 6);
            // Stampa un messaggio per indicare il tempo di lettura
            System.out.println(Thread.currentThread().getName() + " sta leggendo per " + tempoLettura + " secondi.");
            // Simula il tempo di lettura mettendo il thread in stato di sleep
            Thread.sleep(tempoLettura * 1000);
        } catch (InterruptedException e) {
            // Gestisce le eventuali eccezioni di tipo InterruptedException
            e.printStackTrace();
        }
        // Chiamata al metodo esci per lasciare la sala di lettura
        sala.esci();
    }
}

// Classe principale con il metodo main
public class Main {
    public static void main(String[] args) {
        // Creazione di un'istanza di SalaLettura con 3 posti disponibili
        SalaLettura sala = new SalaLettura(3);

        // Creazione e avvio di 5 thread Studente
        for (int i = 0; i < 5; i++) {
            new Studente(sala).start();
        }
    }
}
