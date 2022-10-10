import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static boolean flagMain;
    private static final double numberDoubleByDefault;
    private static double input_d;
    private static long input_l;
    private static final long numberLongByDefault;
    private static final Scanner scanner;

    static {
        flagMain = false;
        numberDoubleByDefault = Double.MAX_VALUE;
        numberLongByDefault = Long.MAX_VALUE;
        input_l = numberLongByDefault;
        input_d = numberDoubleByDefault;
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        while (!flagMain) {
            showMainDialog();
            workWithChoice(
                    readInputUserChoice()
            );
        }
    }

    private static void showMainDialog() {
        System.out.println("Hello !!! Please, make your choice:");
        System.out.println("Press key \"1\" to input Integer number");
        System.out.println("Press key \"2\" to input Float number");
        System.out.println("Press key \"3\" to Exit program");
    }

    private static int readInputUserChoice() {
        int input = 0;
        boolean flagReadInputUserChoice = false;
        while (!flagReadInputUserChoice) {
            // read input data as string without space
            String input_s = scanner.next();
            // local scanner to read int from string without space
            Scanner sc_str = new Scanner(input_s);
            try {
                input = sc_str.nextInt();
                flagReadInputUserChoice = true;
            } catch (InputMismatchException IME) {
                System.err.println("Wrong symbol(s): \"" + input_s + "\".\n");
                showMainDialog();
            }
        }
        return input;
    }

    private static void workWithChoice(int choice) {
        switch (choice) {
            case 1:
                //TODO input integer number
                readIntegerNumberFromIO();
                break;
            case 2:
                //TODO input float number
                readFloatNumberFromIO();
                break;
            case 3:
                //TODO Exit program
                stopProgram();
                break;
            default:
                //TODO work with error
                workWithError();
                break;
        }
    }

    // case 1
    private static void readIntegerNumberFromIO() {
        boolean flagIntegerNumberFromIO = false;
        boolean inputChange = false;
        while (!flagIntegerNumberFromIO) {
            System.out.println("Input integer number:");
            // read input data as string without space
            String input_s = scanner.next();
            // local scanner to read int from string without space
            Scanner sc_str = new Scanner(input_s);
            try {
                input_l = sc_str.nextLong();
                inputChange = true;
            } catch (InputMismatchException IME) {
            }
            if (inputChange) {
                System.out.println("You input the value - " + input_d);
                flagIntegerNumberFromIO = true;
            } else {
                System.err.println("Wrong symbol(s): \"" + input_s + "\".\n");
            }
        }
    }

    // case 2
    private static void readFloatNumberFromIO() {
        boolean flagReadFloatNumberFromIO = false;
        boolean inputChange;
        while (!flagReadFloatNumberFromIO) {
            System.out.println("Input float number:");
            String data = scanner.next();
            // read float number with '.'
            inputChange = readFloatNumber(data, Locale.CANADA);
            // read float number with ','
            if (!inputChange)
                inputChange = readFloatNumber(data, Locale.FRANCE);
            // show, what was input
            if (inputChange) {
                System.out.println("You input the value - " + input_d);
                flagReadFloatNumberFromIO = true;
            } else
                System.out.println("You input not a number");
        }
    }

    private static boolean readFloatNumber(String input, Locale locale) {
        boolean inputChange = false;
        Scanner sc_ca = new Scanner(input).useLocale(locale);
        try {
            input_d = sc_ca.nextDouble();
            inputChange = true;
        } catch (Exception ignored) {
        }
        return inputChange;
    }

    // case 3
    private static void stopProgram() {
        flagMain = true;
        System.out.println("Your choice is 3. Exit program.");
    }

    // case default
    private static void workWithError() {
        System.err.println("Wrong choice. Try again!\n");
    }
}