public class LAB4 {

    public static void main(String[] args) {
        try {
            System.out.println("Statement1");
            System.out.println(1/0);
            System.out.println("Statement3");
        }
        catch (ArithmeticException ex1) {
        }
        catch (IndexOutOfBoundsException ex2) {
            throw ex2;
        }
        finally {
            System.out.println("Statement4");
        }
        System.out.println("Statement5");
    }

}
