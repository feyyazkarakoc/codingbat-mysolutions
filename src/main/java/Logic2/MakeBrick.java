package Logic2;

public class MakeBrick {

    public static void main(String[] args) {

        System.out.println(makeBrick(3,1,8));
        System.out.println(makeBrick(3,1,9));
        System.out.println(makeBrick(3,2,10));

    }

    public static boolean makeBrick(int small,int big,int goal){
        int maxBigBricks=big/5;
        int usedBigBricks=Math.min(maxBigBricks,big);
        int remainingSmallBrick=goal-usedBigBricks;
        return remainingSmallBrick<=small;
    }
}
