public class Palindrom {
    public static void main(String[] args) {
        System.out.println(isPalin("mala"));
    }


    public static boolean isPalin(String s) {
        if( s.length() == 0 || s.length() == 1) {
            return true;
        } else if(s.charAt(0) != s.charAt(s.length() - 1) ) {
            return false;
        } else {
            return isPalin(s.substring(1, s.length()-1));
        }
    }
}
