import java.util.Scanner;

// 홀수 
public class b2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean odd = false;

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] % 2 != 0) {
                sum += arr[i];
                odd = true;
            
                if(min > arr[i]) {
                    min = arr[i];
                }
            } 
        }

        if(odd == false) {
            System.out.println(-1);
        } else {
            System.out.println(sum); // 홀수 합 
            System.out.println(min); // 홀수 최소값 
        }
        
        sc.close();

    }
    
}
