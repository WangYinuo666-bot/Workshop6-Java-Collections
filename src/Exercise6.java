/*
 * Workshop 6 - Exercise 6 (Easy)
 * Demonstration program for the class IdentifyMyParts.
 * It runs exactly the code given in the question so the output can be checked.
 */
public class Exercise6 {

    static class IdentifyMyParts {
        public static int x = 7;   // class (static) variable
        public int y = 3;          // instance variable
    }

    public static void main(String[] args) {

        IdentifyMyParts a = new IdentifyMyParts();
        IdentifyMyParts b = new IdentifyMyParts();
        a.y = 5;
        b.y = 6;
        a.x = 1;
        b.x = 2;
        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);
        System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);
    }
}
