public class OperasiBoolean {
    public static void main(String[] args) {
        // Operator Boolean:
        // && => Dan
        // || => Atau
        // ! => Kebalikan


        // & = kayak AND di matdis
        // || = kayak OR di matdis
        // ! = NOT di matdis

        // Contoh Program Sederhana

        var nilaiUts = 70;
        var nilaiUas = 80;

        boolean lulusUts = nilaiUts >= 65;
        boolean lulusUas = nilaiUas >= 80;

        var lulus = lulusUts && lulusUas;
        System.out.println(lulus);

        // true = lulus

        
    }
}
