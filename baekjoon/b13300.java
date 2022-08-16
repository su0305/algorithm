import java.util.Scanner;

// 방 배정 
public class b13300 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 수학여행에 참가하는 학생 수 
        int k = sc.nextInt(); // 한 방에 배정할 수 있는 최대 인원수 
        int ans = 0;
        
        int[][] s = new int[2][7]; // 성별, 학년 
        
        // 학생 수 저장 
        for(int i=0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            s[a][b]++;
        }

        // 필요한 방 개수 계산 
        for(int i=0; i<s.length; ++i) { // 성별 
            for(int j=1; j<s[i].length; ++j) { // 학년 
                // 배정에 필요한 만큼 방의 개수 추가 
                ans += s[i][j] / k;

                // 학생이 남을 경우, 하나의 방이 더 필요하므로 방의 개수 주가 
                if(s[i][j] % k != 0) {
                    ++ans;
                }
            }
        }

        System.out.println(ans);

        sc.close();

    }
}
