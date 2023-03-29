public class LAB1 {
    public static void main(String[] args) {
//         System.out.println(1/0);
//        int[] list = new int[5];
//        System.out.println(list[5]);
//        String s = "abc";
//        System.out.println(s.charAt(3));
//        Object o = new Object();
//        String d = (String)o;
//        Object o = null;
//        System.out.println(o.toString());
//        System.out.println(1.0/0);
//        System.out.println(quotient(5,0));
    }

    public static int quotient(int number1, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return number1 / number2;
    }

}
