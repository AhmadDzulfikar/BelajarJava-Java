public class Escape {
    public static void main(String[] args) {
        // int i = 1;
        int i = 4;
        int j = i++;
        j = ++j + i++;
        System.out.println(i + "," + j);
    }
}
