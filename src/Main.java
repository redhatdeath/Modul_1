import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //  Step 1
        for (int i = 1, j = 1; i < 1025; i *= 2, j *= 3)            arif_summ(i + 0, j + 0);
        for (int i = 1, j = 1; i < 1025; i *= 2, j *= 3)            arif_summ(i * 1.0, j * 1.0);
        int a = 20, b = 40;
        System.out.println("int a+b=" + arif_summ(a + 0, b + 0));
        System.out.println("double a+b=" + arif_summ(a * 1.0, b * 1.0));
        //  Step 2
        int[] data = {a, b};
        System.out.printf("in main before: a=%d,b=%d\n", a, b);
        arif_change(a, b);
        System.out.printf("in main after: a=%d,b=%d\n", a, b);
        System.out.printf("in main before: data = " + Arrays.toString(data) + "\n");
        int[] data1 = Arrays.copyOf(data, 2);
        arif_change(data1);
        System.out.printf("in main after: data = " + Arrays.toString(data) + "\n");
        //  Step 3
        read_args(args);
    }
    // Methods from Step 1
    // public static int - return a value type 'int'
    public static int arif_summ(int a, int b) {
        return a + b;
    }
    // void - work without control
    //    public static void arif_summ(int a, int b) {
    //        System.out.printf("%-4d+%-5d=%5d\n", a, b, a + b);
    //    }
    // public static double - return a value type 'double'
    public static double arif_summ(double a, double b) {
        return a + b;
    }
    // void - work without control
    //    public static void arif_summ(double a, double b) {
    //        System.out.printf("%-9.3f+%10.3f=%-10.3f\n", a, b, a + b);
    //    }
    // Methods from Step 2
    // Work with primitive type: byte,short,int,long,char,float,double
    public static void arif_change(int a, int b) {
        System.out.printf("in method before: a=%d,b=%d\n", a, b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.printf("in method after: a=%d,b=%d\n", a, b);
    }
    //  Work with objects: String, Array and other
    public static void arif_change(int[] data) {
        System.out.printf("in method before: data = " + Arrays.toString(data) + "\n");
        data[0] ^= data[1];
        data[1] ^= data[0];
        data[0] ^= data[1];
        System.out.printf("in method after: data = " + Arrays.toString(data) + "\n");
    }
    // Step 3
    public static void read_args(String[] args) {
        if (args.length != 0)
            for (String s : args)
                System.out.println(s);
        else System.out.println("args is empty");
    }
}