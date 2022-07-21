import java.util.Arrays;
import java.util.Scanner;

// 대표값2 
public class b2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;
        int avg = 0;
        

        for(int i=0; i<arr.length; i++) { 
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        avg = sum/arr.length; 
        Arrays.sort(arr);

        System.out.println(avg); 
        System.out.println(arr[2]);
        
    }
}
