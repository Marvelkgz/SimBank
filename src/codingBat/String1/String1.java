package codingBat.String1;

public class String1 {
    static void main() {
        System.out.println(helloName("Bob"));
        System.out.println(makeAbba("a","b"));
        System.out.println(makeTags("apa","ata"));
        System.out.println(extraEnd("elka"));
        System.out.println(firstTwo("sumi"));

    }
    public static String helloName(String name){
        return "Hello " + name + "!!!";
    }
    public static String makeAbba(String a, String b){
        return a + b + b + a;
    }
    public static String makeTags(String tag,String word){
        return "<" + tag + ">" + word + "<" + "/" + tag + ">";
    }
    public  static  String extraEnd(String str){
        String name = str.substring(str.length() - 2);
        return name + name + name;
    }
    public static String firstTwo(String str){
        if (str.length() > 2){
            return str.substring(0,2);
        }
        return str;
    }
}
