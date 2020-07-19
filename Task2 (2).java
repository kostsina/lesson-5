package hw5;
/**
 * 2. Написать программу, удаляющую все повторяющиеся целые
 * числа из массива и печатающую результат. Массив должен
 * использоваться тот же самый. На место удаленных элементов
 * ставить цифру 0.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 4, 5, 6, 6, 7};
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < i; j++) {
                if (num[i] == num[j]) {
                    num [i] = 0;
                }
            }
        }
        printArray(num);
    }

    public static void printArray (int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
