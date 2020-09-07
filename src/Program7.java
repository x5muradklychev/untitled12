import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        int kod;
        System.out.println("Ввести код города: ");
        Scanner input = new Scanner(System.in);
        kod = input.nextInt();

        int m = 905;
        int r = 194;
        int k = 491;
        int c = 800;

       switch (kod) {
           case 905:
                System.out.println("Москва. Стоимость разговора:" + 10 * 4.15);
           break;
           case 194:
                System.out.println("Ростов. Стоимость разговора:" +  10 *  1.98);
                break;
           case 491:
               System.out.println("Краснодар. Стоимость разговора:" +  10 * 2.69);
               break;
           case 800:
                   System.out.println("Киров. Стоимость разговора:" +  10 *  5.00);
                   break;
           default:
               System.out.printf("Неизвестный код города %d. Попробуйте снова.", kod);
               break;

        }
        input.close();
    }
}
