package hw5;
/**
 * 3. Заданы 2 массива целых чисел произвольной длины. 
 *     Написать программу, создающую третий массив,
 * представляющий собой слияние 2-х заданных.
 * Пример:
 * 1-й массив: {1, 2, 3, 4, 5}
 * 2-й массив: {5, 6, 7}
 * Результат: {1, 5, 2, 6, 3, 7, 4, 5}
 */
public class Task3 {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        int nums2[] = {5, 6, 7};
        int length = nums.length + nums2.length;
        int[] result = new int[length];
        int minLength = Math.min(nums.length, nums2.length);
        int index = 0;
        for (int i = 0; i < minLength; i++) {
            result[index] = nums[i];
            index++;
            result[index] = nums2[i];
            index++;
        }
        if (nums.length>nums2.length) {
            for (int i = minLength; i < nums.length; i++) {
                result[index] = nums[i];
                index++;
            }
        }
        else {
            for (int i = minLength; i < nums2.length; i++) {
                result[index] = nums2[i];
                index++;
            }
        }
        printArray(result);
    }
    
    public static void printArray (int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
