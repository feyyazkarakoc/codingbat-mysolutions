package String2;

public class CountHi {

    public static void main(String[] args) {

        System.out.println(countHi("abc hi ho"));
        System.out.println(countHi("ABChi hi"));
        System.out.println(countHi("hihi"));

    }

    //solutions

    public static int countHi(String str) {

        int count=0;
        for (int i = 0; i < str.length() ; i++) {
            if ((i!=str.length()-1)&&(""+str.charAt(i)+str.charAt(i+1)).equals("hi")){
                count++;
            }
        }
        return count;

    }

}
