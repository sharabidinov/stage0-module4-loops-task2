package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int count = 0;
        int result = 1;

        System.out.println(count + 1);
        while (count < printToInclusive) {
            result *= (count + 1);
            System.out.println(result);
            count++;
        }
    }
}
