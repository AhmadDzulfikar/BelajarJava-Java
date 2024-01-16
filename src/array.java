public class array {
    public static void main(String[] args) {

        // Cara 1
        String[] arrayString;
        arrayString = new String[4];
        arrayString[0] = "Ahmad";
        arrayString[1] = "Dzulfikar";
        arrayString[2] = "As";
        arrayString[3] = "Shavy";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[3]);

        // Cara 2
        String[] namaNama = {
            "Ahmad", "Dzulfikar", "As", "Shavy"
        };

        System.out.println(namaNama[2]);

        // Cara 2 with Int
        int[] angkaUltah = {
            19, 03
        };

        System.out.println(angkaUltah[0]);

        long[] arrayLong = {
            10L, 20L, 30L
        };


        
    }
}
