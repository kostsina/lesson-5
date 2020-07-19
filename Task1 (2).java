package hw5;
/**
 * 1. Напишите программу, которая циклически сдвигает элементы
 * массива вправо на одну позицию, и печатает результат.
 * Цикличность означает, что последний элемент массива становится
 * самым первым его элементом.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] num = {2, 4, 6, 5, 4};
        int last = num[num.length - 1];
        for (int i = num.length - 1; i >= 1; i--) {
            num[i] = num[i-1];
        }
        num[0] = last;
        printArray(num);
    }
    
    public static void printArray (int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
