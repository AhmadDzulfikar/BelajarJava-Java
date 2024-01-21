public class Break {
    public static void main(String[] args) {
        var coin = 1;
        while (true) {
            System.out.println("Ini perulangan ke - " + coin);
            coin++;

            if (coin > 10) {
                break;
            } 
        }

        System.out.println("Perulangan Berhenti");
    }
}
