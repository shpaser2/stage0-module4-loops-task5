package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        long middle = Math.round(sideLength / 2.0);

        for (int y = 1; y <= sideLength; y++) {
            for (int x = 1; x <= sideLength; x++) {
                if (y == middle) {
                    if (x != sideLength) {
                        System.out.print(8);
                    } else {
                        System.out.println(8);
                    }
                } else {
                    if (x == middle) {
                        System.out.print(8);
                    } else {
                        if (x == sideLength) {
                            System.out.println(" ");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
            }
        }
    }
}
