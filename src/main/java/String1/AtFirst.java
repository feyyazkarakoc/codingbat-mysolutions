package String1;

public class AtFirst {

    public static void main(String[] args) {

        System.out.println(atFirst("hello"));
        System.out.println(atFirst("hi"));
        System.out.println(atFirst("h"));


    }

    //solution

    public static String atFirst(String str) {

        if (str.isEmpty()){
            return "@@";
        } else if (str.length()==1){
            return str+"@";
        }else {
            return str.substring(0,2);
        }
    }

}
