public class Yield {
    public static void main(String[] args) {
        var nilai = "A";

        String ucapan = switch (nilai) {
            case "A":
                yield "Wow, anda lulus dengan baik";
            case "B", "C":
                yield "Bagus, Anda hebat";
            case "D":
                yield "Anda sudah berjuang dengan hebat";
            default:
                yield "Mungkin anda salah jurusan";
        };       

        System.out.println(ucapan);
    }
}
