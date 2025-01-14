public class UncommonBugSolution {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            if (x == 5) {
                continue; // Skip iteration when x is 5
            }
            System.out.println(x); // Correct output
        }
    }
} 

//Alternative solution using a while loop and managing increment manually
public class UncommonBugSolution2 {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 10) {
            if (x == 5) {
                x++; // Increment manually
                continue;
            }
            System.out.println(x);
            x++;
        }
    }
}