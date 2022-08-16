import java.util.Scanner;

// 개수 세기 
public class b10807 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 정수의 개수 
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int v = sc.nextInt(); // 찾으려고 하는 정수 

        int count = 0;

        for(int i=0; i<n; i++) {
            if(v == arr[i]) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();

    }
}
