import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//      for("input/start";"output/exit";"step" ){
//          //TODO work in for
//      }
//      for (int i = 0; i < 10; i++)
//          System.out.println(" i = " + i);
//      int j =0;
//      for (; j < 10; j++)
//          System.out.println(" j = " + j);

//      for (;;)
//          System.out.println("UNLIMITED!!!");
        int size = 10;
        int[] ar = new int[size];
//      for (int i = 0; i < ar.length; i++) {     //
        for (int i = 0; i < size; i++) {
            ar[i] = (int) ((Math.random() * 5) + 5);//Math.random(); [0;1)->[0;5)->[5;10)
        }
//  Arrays - class-helper for work with 'arrays': output data from array in 'string' view
        System.out.println(Arrays.toString(ar));
//  Arrays - class-helper for work with 'arrays': sort array from min to max
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
    }
}

