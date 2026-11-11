/*
 * Workshop 6 - Exercise 7 (Medium)
 * Driver class: contains main() and makes calls to the Boxes class.
 */
public class Exercise7 {

    public static void main(String[] args) {

        // test 1: a 5 x 5 box created by the constructor
        Boxes box = new Boxes(5);
        System.out.println("Box size: " + box);
        box.draw();
        System.out.println();

        // test 2: the same object, size changed to 8 x 8
        box.setSize(8);
        System.out.println("Box size: " + box);
        box.draw();
        System.out.println();

        // test 3: the biggest allowed box (10 x 10)
        Boxes big = new Boxes(Boxes.MAX_SIZE);
        System.out.println("Box size: " + big);
        big.draw();
        System.out.println();

        // test 4: a size above the maximum is rejected
        try {
            Boxes invalid = new Boxes(12);
            invalid.draw();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid box: " + e.getMessage());
        }

        // extension: the Unicode line character \u2500 version
        System.out.println();
        Boxes unicodeBox = new Boxes(6);
        System.out.println("Box size (Unicode line): " + unicodeBox);
        unicodeBox.drawUnicode();
    }
}
