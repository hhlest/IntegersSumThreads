public class RandomArray {

    public static int[] create(int size) {
        int[] randomNumbersArray = new int[size];
        for (int i = 0; i < randomNumbersArray.length; i++) {
            randomNumbersArray[i] = (int) (Math.random() * 9);
        }
        return randomNumbersArray;
    }

    public static int[] getPart(int[] numbers, double start, double end, int threadsAmount) {
        int[] result = new int[(numbers.length / threadsAmount)];
        int indexNewArray = 0;
        for (int i = (int) (numbers.length * start); i < (int) (numbers.length * end); i++) {
            result[indexNewArray] = numbers[i];
            indexNewArray += 1;
        }
        return result;
    }
}
