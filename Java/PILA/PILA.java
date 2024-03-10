package Java.PILA;

public class PILA 
{
    // Array che vuole rappresentare la pila
    private int[] vet;

    // Dimensione dell'array
    private int size;

    // Indice dell'elemento libero (o dell'eventuale overflow)
    private int fine;

    // Costruttore di default, inizializza la pila con una capacità di 10
    public PILA() 
    {
        this(10);
    }

    // Costruttore con parametro per impostare la capacità della pila
    public PILA(int capacity) 
    {
        size = capacity;
        vet = new int[size];
        fine = -1; // Indice dell'elemento libero inizializzato a -1
    }

    // Metodo per verificare se la pila è vuota
    public boolean isEmpty() 
    {
        return fine == -1;
    }

    // Metodo per verificare se la pila è piena
    public boolean isFull() 
    {
        return fine == size - 1;
    }

    // Metodo per inserire un intero in cima alla pila
    public boolean push(int value) {
        if (!isFull()) {
            fine++;
            vet[fine] = value;
            return true;
        }
        return false;
    }

    // Metodo per rimuovere e restituire l'intero in cima alla pila
    public boolean pop(int[] value) 
    {
        if (!isEmpty()) 
        {
            value[0] = vet[fine];
            fine--;
            return true;
        }
        return false;
    }

    // Metodo per stampare tutti gli elementi della pila
    public void stampa() 
    {
        System.out.println("Elementi nella pila:");
        for (int i = 0; i <= fine; i++) 
        {
            System.out.println("Elemento " + (i + 1) + ": " + vet[i]);
        }
    }
}