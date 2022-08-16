import java.util.Scanner;

// 숫자의 개수 
public class b2577 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int multiply = a*b*c; // A x B x C 결과 

        int[] numArr = new int[10];
        
        // 계산 결과를 자릿수별로 확인하여 저장 
        while(multiply>0) {
            numArr[multiply%10]++;
            multiply/=10;
        }

        for(int i=0; i<10; i++) {
            System.out.println(numArr[i] + " ");
        }

        sc.close();
        
    }
}
