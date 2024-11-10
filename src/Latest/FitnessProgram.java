package Latest;

import java.util.Scanner;
public class FitnessProgram {
    public static double calculateBMI(int weight, int height) {
        return (double) (weight * 10000) / (height * height);
    }
    public static int countAdmitted(int[] heights, int[] weights, int maxBMI) {
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            double bmi = calculateBMI(weights[i], heights[i]);
            if (bmi <= maxBMI) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] heights = new int[N];
        int[] weights = new int[N];
        for (int i = 0; i < N; i++) {
            heights[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            weights[i] = scanner.nextInt();
        }
        int maxBMI = scanner.nextInt();
        int admittedCount = countAdmitted(heights, weights, maxBMI);
        System.out.println(admittedCount);
    }
}