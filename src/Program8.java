/*
import java.util.*;

public class Program8 {
    public static void main(String[] args) {

        int[] age = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        OptionalInt max = Arrays.stream(age).max();
        System.out.println("максимальное значение массива:" + max.getAsInt());
        int negative = 0;
        long sum = 0l;
        int positive = 0;
        for (int i : age) {
            if (i < 0) negative++;
            if (i > 0) {
                positive++;
                sum += i;
            }
        }
        System.out.println("Cумма положительных элементов массива: " + sum);
        int counter = 0;
        for (int i = 0; i < age.length; i++) {
            if (age[i] > 0)
                counter += 1;
        }
        System.out.println("Количество положительных элементов в массиве:" + counter);


        int sumNeg = 0;
        for (int i = 0; i < age.length; i++) {
            if (age[i] < 0)
                if (age[i] < -0 & age[i] % 2 == 0) {
                    sumNeg = sumNeg + age[i];
                }
        }
        System.out.println("сумму четных отрицательных элементов: " + sumNeg);
        int ssum = 0;
        double mas = 0;

        for (int i = 0; i < age.length; i++) {
            if (age[i] < 0) {
                ssum += age[i];
            }
        }
        mas = ssum / age.length;
        System.out.println("Cреднее арифметическое отрицательных элементов:" + ssum / mas );
    }
}
*/
public class Program8 {
    public static void main(String[] args) {

        int[] numbers = { 1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2 };

        int i;

        int max = numbers[0];
        int sumPos = 0;
        int sumNegEven = 0;
        int sumNeg = 0;
        int countPosElem = 0;
        double avgNeg = 0;

        for (i = 0; i < numbers.length; i++) {
            // максимальное значение
            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] >= 0) {
                // - сумма положительных элементов
                sumPos += numbers[i];
                // - количество положительных элементов
                countPosElem++;
            } else {
                // - сумма четных отрицательных элементов
                if (numbers[i] % 2 == 0) {
                    sumNegEven += numbers[i];
                }
                sumNeg += numbers[i];
            }
        }

        // среднее арифметическое отрицательных элементов
        avgNeg = (double) sumNeg / (numbers.length - countPosElem);

        System.out.println("Максимальное значение массива: " + max);
        System.out.println("Cумма положительных элементов массива: " + sumPos);
        System.out.println("Количество положительных элементов: " + countPosElem);
        System.out.println("Cумма четных отрицательных элементов: " + sumNegEven);
        System.out.printf("Cреднее арифметическое отрицательных элементов: %.2f", avgNeg);
    }
}