public class LatihanKelas
{
    public static void main(String[] args) {
        try{
            int myArray[] = new int[5];
            myArray[6] = 250;
            System.out.println("Value assigned! ");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error occured: " + e.getMessage());
        }
        
    }
}