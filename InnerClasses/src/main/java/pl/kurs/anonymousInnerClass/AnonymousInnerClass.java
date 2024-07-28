package pl.kurs.anonymousInnerClass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        GreetingService greetingService = () -> System.out.println("Hello");

        greetingService.printHello();
    }
}
