package rvt;
import java.util.*;

public class conecticut {
    public static void main(String[] args) {
        Scanner ievade = new Scanner(System.in);

        while (true) {
            System.out.print("Ievadiet dalamo: ");
            String numerator = ievade.nextLine();

            char parbaude = numerator.charAt(0);
            if (parbaude == 'q' || parbaude == 'Q') {
                System.out.println();
                break;
            }

            try {

                int num = Integer.valueOf(numerator);
                System.out.print("Ievadiet dalitaju: ");
                int divisor = Integer.valueOf(ievade.nextLine());

                System.out.println(numerator + " / " + divisor + " is " + num / divisor);
                System.out.println();
            } catch (ArithmeticException ae) {
                System.out.println("You cant divide " + numerator + " by 0. \n");
            } catch (NumberFormatException nfe) {
                System.out.println("You entered bad data.");
                System.out.println("Please try again. \n");
            }

        }

    }
}