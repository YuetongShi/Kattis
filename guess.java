import java.util.Scanner;

public class guess {
    private static int lower = 1;
    private static int higher = 1000;

    public static void main(String[] args){
        for (int i = 0; i < 10; i++){
            //Binary search is the fastest way to find the target
            int mid = (lower + higher)/ 2;
            System.out.println(mid);
            Scanner s = new Scanner(System.in);

            String result = s.nextLine();    //Read the feedback given by the "host"

            if (result.equals("correct"))
                break;
            else if (result.equals("higher"))
                lower = mid;
            else
                higher = mid;
        }
    }
}
