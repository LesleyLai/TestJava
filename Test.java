public class Test {
    public static void main(String[] args) {
        String hello = "Hello"; // Name shadowing
        int x = 1; // Unused variable
        System.out.println(String.format("%s, %s!!",
                                         hello,
                                         iAmAReallyLongAndUglyJavaIdentifier));
    }

    private static String hello = "Real hello";
    private static String iAmAReallyLongAndUglyJavaIdentifier = "world!!";
}
