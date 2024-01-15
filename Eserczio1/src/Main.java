import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        System.out.println("Esercizio 1");
        final Logger logger = LoggerFactory.getLogger(Main.class);
        Scanner scanner = new Scanner(System.in);
        int[] arrayRnd = new int[5];
        for (int i = 0; i < 5; i++) {
            Random rdn = new Random();
            arrayRnd[i] = rdn.nextInt(11);
        }

        try {
            loop(scanner, arrayRnd);
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.error("Stato di :" + e);
            loop(scanner, arrayRnd);
        } catch (Exception e) {
            System.out.println("non puoi inserire una stringa");
            loop(scanner, arrayRnd);
        } finally {
            logger.debug(String.valueOf(scanner));
            scanner.close();

        }

    }

    private static void loop(Scanner scanner, int[] arrayRnd) {

        while (true) {
            System.out.println(Arrays.toString(arrayRnd));
            System.out.println("Inserisci un numero da modificare da 1 a 5, 0 per uscire");
            try {
                int input = Integer.parseInt(scanner.nextLine());

                if (input == 0) {
                    System.out.println("Ciclo concluso");
                    break;
                }

                System.out.println(arrayRnd[input - 1]);
                System.out.println("Con quale numero lo vuoi modificare");
                int input2 = Integer.parseInt(scanner.nextLine());
                arrayRnd[input - 1] = input2;
            } catch (NumberFormatException e) {
                System.out.println("Non puoi inserire una stringa. Inserisci un numero valido.");
            }
        }
    }
}
