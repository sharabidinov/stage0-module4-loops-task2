package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i = 0;
        int two = 1;
        if (power < 0) {
            System.out.println("too much power");
        } else {
            System.out.println(two);
            while (i < power) {
                two *= 2;
                System.out.println(two);
                i++;
            }
        }
    }
}
