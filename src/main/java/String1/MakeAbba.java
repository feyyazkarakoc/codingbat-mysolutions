package String1;

public class MakeAbba {

    public static void main(String[] args) {

        System.out.println(makeAbba("Hi", "Bye"));
        System.out.println(makeAbba("Yo", "Alice"));
        System.out.println(makeAbba("What", "Up"));

    }


    //solution

    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }
}
