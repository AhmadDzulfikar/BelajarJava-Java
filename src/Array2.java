public class Array2 {
    public static void main(String[] args) {
        // Materi:
        // array[index] => mengambil data array
        // array[index] = value => mengubah di array
        // array.length => mengambil panjang array

        // Mengambil panjang array
        Long[] arrayLong = {
            10L, 20L, 30L
        };

        System.out.println(arrayLong.length);

        // Array didalam array
        String[][] memberGroup = {
            {"Ahmad", "Dzulfikar"},
            {"Samiranadifa", "Azzahra"},
            {"Zidna", "Raisya"}
        };

        String[] member1 = memberGroup[2];
        System.out.println(member1[0]);

        System.out.println(memberGroup[0][1]);
        System.out.println(memberGroup[1][0]);
        
    }
}
