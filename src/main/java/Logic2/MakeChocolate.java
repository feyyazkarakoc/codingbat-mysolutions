package Logic2;

public class MakeChocolate {

    public static void main(String[] args) {

        System.out.println(makeChocolate(4, 1, 9));
        System.out.println(makeChocolate(4, 1, 10));
        System.out.println(makeChocolate(4, 1, 7));

    }


    //solution

    public static int makeChocolate(int small, int big, int goal) {

        int maxBig = goal / 5;
        int usedBig = Math.min(maxBig, big);
        int remain = goal - usedBig * 5;
        return remain <= small ? remain : -1;

    }
}
