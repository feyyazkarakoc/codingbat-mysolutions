package Logic2;

public class CloseFar {

    public static void main(String[] args) {

        System.out.println(closeFar(1, 2, 10));
        System.out.println(closeFar(1, 2, 3));
        System.out.println(closeFar(4, 1, 3));

    }


    //solution

    public static boolean closeFar(int a, int b, int c) {
        int x = Math.abs(a - b);
        int y = Math.abs(a - c);
        int z = Math.abs(b - c);
        return (x <= 1 && z >= 2 && y >= 2) || (y <= 1 && z >= 2 && x >= 2) ;
    }
}
