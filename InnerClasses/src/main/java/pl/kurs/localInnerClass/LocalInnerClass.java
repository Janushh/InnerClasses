package pl.kurs.localInnerClass;

import java.util.Arrays;

public class LocalInnerClass {
    public static void main(String[] args) {
        int number = 10;
        class LocalClass {
            @Override
            public String toString() {
                return "Argumenty: " + Arrays.toString(args) + number;
            }
        }

        LocalClass localClass = new LocalClass();
        System.out.printf(localClass.toString());
    }
}
