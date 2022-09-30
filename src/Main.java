import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean flag = false;
        int iter_count = 0;

        double x, dx, fx;
        //WHILE
        //Wrong !!!!!!!!!!!!!!!:
        // while(true){}
        // while(true);

        // start position for work
        x = 3.0;
        dx = 16.0;
        fx = x * x - 4 * x + 2;
        System.out.println("Start work WHILE !!!");
        System.out.println("f( " + x + " ) = " + fx);
        while (!flag && (Math.abs(fx) > 0.0000000001)) {
            System.out.println("While");
            if ((++iter_count) > 100) { flag = true;  continue; }
            System.out.print("it works " + iter_count + " time(s);\t");
            if (fx > 0) {      x -= dx; dx /= 2;  }
            else if (fx < 0) { x += dx; dx /= 2;  }
            else {             flag = true;       }
            fx = x * x - 4 * x + 2;
            System.out.println("f( " + x + " ) = " + fx);
        }
        //DO-WHILE
        // start position for work
        x = 3.0;
        dx = 16.0;
        fx = x * x - 4 * x + 2;
        System.out.println("Start work DO-WHILE!!!");
        System.out.println("f( " + x + " ) = " + fx);
        do {
            System.out.println("Do-While");
            if ((++iter_count) > 100) { flag = true;  continue; }
            System.out.print("it works " + iter_count + " time(s);\t");
            if (fx > 0) {      x -= dx; dx /= 2;  }
            else if (fx < 0) { x += dx; dx /= 2;  }
            else {             flag = true;       }
            fx = x * x - 4 * x + 2;
            System.out.println("f( " + x + " ) = " + fx);
        }
        while (!flag && (Math.abs(fx) < 0.0000000001));


        int y;
        Scanner scanner = new Scanner(System.in);
        // Wrong !!!!!!!!!!!!!!!
        // But Simply
        while (true) {
            y = scanner.nextInt();
            switch (y % 10) {
                case 0:                    System.out.print("param 0 and; ");
                case 5:                    System.out.print("param 5 ; ");                    break;
                case 6:                    System.out.print("param 6; ");                     break;
                case 3:
                case 9:                    System.out.print("param 3 or 9; ");                break;
                default:                   System.out.print("param other; ");
            }
        }
        // This is error by IDE
        System.out.println("You never read this message");
    }
}

