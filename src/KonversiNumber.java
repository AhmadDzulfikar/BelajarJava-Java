public class KonversiNumber {
    public static void main(String[] args) {
        
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2; // Gunain (Byte) buat ubah int ke byte yang harusnya gabisa, ini disebut manual
    }
}
