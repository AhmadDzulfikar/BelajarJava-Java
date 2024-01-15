public class TipeDataNumber {

    public static void main(String[] args) {

        // Angka biasa
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 10000000;
        long iniLong = 1000000000;
        long iniLong2 = 1000000000L;

        // Angka pecahan
        float iniFloat = 10.10F;
        double iniDouble = 10.10;

        // Angka spesial
        int decimalInt = 25;
        int hexInt = 0xA1232B;
        int binInt = 0b101010;

        // Underscore
        int amount = 1_000_000_000;


        // Konversi Tipe Data
        // Widening Casting (otomatis): byte -> short -> int -> long -> float -> double
        // Narrowing Casting (Manual): bisa dibalik balik kemana aja

        byte iniBytes = 100;
        short iniShorts = iniBytes;
        int iniInts = iniShorts;
        long iniLongs = iniInts;
        
        float iniFloats = iniLongs;
        double iniDoubles = iniFloats;

    }
}