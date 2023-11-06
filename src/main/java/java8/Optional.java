package java8;

public class Optional {
    public static void main(String[] args) {
        test(new Object());
        System.out.println("========");
        test(null);
    }

    private static void test(Object obj) {
        java.util.Optional.ofNullable(obj)
            .ifPresentOrElse(Optional::print, () -> {
                throw new RuntimeException("Custom object is null....");
            });
    }

    private static void print(Object obj) {
        System.out.println("Hello World");
    }
}
