import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи число:");
        String a = scan.next();
        int n = a.length();
        System.out.println(Integer.parseInt(a.substring(n -1)));
    }
}

