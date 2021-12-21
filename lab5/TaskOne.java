package lab_5;

import java.util.Arrays;

public class TaskOne {

    public static void main(String[] args) {
        System.out.println(findUnique(new double[] {1, 1, 1, 1, 1, 7, 1, 1, 1, 1, 1}));
        System.out.println(findUnique(new double[] {0, 0, 0.55, 0, 0}));
        System.out.println(findUnique(new double[] {8, 1, 1, 1, 1, 1}));
        System.out.println(findUnique(new double[] {1, 1, 4}));
        System.out.println(findUnique(new double[] {1, 1, 1, 2, 1, 1}));
    }

    private static double findUnique(double[] array) {
        double[] targetArray = Arrays.stream(array).sorted().toArray();
        return targetArray[targetArray.length - 1];
    }

}
