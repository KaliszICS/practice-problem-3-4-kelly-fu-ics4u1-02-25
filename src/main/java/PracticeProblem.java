

	import java.util.HashSet;
	import java.util.Set;

public class PracticeProblem {

   public static void main(String args[]) {

   }

   public static int[] recaman(int n) {
       if (n <= 0){
       return new int[0];
       }

       Set<Integer> seen = new HashSet<>();
       int[] result = new int[n];
       result[0] = 1;
       seen.add(1);

       recamanHelper(result, seen, 1);
       return result;
   }


   public static void recamanHelper(int[] result, Set<Integer> seen, int i){
       if (i >= result.length){
           return;
       }

       int previous = result[i - 1];
       int after = previous - i - 1;
       if (after > 0 && ! seen.contains(after)){
           result[i] = after;
       }
       else{
           result[i]= previous + i + 1;
       }

       seen.add(result[i]);
       recamanHelper(result, seen, i + 1);
      
   }
}




	