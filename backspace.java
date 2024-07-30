import java.util.*;

public class backspace {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String massage = s.nextLine();

        ArrayList<Character> parsing = new ArrayList<>();
        for (int i = 0; i < massage.length(); i++) {
            if (massage.charAt(i) != '<') {
                parsing.add(massage.charAt(i));
            }
            else{
                parsing.removeLast();
                /*
                Kattis might not accept removeLast,
                if you get a compile error, change parsing.removeLast() into the statement below:
                parsing.remove(parsing.size()-1);
                 */
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : parsing) {
            result.append(c);
        }
        System.out.println(result);
    }
}
