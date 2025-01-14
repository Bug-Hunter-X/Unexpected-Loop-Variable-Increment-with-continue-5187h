public class UncommonBug {
    public static void main(String[] args) {
        int x = 0;
        while (x++ < 10) {
            if (x == 5) {
                continue; // Skip iteration when x is 5
            }
            System.out.println(x); // Print x, but the value of x is incremented by continue.
        }
    }
}