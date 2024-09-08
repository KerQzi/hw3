public class HW3 {
    public static void main(String[] args) {
        double[] numbers = {8.5, 2.9, -0.2, 3.5, -33.4, 4.6, -20.1, 3.93, -7.8, -99.5, 6.1, -1.1, 9.9, -60.3, 9.4};
        boolean firstNegative = false;
        double sum = 0;
        int count = 0;
        double average;

        for (double num : numbers) {
            if (num < 0) {
                firstNegative = true;
            } else if (firstNegative && num > 0) {
                sum += num;
                count++;
            }
        }

        average = sum / count;
        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
    }
}
