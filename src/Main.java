public class Main {
    // Задание 1.
    public static void main(String[] args) {
        int[] monthArray = generateRandomArray();
        int sum = 0;
        for (int spendPerDay : monthArray) {
            sum += spendPerDay;
        }
            System.out.printf("Сумма трат за месяц составила %s рублей\n", sum);
        int min = monthArray[0];
        int max = monthArray[0];
        for (int i = 1; i < monthArray.length; i++) {
            if(min > monthArray[i]){
                min = monthArray[i];
            }else if(max < monthArray[i]){
                max = monthArray[i];
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %s рублей. Максимальная сумма трат за день составилa %s рублей\n", min, max);
        double average = (double) sum / monthArray.length;
        System.out.printf("Средняя сумма трат за месяц составила %s рублей\n", average);

    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}