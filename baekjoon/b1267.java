import java.util.Scanner;

// 핸드폰 요금 
public class b1267 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // 통화 개수
        int[] call = new int[num]; // 통화 시간
        int youngsik = 0; // 영식 요금제 
        int minsik = 0; // 민식 요금제

        for(int i=0; i<num; i++) {
            call[i] = sc.nextInt();

            // 영식 요금제 - 30초마다 10원 : ? < 30 -> 10원
                youngsik += 10 * (call[i] / 30 + 1); 
      
            // 민식 요금제 - 60초마다 15원 : ? < 60 -> 15원
                minsik += 15 * (call[i] / 60 + 1);
 
        }
        
        if(youngsik < minsik) {
            System.out.println("Y " + youngsik);
        } else if(minsik < youngsik) {
            System.out.println("M " + minsik);
        } else if(youngsik == minsik) {
            System.out.println("Y M " + youngsik);
        }

        sc.close();

    }
}