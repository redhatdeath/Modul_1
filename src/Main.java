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

        System.out.println("Input two numbers:");
        double a1;  //(Binary64, Double precision, double)
        float b1;   //(Binary32, Single precision, float)
        a1 = scanner.nextDouble();          System.out.println("a1 = " + a1);
        b1 = scanner.nextFloat();           System.out.println("b1 = " + b1);

        System.out.println("Input one integer number:");
        char f1 = (char) scanner.nextInt();
        System.out.println("f1 as char: "+ f1);
        System.out.println("f1 as num: " + ( f1 + 0 ));

        System.out.println("Input four integer numbers:");
        long a2;        a2 = scanner.nextLong();        System.out.println("a2 = " + a2);
        int  b2;        b2 = scanner.nextInt();         System.out.println("b2 = " + b2);
        short c2;       c2 = scanner.nextShort();       System.out.println("c2 = " + c2);
        byte d2;        d2 = scanner.nextByte();        System.out.println("d2 = " + d2);


        System.out.println("Arithmetic Math");
        System.out.println("a2+b2=" + (a2 + b2));
        System.out.println("a2-b2=" + (a2 - b2));
        System.out.println("a2*b2=" + (a2 * b2));
        System.out.println("a2/b2*1.0=" + (a2 / b2 * 1.0));
        System.out.println("a2*1.0/b2=" + (a2 * 1.0 / b2));
        System.out.println("a2%b2=" + (a2 % b2));

        System.out.println("Binary Math");
        System.out.println("a2&b2=" + (a2 & b2));
        System.out.println("a2|b2=" + (a2 | b2));
        System.out.println("a2^b2=" + (a2 ^ b2));
        System.out.println("~a2 =" + (~a2));
        System.out.println("a2<<b2=" + (a2 << b2));
        System.out.println("a2>>b2=" + (a2 >> b2));
        System.out.println("a2>>>b2=" + (a2 >>> b2));

        System.out.println(" Replace two numbers:");
        long a = 25, b = 45;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("something magic:");
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("working magic !!!");
    }
}