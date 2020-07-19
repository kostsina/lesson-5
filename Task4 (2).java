package hw5;
/**
 * Написать функцию linearize, которая принимает в качестве
 * параметра двумерный массив
 * и возвращает одномерный массив со всеми элементами
 * двумерного.
 */
public class Task4 {
    public static void main(String[] args) {
        int[][] nums = {{0, 1, 2}, {3, 4, 5}};
        var arr = linearize(nums);
        printArray(arr);
    }
    
    public static int[] linearize (int[][] nums) {
        int length = 0;
        for (int[] array : nums) {
            length += array.length;
        }
        int[] answer = new int[length];
        int index = 0;
        for (int[] array : nums) {
            for (int num : array) {
                answer[index] = num;
                index++;
            }
        }
        return answer;
    }
    
    public static void printArray (int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
