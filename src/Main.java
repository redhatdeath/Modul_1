import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // no def from stupid users
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        while (!flag) {
            System.out.println("What are you want input:");
            System.out.println("Press key \"1\" to Integer number");
            System.out.println("Press key \"2\" to Float number");
            System.out.println("Press key \"3\" to Exit program");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Your choice is 1. Input integer number:");
                    long a = scanner.nextLong();
                    System.out.println("You input the value - " + a);
                    break;
                case 2:
                    System.out.println("Your choice is 2. Input float number:");
                    double d = Double.MAX_VALUE;
                    String data = scanner.next();
                    // read float number with '.'
                    Scanner sc_ca = new Scanner(data).useLocale(Locale.CANADA);
                    // read float number with ','
                    Scanner sc_fr = new Scanner(data).useLocale(Locale.FRANCE);
                    try {
                        d = sc_ca.nextDouble();
                    } catch (Exception ignored) {
                    }
                    if (d == Double.MAX_VALUE)
                        try {
                            d = sc_fr.nextDouble();
                        } catch (Exception ignored) {
                        }
                    if (d != Double.MAX_VALUE)
                        System.out.println("You input the value - " + d);
                    else
                        System.out.println("You input not a number");
                    break;
                case 3:
                    System.out.println("Your choice is 3. Exit program.");
                    flag = true;
                    break;
                default:
                    System.out.println("Wrong value. Please, retry)");
            }
        }
    }
}