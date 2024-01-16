public class TipeDataBukanPrimitive {
    public static void main(String[] args) {
        int age = 30;   // Tipe Data Primitive
        Integer ageNew = age;   // Bukan Primitive
        int age2 = ageNew;

        short shortAge = ageNew.shortValue();
        byte byteAge = ageNew.byteValue();
    }
}
