package codingBat.warmap1;

public class Warmup {
    static void main() {
        System.out.println(sleepIn(true, false));
        System.out.println(monkeyTrouble(true, false));
        System.out.println(sumDouble(2, 2));
        System.out.println(diff21(5));
        System.out.println(parrotTrouble(false, 4));
        System.out.println(makes10(4, 10));
        System.out.println(posNeg(5, 4, true));
        System.out.println(notString("not"));
        System.out.println(missingChar("qwerty",5));
        System.out.println(frontBack("qwerty"));
        System.out.println(parrotTrouble(false,4));
        System.out.println(makes10(4,10));
        System.out.println(nearHundred(100));
    }

    public static boolean sleepIn(boolean weekDay, boolean vacation) {
        if (!weekDay || vacation) {
            return true;
        }
        return false;
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (!aSmile != bSmile) {
            return true;
        }
        return false;
    }

    public static int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            sum = sum * 2;
        }
        return sum;
    }

    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }

    public static boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);

    }

    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    public static String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
        }
        return "not" + str;
    }
public static String missingChar(String str,int n){
        String front = str.substring(0,n);
        String back = str.substring(n + 1,str.length());
        return front + back;
}
public static String frontBack(String str){
        if (str.length() <= 1)return str;
        String mid = str.substring(1,str.length() - 1);
        return str.charAt(str.length() - 1) + mid + str.charAt(0);

}
public static boolean nearHundred(int n){
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
}

}


