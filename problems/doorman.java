import java.util.*;

public class doorman {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);


        int limit = Integer.parseInt(s.nextLine());
        String guests = s.nextLine();
        int[] counters = {0,0};
        int population = 0;

        LinkedList<Character> guest_queue = new LinkedList<>();

        for (int i = 0; i < guests.length(); i++){
            guest_queue.add(guests.charAt(i));
        }

        while (! guest_queue.isEmpty()){
            char temp = guest_queue.removeFirst();
            //case for men
            if (temp =='M'){
                counters[0] += 1;
                population += 1;

                if (counters[0] - counters[1] > limit){
                    //the case that the first guest is now the right one to enter
                    counters[0] -= 1;
                    guest_queue.addFirst(temp);
                    population -= 1;

                    //check the second person
                    char next = guest_queue.get(1);
                    if (next == temp)
                        guest_queue.clear();
                    else{
                        guest_queue.remove(1);
                        guest_queue.addFirst(next);
                    }
                }
            }
            //case for women
            else{
                counters[1] += 1;
                population += 1;

                if (counters[1] - counters[0] > limit) {
                    //the case that the first guest is now the right one to enter
                    counters[1] -= 1;
                    guest_queue.addFirst(temp);
                    population -= 1;

                    //check the second person
                    char next = guest_queue.get(1);
                    if (next == temp)
                        guest_queue.clear();
                    else {
                        guest_queue.remove(1);
                        guest_queue.addFirst(next);
                    }
                }
            }
        }
        System.out.println(population);
    }

}
