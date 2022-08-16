import java.util.Arrays;
import java.util.Scanner;

// 두 수의 합 

/**
 * 투 포인터(Two Pointers) 알고리즘 
 * 
 * 리스트에 순차적으로 접근해야 할 때 두 개의 점의 위치를 기록하면서 처리하는 알고리즘
 * 정렬되어있는 두 리스트의 합집합에도 사용된다.
 * 병합정렬(merge sort)의 counquer 영역의 기초가 되기도 한다.
 * 
 * 출처 : https://butter-shower.tistory.com/226
 */
public class b3273 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 수열의 크기 
        int[] contain = new int[n]; // 수열에 포함되는 수 
    
        for(int i=0; i<n; i++) {    
            contain[i] = sc.nextInt();
        }

        int x = sc.nextInt(); 

        Arrays.sort(contain);

        int start = 0;
        int end = n - 1;
        int sum = 0;
        int result = 0;

        while(start < end) {
            sum = contain[start] + contain[end];
            
            if(sum == x) { 
                result ++; // 두 수의 합이 x인 경우 - result+1 & start+1
                start ++;
            } else if(sum <= x) { 
                start ++; // 두 수의 합이 x보다 큰 경우 - 더 큰 값을 더해야하므로 start+1
            } else { 
                end --; // 두 수의 합이 x보다 작은 경우 - 더 작은 값을 더해야하므로 end-1
            }
        } 

        System.out.println(result);

        sc.close();

    }
}
