import java.util.Scanner;

public class NumberTree {
    /*
    The class name and file name has been reformatted, 
    feel free to change if you want to test my solution on Kattis
     */
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);

        String line = s.nextLine();

        String[] inputs = line.split(" ", 2);

        int height = Integer.parseInt(inputs[0]);
        int heap_size = (int) Math.pow(2, height+1);
        String path = inputs[1];

        int heap_index = 1;  //heap index 1 is the root of the tree

       for (int i = 0; i < path.length(); i++){
           char temp = path.charAt(i);
           if (temp == 'L')
               heap_index = heap_index * 2;
           else
               heap_index = heap_index * 2 + 1;
       }

       if (height != 30)
           System.out.println(heap_size - heap_index);
       else
           /*
           Since only height 30 exceeds the limit of int, I separated this case
           If you want a larger heap yourself, use "long" instead and change the code by yourself
            */
          
           System.out.println(Integer.MAX_VALUE - heap_index + 1);
    }

}
