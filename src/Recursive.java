public class Recursive {
    public static void main(String[] args) {
        // System.out.println("Factorial with forloop: " + factorial(5));
        // System.out.println();
        // System.out.println("Factorial with recursive: " + factorialWithRecursive(7));
        // System.out.println();
        errorRecursive(10);
    }

    // Factorial with forloop
    static int factorial(int value) {
        var result = 1;
        for (int i = 1 ; i <= value ; i++) {
            result *= i;
        }
        return result;
    }

    // Factorial with recursive
    static int factorialWithRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialWithRecursive(value - 1);
        }
    }

    // Try to make error from recursive
    static void errorRecursive(int value) {
        if (value == 1) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value);
            errorRecursive(value - 1);
        }
    }
}

