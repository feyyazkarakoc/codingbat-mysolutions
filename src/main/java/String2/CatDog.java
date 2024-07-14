package String2;

public class CatDog {

    public static void main(String[] args) {

        System.out.println(catDog("catdog"));
        System.out.println(catDog("catcat"));
        System.out.println(catDog("1cat1cadodog"));


    }

    //solution

    public static boolean catDog(String str) {

        int countCat=0;
        int countDog=0;
        for (int i = 0; i < str.length()-2 ; i++) {

            if ((""+str.charAt(i)+str.charAt(i+1)+str.charAt(i+2)).equals("cat")){
                countCat++;
            }

            if ((""+str.charAt(i)+str.charAt(i+1)+str.charAt(i+2)).equals("dog")){
                countDog++;
            }

        }
        return countCat==countDog;
    }
}
