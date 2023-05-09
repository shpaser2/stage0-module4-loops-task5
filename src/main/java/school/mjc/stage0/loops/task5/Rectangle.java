package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int y = 1; y <= height; y++) {
            for (int x = 1; x <= length; x++) {
                if (x == 1) {
                    System.out.print(8);
                } else if (x == length) {
                    System.out.println(8);
                } else {
                    if (y == 1 || y == height) {
                        System.out.print(8);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}
