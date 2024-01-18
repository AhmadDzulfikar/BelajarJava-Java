public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Excellent!");
                break;
            case "B":
            case "C":
                System.out.println("Great!");
                break;
            case "D":
                System.out.println("Good Job!");
                break;
            default:
                System.out.println("You Must study really hard!!!");
                break;
        }
    }
}
