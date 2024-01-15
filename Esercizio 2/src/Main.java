import it.epicode.be.exception.DivZero;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esercizio 2");
        final Logger logger = LoggerFactory.getLogger(Main.class);

        Scanner scanner = new Scanner(System.in);
        int km = 0, carburante = 0;
        try {
            System.out.println("Quanti km hai percorso?");
            km = Integer.parseInt(scanner.nextLine());
            System.out.println("Quanti carburante hai utilizzato?");
            carburante = Integer.parseInt(scanner.nextLine());
            if (carburante == 0) {
                throw new DivZero();
            }

            System.out.println("Ogni litro di carburante ti permette di viaggiare per " + km / carburante + "km");
        } catch (Exception e) {
            logger.error("Errore di tipo: " + e.getMessage());

        } finally {
            scanner.close();
            logger.info("Kilometri percorsi: {}", km);
            logger.info("Carburante utilizzato: {}", carburante);
        }


    }
}