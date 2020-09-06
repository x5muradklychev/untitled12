import java.util.Scanner;
public class Program6 {
    public static void main(String[]args){
        int a;
        Scanner scn = new Scanner(System.in);
        System.out.println("ведите число :");
        a = scn.nextInt();
        if (a>0 & a%2==0){
            System.out.println("число четное положительное");
        }
        else if (a>0 & a%2!=0){
            System.out.println("число нечетное положительное");
        }
        else if (a<-0 & a%2==0){
            System.out.println("число четное отрицательное");
        }
        else if (a<-0 & a%2!=0){
            System.out.println("число нечетное отрицательное");
        }
        else if (a==0){
            System.out.println("число 0 ");
        }
    }
}