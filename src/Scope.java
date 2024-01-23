public class Scope {
    public static void main(String[] args) {
        cobaScope("Andi Lukito");
    }

    static void cobaScope(String name) {
        String hello = "Hello " + name;
        if (!name.isBlank()) { // string name tidak kosong
            String hi = "Hi " + name;
            System.out.println(hi);
        }

        System.out.println(hello);
        // System.out.println(hi);
    }


    // Penjelasan scope
    // line 14 masih bisa di print karena hello masih satu block sama yg inisiasiin (line 7)
    // line 15 gabisa dipanggil karena dia beda block / scope sama yg inisiasiin (line 8-12)
}
