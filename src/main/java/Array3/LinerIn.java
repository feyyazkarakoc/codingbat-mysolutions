package Array3;

public class LinerIn {

    public static void main(String[] args) {

        System.out.println(linearIn(new int[]{1, 2, 4, 6},new int[]{2, 4}));
        System.out.println(linearIn(new int[]{1, 2, 4, 6},new int[]{2, 3, 4}));
        System.out.println(linearIn(new int[]{1, 2, 4, 4, 6},new int[]{2, 4}));


    }


    // solution :
    public static boolean linearIn(int[] outer,int[] inner) {

        int innerIndex = 0;

        for (int num : outer) {

            if (innerIndex < inner.length && num == inner[innerIndex]) {
                innerIndex++;

            }

            if (innerIndex == inner.length) {
                return true;
            }

        }

        return false;
    }
}
