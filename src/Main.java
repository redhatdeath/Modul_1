import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Primitive type
        // byte, short, int, long;
        // float, double;
        // char;
        // boolean;
        // Not primitive -> Others

        // Init input System - input from "console"
        Scanner scanner = new Scanner(System.in);
        boolean f1 = true, f2 = false;
        System.out.println(" f1 && f2 = " + (f1 && f2));
        System.out.println(" f1 || f2 = " + (f1 || f2));
        System.out.println(" f1 ^ f2 = " + (f1 ^ f2));
        System.out.println(" !f1 && f2 = " + (!f1 && f2));
        System.out.println(" f1 && !f2 = " + (f1 && !f2));

        // only one from this two strings: 22 or 23
        boolean f3 = 5 < 8;
        //boolean f3 = 5 > 8;

        if (f3) {
            System.out.println("f3 = " + f3);
        }
        System.out.println("f3 = " + f3);
        System.out.println("f3 = " + f3);
        System.out.println("f3 = " + f3);

        if (f1 ^ f2) {
            // TODO  etye ey
        } else {
            // TODO drhwR
        }


        int x0 = 1, x1 = 2, x2 = 3, x3 = 4, x4 = 5;
        int x = 0;
        if (x < x0) System.out.println("(...,x0]");
        if (x >= x0 & x < x1) System.out.println("[x0,x1)");
        if (x >= x1 & x < x2) System.out.println("[x1,x2)");
        if (x >= x2 & x < x3) System.out.println("[x2,x3)");
        if (x >= x3 & x < x4) System.out.println("[x3,x4)");
        if (x >= x4) System.out.println("[x4,...)");

        // opt
        if (x < x0) System.out.println("(...,x0]");
        else if (x < x1) System.out.println("[x0,x1)");
        else if (x < x2) System.out.println("[x1,x2)");
        else if (x < x3) System.out.println("[x2,x3)");
        else if (x < x4) {
            System.out.println("[x3,x4)");
        } else System.out.println("[x4,...)");
        switch (x) {
            case 0:
                System.out.println(" It case 0");
                break;
            case 1:
                System.out.println(" It case 1");
                break;
            case 2:
                System.out.println(" It case 2");
                break;
            case 3:
                System.out.println(" It case 3");
                break;
            case 4:
                System.out.println(" It case only 4");
            case 5:
                System.out.println(" It case 4 or 5");
                break;
            default:
                System.out.println(" It case other");
        }
        //ternar operation
        // (<question>?<true>:<false>)
        while (true) {
            System.out.print("input X:\n");
            int y = scanner.nextInt();
            System.out.println(
                    (y % 5 == 0)
                            ? ((y % 2 == 0) ? "kratno 10" : "kranto 5")
                            : "ne kratno");

        }
    }
}