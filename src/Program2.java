import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int digit = 0;
        System.out.print("Ввести целое трехзнанчное число: ");
        digit = in.nextInt();
        int D1 = 0;
        int D2 = 0;
        int D3 = 0;
        int G2 = 0;
        D1 = digit / 100;
        D2 = digit % 100;
        G2 = D2 / 10;
        D3 = digit % 10;


        System.out.println(D3 + G2 + D1);

    }
}