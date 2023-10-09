import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};

        
        List<Integer> list = Arrays.asList(arr);

       
        Collections.shuffle(list);

      
        Integer[] shuffledArray = list.toArray(new Integer[0]);

       
        System.out.println("Shuffled Array: " + Arrays.toString(shuffledArray));
        
        scanner.close();
    }
}
