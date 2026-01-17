package codingBat.String1;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class String1 {
    static void main() {
        System.out.println(helloName("Bob"));
        System.out.println(makeAbba("a", "b"));
        System.out.println(makeTags("apa", "ata"));
        System.out.println(extraEnd("elka"));
        System.out.println(firstTwo("sumi"));

        System.out.println(firstHalf("BobTom"));
        System.out.println(withoutEnd("Hello"));
        System.out.println(comboString("hi","Bob"));
        System.out.println(nonStart("hello","world"));
        System.out.println(left2("hello"));
        System.out.println(right2("hello"));

    }

    public static String helloName(String name) {
        return "Hello " + name + "!!!";
    }

    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "<" + "/" + tag + ">";
    }

    public static String extraEnd(String str) {
        String name = str.substring(str.length() - 2);
        return name + name + name;
    }

    public static String firstTwo(String str) {
        if (str.length() > 2) {
            return str.substring(0, 2);
        }
        return str;
    }

    public static String firstHalf(String str) {
        if (str.length() % 2 == 0) {
            return str.substring(0, str.length() / 2);
        }
        return str;
    }
    public static String withoutEnd(String str){
        if (str.length() >= 2){
            return str.substring(1,str.length() - 1);
        }
        return str;
    }
    public static String comboString(String a,String b){
        if (a.length() > b.length()){
            return b + a + b;
        }
        return a + b + a;
    }
public static String nonStart(String a,String b){
        return a.substring(1) + b.substring(1);
}
public static String left2(String str){
        return str.substring(2) + str.substring(0,2);
}
public static String right2(String str){
        return str.substring(str.length() - 2) + str.substring(0,str.length() - 2);
}
}