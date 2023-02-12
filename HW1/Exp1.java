// Написать программу вычисления n-ого треугольного числа.
import java.util.Scanner;
public class Exp1 {
    public static void main(String[] args) {
        int n = get_void(); 
        int calculation = n*(n+1)/2;
        String res = String.format("вычисления %d-ого треугольного числа = %d \n", n, calculation);
        System.out.println(res);
        }

    public static int get_void() {
         Scanner iScanner = new Scanner(System.in);
         System.out.printf("int n: ");
         boolean flag = iScanner.hasNextInt();
         System.out.println(flag);
         int i = iScanner.nextInt();
         iScanner.close();
        return i;
         }
}
