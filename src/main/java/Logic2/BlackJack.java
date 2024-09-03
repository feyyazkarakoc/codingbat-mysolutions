package Logic2;

public class BlackJack {

    public static void main(String[] args) {

        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19, 22));

    }

    //solution
    public static int blackjack(int a, int b) {
        if (a <= 21 && b > 21) return a;
        if (b <= 21 && a > 21) return b;
        if (a > b && a < 22) return a;
        if (b > a && b < 22) return b;
        return 0;
    }




  /*  public static int blackjack(int a, int b) {
      if(a>21&&b>21) return 0;
      if(a>21) return b;
      if (b>21) return a;
      return Math.max(a,b);
    }*/
}
