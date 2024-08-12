import java.util.Scanner;

public class commercials {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int P = s.nextInt();
        //System.out.println(N + P);

        int[] radios = new int[N];

        for (int i = 0; i < radios.length; i++){
            radios[i] = s.nextInt() - P;
        }

        int tempMax = 0;  //No interest is the lowest limit

       for (int j = 0; j < radios.length; j++){ //The process to try each starter and find the maximum
           int tempHead = radios[j];
           tempMax = Math.max(tempMax, tempHead);
           if (tempHead > 0){
               int continous = tempHead;
               for (int k = j + 1; k < radios.length; k++){
                   continous += radios[k];  // Try to add the elements behind the current starter
                   if (continous < 0)   
                    /* 
                    The previous elements sum to a zero it is impossible to have larger interests,
                    it is impossible to have larger interests with the given starting element
                    */
                       break;
                   tempMax = Math.max(tempMax, continous);  //Update by every iteration, prevent missing value
               }
           }
       }

       System.out.println(tempMax);
    }
}
