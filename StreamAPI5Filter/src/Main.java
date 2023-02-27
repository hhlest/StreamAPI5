
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "84------>hello19++java //world20,,";
        List<Character> list1 = chArrToList(str.toCharArray());

        list1.stream()
                .filter(a -> (96 < a && a < 123)) // ASCII
                .forEach(a -> System.out.print(a));
    }

    public static List<Character> chArrToList (char[] arr) {
        List<Character> list1 = new ArrayList<>();
        for (char it: arr) {
            list1.add(it);
        }
        return list1;
    }
}
