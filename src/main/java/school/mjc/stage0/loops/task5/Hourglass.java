package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        long middle = Math.round(height / 2.0);
        int borderLeft = 1;
        int borderRight = height;

        for (int y = 1; y <= height; y++) {
            for (int x = 1; x <= height; x++) {
                if (x < borderLeft || x > borderRight) {
                    System.out.print(" ");
                } else {
                    System.out.print(8);
                }
            }
            System.out.println();

            if (y < middle) {
                borderLeft++;
                borderRight--;
            } else if ((height % 2 == 0 && y > middle) ||
                    (height % 2 != 0 && y >= middle)) {
                borderLeft--;
                borderRight++;
            }
        }
    }
}
