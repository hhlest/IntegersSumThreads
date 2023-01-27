
public class Main {
    public static void main(String[] args) {
        int[] numbers = RandomArray.create(200_000_000);
        ThreadDivider.createThreadsAndStartCalculation(numbers, 4);
    }
}
