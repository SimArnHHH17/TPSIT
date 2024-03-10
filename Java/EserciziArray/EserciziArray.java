package Java.EserciziArray;

import java.util.Scanner;

public class EserciziArray 
{

    // Metodo per memorizzare 10 int in un array e calcolare la somma degli elementi
    public static int sommaArrayDiDieciInt() 
    {
        // Dichiarazione di un array di 10 interi
        int[] array = new int[10];
        // Inizializzazione della variabile somma a 0
        int somma = 0;
        // Creazione di un oggetto Scanner per leggere input dall'utente
        Scanner scanner = new Scanner(System.in);
        // Richiesta all'utente di inserire 10 numeri interi
        System.out.println("Inserisci 10 numeri interi:");
        // Ciclo per inserire 10 numeri interi nell'array e calcolare la somma
        for (int i = 0; i < 10; i++) 
        {
            array[i] = scanner.nextInt();
            somma += array[i];
        }
        // Restituzione della somma degli elementi dell'array
        return somma;
    }

    // Metodo per memorizzare X int in un array e calcolare la somma degli elementi
    public static int sommaArrayDiNInt(int n) 
    {
        // Dichiarazione di un array di dimensione n
        int[] array = new int[n];
        // Inizializzazione della variabile somma a 0
        int somma = 0;
        // Creazione di un oggetto Scanner per leggere input dall'utente
        Scanner scanner = new Scanner(System.in);
        // Richiesta all'utente di inserire n numeri interi
        System.out.println("Inserisci " + n + " numeri interi:");
        // Ciclo per inserire n numeri interi nell'array e calcolare la somma
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            somma += array[i];
        }
        // Restituzione della somma degli elementi dell'array
        return somma;
    }

    // Metodo per contare il numero di elementi minori di zero in un array di double
    public static int contaElementiMinoriDiZero(double[] array) 
    {
        // Inizializzazione del contatore a 0
        int contatore = 0;
        // Ciclo per scorrere tutti gli elementi dell'array di double
        for (double elemento : array) {
            // Controllo se l'elemento è minore di zero
            if (elemento < 0) {
                // Se l'elemento è minore di zero, incrementa il contatore
                contatore++;
            }
        }
        // Restituzione del numero di elementi minori di zero nell'array
        return contatore;
    }

    // Metodo per trovare il massimo elemento in un array
    public static int trovaMassimo(int[] array) 
    {
        // Inizializzazione del massimo all'elemento in posizione 0 dell'array
        int massimo = array[0];
        // Ciclo per scorrere gli elementi dell'array a partire dalla posizione 1
        for (int i = 1; i < array.length; i++)
        {
            // Controllo se l'elemento corrente è maggiore del massimo attuale
            if (array[i] > massimo) 
            {
                // Se l'elemento corrente è maggiore del massimo, aggiorna il massimo
                massimo = array[i];
            }
        }
        // Restituzione del massimo elemento nell'array
        return massimo;
    }

     // Metodo main per testare i metodi
    public static void main(String[] args) 
    {
        // Test del primo metodo: sommaArrayDiDieciInt()
        System.out.println("La somma degli elementi dell'array di 10 interi è: " + sommaArrayDiDieciInt());

        // Test del secondo metodo: sommaArrayDiNInt(int n)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci la dimensione dell'array di interi: ");
        int dimensione = scanner.nextInt();
        System.out.println("La somma degli elementi dell'array di " + dimensione + " interi è: " + sommaArrayDiNInt(dimensione));

        // Test del terzo metodo: contaElementiMinoriDiZero(double[] array)
        double[] arrayDouble = {1.5, -2.0, 3.7, -4.2, 5.1};
        System.out.println("Il numero di elementi minori di zero nell'array di double è: " + contaElementiMinoriDiZero(arrayDouble));

        // Test del quarto metodo: trovaMassimo(int[] array)
        int[] arrayInt = {10, 20, 30, 40, 50};
        System.out.println("Il massimo elemento nell'array di interi è: " + trovaMassimo(arrayInt));
    }
}