public class methodVariableArgument {
    public static void main(String[] args) {
        // int[] values = {81, 86, 53, 44, 54, 77};
        // nilaiRapot("Andi", values);

        nilaiRapot("Zaki", 81, 86, 53, 44, 54, 77);
    }

    // static void nilaiRapot(String name, int[] values) {
    static void nilaiRapot(String name, int... values) {
        var total = 0;
        for (int value : values) {
            total += value;
        }

        var finalResult = total / values.length;

        if (finalResult >= 85) {
            System.out.println("Selamat " + name + " Lulus dengan rata-rata nilai: " + finalResult + " dengan predikat A");
        } else if (finalResult >= 80) {
            System.out.println("Selamat " + name + " Lulus dengan rata-rata nilai: " + finalResult + " dengan predikat A-");
        } else if (finalResult >= 75) {
            System.out.println("Selamat " + name + " Lulus dengan rata-rata nilai: " + finalResult + " dengan predikat B+");
        } else if (finalResult >= 70) {
            System.out.println("Selamat " + name + " Lulus dengan rata-rata nilai: " + finalResult + " dengan predikat B");
        } else if (finalResult >= 65) {
            System.out.println("Selamat " + name + " Lulus dengan rata-rata nilai: " + finalResult + " dengan predikat B-");
        } else if (finalResult >= 60) {
            System.out.println("Selamat " + name + " Lulus dengan rata-rata nilai: " + finalResult + " dengan predikat C+");
        }  else if (finalResult >= 55) {
            System.out.println("Selamat " + name + " Lulus dengan rata-rata nilai: " + finalResult + " dengan predikat C");
        } else if (finalResult >= 40) {
            System.out.println("Maaf " + name + " Belum lulus dengan rata-rata nilai: " + finalResult + " dengan predikat D");
        } else {
            System.out.println("Maaf " + name + " Belum lulus dengan rata-rata nilai: " + finalResult + " dengan predikat E");
        }
    } 
}
