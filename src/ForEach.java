public class ForEach {
    public static void main(String[] args) {
        // Contoh menggunakan for manual
        // String[] contohArray = {
        //     "Ahmad", "Dzulfikar", "As", "Shavy",
        //     "Pacarnya", "Samiranadifa"
        // };

        // for (int i = 0; i < contohArray.length ; i++) {
        //     System.out.println(contohArray[i]);
        // }
        

        // Contoh menggunakan for each
        String[] contohArray = {
            "Ahmad", "Dzulfikar", "As", "Shavy",
            "Pacarnya", "Samiranadifa"
        };
        
        for (String isiDisimpandisini : contohArray) {
            System.out.println(isiDisimpandisini);
        }
    }
}
