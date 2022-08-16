import java.util.Scanner;

// 방 번호 
public class b1475 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int set = sc.nextInt();
        int ans = 1; // N = 0 일때에 대한 예외처리 
        int[] num = new int[10]; // 0부터 9까지 

        // 자리수 추출 
        while(set>0) {
            num[set%10]++; 
            set/=10;
        }

        for(int i=0; i<10; i++) {

            if(i == 6 || i == 9) {
                continue; // 반복문 내에서만 사용될수 있으며, 반복이 진행되는 도중 continue문을 만나면 반복문의 끝으로 이동하여 다음 반복으로 넘어간다
            }

            ans = Math.max(ans, num[i]);
        }

        // (num[6]+num[9])/2를 올림한 값이 6, 9에 대한 필요한 세트의 수이므로 (num[6]+num[9]+1)/2을 계산
        ans = Math.max(ans, (num[6] + num[9] + 1)/2);

        System.out.println(ans);

        sc.close();

    }
}
