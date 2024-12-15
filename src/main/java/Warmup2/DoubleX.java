package Warmup2;

public class DoubleX {

    public static void main(String[] args) {

        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));

    }



    //solution
    public static boolean doubleX(String str) {

        int index = str.indexOf("x");

        return str.length() > 1
                && (index + 1 < str.length())
                && (str.charAt(index + 1) == 'x');

    }
}
