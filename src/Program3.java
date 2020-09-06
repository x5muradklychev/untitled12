import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        int num;
        System.out.print("Ввести число: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        int i = 1;
        if (num>=0)
            System.out.println(num + i);
        else {
            if (num <= 0) {
                System.out.println(num );
            }
        }
    }
}