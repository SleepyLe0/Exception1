import jdk.swing.interop.SwingInterOpUtils;

public class LAB6 {

    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e);
            StackTraceElement[] st = e.getStackTrace();
            for (StackTraceElement ste : st) {
                System.out.println(ste.getClassName());
                System.out.println(ste.getMethodName());
                System.out.println(ste.getFileName());
                System.out.println(ste.getLineNumber());
            }
        }
    }
}
