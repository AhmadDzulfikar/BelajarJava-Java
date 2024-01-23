public class MethodReturnValue {
    public static void main(String[] args) {
        // Cara print yg pertama
        var hasil = perhitungan(100, 100);
            System.out.println("total dari method perhitungan adalah " + hasil);
        
        // Cara print yang kedua
        System.out.println(perhitungan(200, 200));

        // Print method yang kedua
        System.out.println(perhitunganOperasi(300, "+", 300));
        System.out.println(perhitunganOperasi(400, "-", 150));
        System.out.println(perhitunganOperasi(10, "operasiDefault", 10));   // Default
    }

    static int perhitungan(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static int perhitunganOperasi(int isi1, String operasi, int isi2) {
        switch (operasi) {
            case "+":
                return isi1 + isi2;
            case "-":
                return isi1 - isi2;
            default:
                return 0;
        }
    }
}
