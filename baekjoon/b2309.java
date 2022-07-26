import java.util.Arrays;
import java.util.Scanner;

// 일곱 난쟁이 
public class b2309 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[9];
        int[] result = new int[7];
 
        for(int i=0; i<num.length; i++) {
            num[i] = sc.nextInt();
        }

        // 9명 중 2명을 뺀 조합 고려 
        for(int a=0; a<num.length-1; a++) { 
            int total = 0;

            for(int b=a+1; b<num.length; b++) {
                total = 0;

                // 나머지 7명 저장 
                for(int c=0, i=0; c<num.length; c++) {
                    if(c != a && c != b) {
                        result[i++] = num[c];
                    }
                }

                for(int i=0; i<num.length-2; i++) {
                    total += result[i];
                }

                // 7명의 키의 합이 100인 경우 
                if(total == 100) break;            
            }

            if(total == 100) break;
        }

        Arrays.sort(result);
        for(int i=0; i<result.length; i++) {
            System.out.println(result[i]);
        }

        sc.close();

    }
}
