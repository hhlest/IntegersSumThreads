public class RandomArray {

    public static int[] create(int size) {
        int[] randomNumbersArray = new int[size];
        for (int i = 0; i < randomNumbersArray.length; i++) {
            randomNumbersArray[i] = (int) (Math.random() * 9);
        }
        return randomNumbersArray;
    }

    public static int[] getPart1(int[] numbers) {
        int[] result = new int[numbers.length / 4];
        int indexNewArray = 0;
        for (int i = 0; i < numbers.length / 4; i++) {
            result[indexNewArray] = numbers[i];
            indexNewArray += 1;
        }
        return result;
    }

    public static int[] getPart2(int[] numbers) {
        int[] result = new int[numbers.length / 2];
        int indexNewArray = 0;
        for (int i = numbers.length / 4; i < numbers.length / 2; i++) {
            result[indexNewArray] = numbers[i];
            indexNewArray += 1;
        }
        return result;
    }

    public static int[] getPart3(int[] numbers) {
        int[] result = new int[(int) (numbers.length * 0.75)];
        int indexNewArray = 0;
        for (int i = numbers.length / 2; i < numbers.length * 0.75; i++) {
            result[indexNewArray] = numbers[i];
            indexNewArray += 1;
        }
        return result;
    }

    public static int[] getPart4(int[] numbers) {
        int[] result = new int[numbers.length / 4];
        int indexNewArray = 0;
        for (int i = (int) (numbers.length * 0.75); i < numbers.length; i++) {
            result[indexNewArray] = numbers[i];
            indexNewArray += 1;
        }
        return result;
    }
}
