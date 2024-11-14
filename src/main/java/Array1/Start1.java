package Array1;

public class Start1 {

    public static void main(String[] args) {

        System.out.println(start1(new int[]{1, 2, 3}, new int[]{1, 3}));
        System.out.println(start1(new int[]{7, 2, 3}, new int[]{1}));
        System.out.println(start1(new int[]{1, 2}, new int[]{}));

    }


    //solution
    public static int start1(int[] a, int[] b) {

        return a.length > 0 && a[0] == 1
                ? (b.length > 0 && b[0] == 1 ? 2 : 1)
                : (b.length > 0 && b[0] == 1 ? 1 : 0);

    }
}
