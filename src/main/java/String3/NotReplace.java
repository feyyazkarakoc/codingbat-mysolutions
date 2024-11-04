package String3;

public class NotReplace {

    public static void main(String[] args) {

        System.out.println(notReplace("is test"));
        System.out.println(notReplace("is-is"));
        System.out.println(notReplace("This is right"));
    }


    //solutions


    public static String notReplace(String str) {

        return str.replaceAll("\\bis\\b", "is not");

    }






    /* public static String notReplace(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (str.equals("is")) {

                sb.append("is not");
                i++;

            } else if (i == 0 && i + 2 < str.length() && str.startsWith("is") && !Character.isLetter(str.charAt(i + 2))) {

                sb.append("is not");
                i++;

            } else if (i > 0 && i + 2 < str.length() && str.substring(i, i + 2).equals("is") && !Character.isLetter(str.charAt(i - 1)) && !Character.isLetter(str.charAt(i + 2))) {

                sb.append("is not");
                i++;

            } else if (i > 0 && i == str.length() - 2 && str.substring(i, i + 2).equals("is") && !Character.isLetter(str.charAt(i - 1))) {

                sb.append("is not");
                i++;

            } else {

                sb.append(str.charAt(i));
            }

        }

        return sb.toString();


    }*/








/*  \\b ifadesi, kelime sınırlarını belirtir. Bu sayede, "is" sadece bir kelime olarak yer alıyorsa değiştirilir. "this" gibi bir kelimenin içindeki "is" ifadesini değiştirmez.
\\b ifadesi bir düzenli ifade (regex) tanımıdır ve "kelime sınırı" anlamına gelir. Yani, bir kelimenin başını veya sonunu belirtir. Bu sayede "is" ifadesini yalnızca bağımsız bir kelime olarak bulup değiştirebiliriz.



\b, düzenli ifadelerde bir kelime sınırını ifade eder.
Java'da ters bölü (\) özel bir karakter olduğu için, regex içinde kullanmak istediğimizde iki kez yazmamız gerekir (\\). Bu yüzden \\b şeklinde yazarız.
\\b ifadesi, bir kelimenin başlangıcı veya sonu gibi bir sınır olduğunu belirtir. Harf, rakam veya alt çizgi (_) olmayan bir karakter ile çevrili bir konumu işaret eder.*/



    /*replaceAll metodu, String içinde belirtilen deseni (örneğin, regex) bulup yerine belirtilen yeni değeri koyarak değiştirilmiş yeni bir String döndürür.

Ancak, String sınıfı değiştirilemez (immutable) olduğu için replaceAll gibi metotlar aslında orijinal String'i değiştirmez; onun yerine yeni bir String nesnesi döndürür. Yani replaceAll, orijinal String üzerinde bir değişiklik yapmaz, fakat yapılan değişiklikleri içeren yeni bir String döndürür.

Özetle:
Orijinal String değişmez: replaceAll orijinal String üzerinde bir değişiklik yapmaz.
Yeni bir String döndürür: Değişiklik yapılmış hali yeni bir String olarak döndürülür.
Örneğin:

String original = "This is a test.";
String modified = original.replaceAll("\\bis\\b", "is not");

System.out.println("Original: " + original);  // Output: "This is a test."
System.out.println("Modified: " + modified);  // Output: "This is not a test."
Bu örnekte, original String değişmeden kalır ve modified değişkeni, replaceAll sonucu elde edilen yeni String’i tutar.*/



}
