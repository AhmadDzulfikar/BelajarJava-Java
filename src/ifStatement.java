public class ifStatement {
    public static void main(String[] args) {
        var matdis1 = 98;
        var kalkulus2 = 99;

        if(matdis1 >= 85 && kalkulus2 >= 85){
            System.out.println("Nilai anda A");
        } else if(matdis1 >= 80 && kalkulus2 >= 80){
            System.out.println("Nilai anda A-");
        } else if(matdis1 >= 75 && kalkulus2 >= 75){
            System.out.println("Nilai anda B+");
        } else if(matdis1 >= 70 && kalkulus2 >= 70){
            System.out.println("Nilai anda B");
        } else if(matdis1 >= 65 && kalkulus2 >= 65){
            System.out.println("Nilai anda B-");
        } else if(matdis1 >= 60 && kalkulus2 >= 60){
            System.out.println("Nilai anda C+");
        } else if(matdis1 >= 55 && kalkulus2 >= 55){
            System.out.println("Nilai anda C");
        } else if(matdis1 >= 40 && kalkulus2 >= 40){
            System.out.println("Nilai anda D");
        } else {
            System.out.println("Nilai anda E");
        }
    }
}
