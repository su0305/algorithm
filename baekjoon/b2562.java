import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 최댓값 
public class b2562 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        List<Integer> arrList = new ArrayList<Integer>();
        int num = 0;

        for(int i=0; i<9; i++) {
            num = sc.nextInt();
            arrList.add(num);
        }

        int max = Collections.max(arrList); // ArrayList에서 최대값 구할 때 : Collections.max()
        System.out.println(max);

        System.out.println(arrList.indexOf(max)+1); // 인덱스 번호 찾을 때 : indexOf()
    
        sc.close();
    } 
}
