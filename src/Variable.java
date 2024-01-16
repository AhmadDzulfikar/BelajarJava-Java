public class Variable {
    public static void main(String[] args) {
        // Secara Tidak Langsung
        String name;
        name = "Ahmad Dzulfikar As Shavy";

        // Secara Langsung
        int umur = 18;
        String alamat = "JL. Perak X No.92";
        name = "Samiranadifa Azzahra";


        System.out.println(name);
        System.out.println(umur);
        System.out.println(alamat);

        // Var harus langsung inisiasi data!!!
        var firstName = "Ahmad Dzulfikar";
        var lastName = "As Shavy";
        var semester = 2;

        // Tidak boleh seperti ini !!!!!!!!!!
        // var company;
        // company = "Microsoft"

        // Final tidak bisa diubah datanya, akan menyebabkan error
        final String programming_leanguage = "Java";

        // programming_leanguage = "python"; // error

    }
}
