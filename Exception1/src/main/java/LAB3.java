public class LAB3 {

    public static void main(String[] args) {
        try{
            int x = 5;
            int y = 0;
            System.out.println(x/y);
        }
        catch(ArithmeticException ex) {
            System.out.println("Exception");
        }
        finally {
            System.out.println("Finally Statement");
        }
        System.out.println("Next Statement");
    }
}
