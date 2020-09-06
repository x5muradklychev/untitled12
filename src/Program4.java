import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        int num;
        System.out.println("Ввести число: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        if (num > 0) {
            num++;
        } else if (num < 0) {
            num = num - 2;
        } else {
            num = 10;
        }

        System.out.println(num);
    }
}