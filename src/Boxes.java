/*
 * Workshop 6 - Exercise 7 (Medium)
 * The Boxes class: draws a square box on the console.
 * The maximum size is 10.
 */
public class Boxes {

    public static final int MAX_SIZE = 10;
    public static final int MIN_SIZE = 1;

    private int size;

    // constructor that accepts the size of the box
    public Boxes(int size) {
        setSize(size);
    }

    // method that sets the size of the box
    public void setSize(int size) {
        if (size < MIN_SIZE || size > MAX_SIZE) {
            throw new IllegalArgumentException(
                "Box size must be between " + MIN_SIZE + " and " + MAX_SIZE + ", but was " + size);
        }
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    // returns the size of the box as a String, e.g. "10 x 10"
    @Override
    public String toString() {
        return size + " x " + size;
    }

    // draws the box with '-' for the top/bottom and '|' for the sides
    public void draw() {
        for (int row = 0; row < size; row++) {
            if (row == 0 || row == size - 1) {
                System.out.println(repeat('-', size));      // top and bottom
            } else {
                System.out.println("|" + repeat(' ', size - 2) + "|");   // sides
            }
        }
    }

    // extension: the same box drawn with the Unicode line character \u2500
    public void drawUnicode() {
        char top = '\u2500';
        char side = '\u2502';
        for (int row = 0; row < size; row++) {
            if (row == 0 || row == size - 1) {
                System.out.println(repeat(top, size));
            } else {
                System.out.println(side + repeat(' ', size - 2) + side);
            }
        }
    }

    // small helper: a String made of the same character repeated n times
    private static String repeat(char c, int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + c;
        }
        return s;
    }
}
