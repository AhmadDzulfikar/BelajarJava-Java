public class SwitchLambda {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai) {
            case "A" -> System.out.println("Wow, anda lulus dengan baik");
            case "B", "C" -> System.out.println("Bagus, Anda hebat");
            case "D" -> System.out.println("Anda sudah berjuang dengan hebat");
            default -> {
                System.out.println("Mungkin anda salah jurusan");
            }
        }
    }
}
