public class OperasiMatematika {
    public static void main(String[] args) {

        // Operasi Matematika biasa
        int a = 10;
        int b = 5;

        System.out.println(a + b );
        System.out.println(a - b );
        System.out.println(a * b );
        System.out.println(a / b );
        System.out.println(a % b );


        int c = 100;

        c += 10;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);

        String amba = "nasi goreng";
        System.out.println(amba);

        // Unary Operator
        int d = 10;
        int e = -5;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);

        e--;
        System.out.println(e);

        System.out.println(!true);
        System.err.println(!false);
    }
}
