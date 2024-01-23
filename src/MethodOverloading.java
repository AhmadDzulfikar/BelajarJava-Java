public class MethodOverloading {
    public static void main(String[] args) {
        sayIntro();
        sayIntro("Rael");
        sayIntro("Ncus", "The");
    }

    static void sayIntro() {
        System.out.println("Nama saya Grok Bambrok, saya handal bermain suling");
    }

    static void sayIntro(String name) {
        System.out.println("Halooo nama saya " + name + " Saya bisa menyembuhkan orang");
    }

    static void sayIntro(String third, String fourth) {
        System.out.println("Hallooo nama saya " + third + " Saya anak raja" + " dan saya " + fourth + " yang paling kuat disini");
    }
}
