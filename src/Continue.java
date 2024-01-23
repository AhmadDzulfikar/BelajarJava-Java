public class Continue {

    // Membuat hasil hanya angka ganjil
    public static void main(String[] args) {
        for (var counter = 1; counter <= 10; counter++) {
            if (counter % 2 == 0) {
                continue;
            }
            System.out.println("Perulangan ganjil - " + counter);
        }
    }
}
