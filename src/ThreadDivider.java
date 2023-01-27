public class ThreadDivider {

    public ThreadDivider() {
    }

    public static void createThreadsAndStartCalculation(int[] numbers, int threadsAmount) {

        Thread[] t = new Thread[threadsAmount];
        double divider = 1.0 / threadsAmount;
        double startIndex = 0;
        double endIndex = divider;

        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(new CalculatorThread(RandomArray.getPart(numbers, startIndex, endIndex, threadsAmount)));
            startIndex += divider;
            endIndex += divider;
        }

        for (Thread thread : t) {
            thread.start();
        }

        for (Thread thread : t) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sum = " + CalculatorThread.getSum());
    }

}
