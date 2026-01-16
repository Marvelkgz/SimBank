package codingBat.warmap1;

public class Warmup {
    static void main() {
        System.out.println(sleepIn(true,false));
    }
  public static boolean sleepIn(boolean weekDay,boolean vacation){
        if (!weekDay || vacation){
            return true;
        }
        return false;
  }
}

