package Warmup2;

public class Last2 {

    public static void main(String[] args) {

        System.out.println(last2("hixxhi"));
        System.out.println(last2("xaxxaxaxx"));
        System.out.println(last2("axxxaaxx"));
    }




    //solution
    public static int last2(String str) {

        int count = 0;
        int idx = str.length() - 2;

        for (int i = 0; i < idx; i++) {

            if (str.substring(i, i + 2).equals(str.substring(idx))) {

                count++;

            }

        }

        return count;

    }
}
